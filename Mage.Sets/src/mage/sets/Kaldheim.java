package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class Kaldheim extends ExpansionSet {

    private static final Kaldheim instance = new Kaldheim();

    public static Kaldheim getInstance() {
        return instance;
    }

    private Kaldheim() {
        super("Kaldheim", "KHM", ExpansionSet.buildDate(2021, 2, 5), SetType.EXPANSION);
        this.blockName = "Kaldheim";
        this.hasBasicLands = true;
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 9;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        this.numBoosterDoubleFaced = 1;
        this.maxCardNumberInBooster = 285;

        cards.add(new SetCardInfo("Barkchannel Pathway", 251, Rarity.RARE, mage.cards.b.BarkchannelPathway.class));
    }
}
