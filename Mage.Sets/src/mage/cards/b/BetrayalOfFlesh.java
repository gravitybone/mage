package mage.cards.b;

import mage.abilities.Mode;
import mage.abilities.costs.common.SacrificeTargetCost;
import mage.abilities.effects.common.DestroyTargetEffect;
import mage.abilities.effects.common.ReturnFromGraveyardToBattlefieldTargetEffect;
import mage.abilities.keyword.EntwineAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.StaticFilters;
import mage.target.common.TargetCardInYourGraveyard;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 * @author LoneFox
 */
public final class BetrayalOfFlesh extends CardImpl {

    public BetrayalOfFlesh(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{5}{B}");

        // Choose one -
        this.getSpellAbility().getModes().setMinModes(1);
        this.getSpellAbility().getModes().setMaxModes(1);
        // Destroy target creature;
        this.getSpellAbility().addEffect(new DestroyTargetEffect());
        this.getSpellAbility().addTarget(new TargetCreaturePermanent());
        // or return target creature card from your graveyard to the battlefield.
        Mode mode = new Mode(new ReturnFromGraveyardToBattlefieldTargetEffect());
        mode.addTarget(new TargetCardInYourGraveyard(StaticFilters.FILTER_CARD_CREATURE_YOUR_GRAVEYARD));
        this.getSpellAbility().getModes().addMode(mode);
        // Entwine-Sacrifice three lands.
        this.addAbility(new EntwineAbility(new SacrificeTargetCost(3, StaticFilters.FILTER_LANDS)));
    }

    private BetrayalOfFlesh(final BetrayalOfFlesh card) {
        super(card);
    }

    @Override
    public BetrayalOfFlesh copy() {
        return new BetrayalOfFlesh(this);
    }
}
