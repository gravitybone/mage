package mage.cards.w;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import mage.MageInt;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.effects.common.DamagePlayersEffect;
import mage.abilities.effects.common.GainLifeEffect;
import mage.constants.SubType;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.TargetController;
import mage.constants.WatcherScope;
import mage.constants.Zone;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.watchers.Watcher;

/**
 *
 * @author TheElk801
 */
public final class WhisperingSpy extends CardImpl {

    public WhisperingSpy(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{B}");

        this.subtype.add(SubType.VAMPIRE);
        this.subtype.add(SubType.ROGUE);
        this.power = new MageInt(1);
        this.toughness = new MageInt(3);

        // When you surveil for the first time in a turn, Whispering Spy deals 1 damage to each opponent and you gain 1 life.
        this.addAbility(new WhisperingSpyTriggeredAbility());
    }

    public WhisperingSpy(final WhisperingSpy card) {
        super(card);
    }

    @Override
    public WhisperingSpy copy() {
        return new WhisperingSpy(this);
    }
}

class WhisperingSpyTriggeredAbility extends TriggeredAbilityImpl {

    public WhisperingSpyTriggeredAbility() {
        super(Zone.BATTLEFIELD, new DamagePlayersEffect(1, TargetController.OPPONENT), false);
        this.addEffect(new GainLifeEffect(1));
        this.addWatcher(new WhisperingSpyWatcher());
    }

    public WhisperingSpyTriggeredAbility(final WhisperingSpyTriggeredAbility ability) {
        super(ability);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.SURVEIL;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        WhisperingSpyWatcher watcher = (WhisperingSpyWatcher) game.getState().getWatchers().get(WhisperingSpyWatcher.class.getSimpleName());
        return watcher != null && watcher.getTimesSurveiled(getControllerId()) == 1;
    }

    @Override
    public WhisperingSpyTriggeredAbility copy() {
        return new WhisperingSpyTriggeredAbility(this);
    }

    @Override
    public String getRule() {
        return "Whenever you surveil for the first time each turn, "
                + "{this} deals 1 damage to each opponent and you gain 1 life.";
    }
}

class WhisperingSpyWatcher extends Watcher {

    private final Map<UUID, Integer> timesSurveiled = new HashMap<>();

    public WhisperingSpyWatcher() {
        super(WhisperingSpyWatcher.class.getSimpleName(), WatcherScope.GAME);
    }

    public WhisperingSpyWatcher(final WhisperingSpyWatcher watcher) {
        super(watcher);
    }

    @Override
    public WhisperingSpyWatcher copy() {
        return new WhisperingSpyWatcher(this);
    }

    @Override
    public void watch(GameEvent event, Game game) {
        if (event.getType() == GameEvent.EventType.SURVEIL) {
            timesSurveiled.put(event.getPlayerId(), getTimesSurveiled(event.getPlayerId()) + 1);
        }
    }

    @Override
    public void reset() {
        super.reset();
        timesSurveiled.clear();
    }

    public int getTimesSurveiled(UUID playerId) {
        return timesSurveiled.getOrDefault(playerId, 0);
    }
}
