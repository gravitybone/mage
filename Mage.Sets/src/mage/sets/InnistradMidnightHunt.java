package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.Arrays;
import java.util.List;

/**
 * @author TheElk801
 */
public final class InnistradMidnightHunt extends ExpansionSet {

    private static final List<String> unfinished = Arrays.asList("Arlinn, the Pack's Hope", "Arlinn, the Moon's Fury", "Baithook Angler", "Hook-Haunt Drifter", "Baneblade Scoundrel", "Baneclaw Marauder", "Beloved Beggar", "Generous Soul", "Bird Admirer", "Wing Shredder", "Brimstone Vandal", "Brutal Cathar", "Moonrage Brute", "Burly Breaker", "Dire-Strain Demolisher", "Celestus Sanctifier", "Chaplain of Alms", "Chapel Shieldgeist", "Component Collector", "Covert Cutpurse", "Covetous Geist", "Covetous Castaway", "Ghostly Castigator", "Curse of Leeches", "Leeching Lurker", "Dennick, Pious Apprentice", "Dennick, Pious Apparition", "Devoted Grafkeeper", "Departed Soulkeeper", "Fangblade Brigand", "Fangblade Eviscerator", "Firmament Sage", "Galedrifter", "Waildrifter", "Gavony Dawnguard", "Graveyard Trespasser", "Graveyard Glutton", "Harvesttide Infiltrator", "Harvesttide Assailant", "Hound Tamer", "Untamed Pup", "Kessig Naturalist", "Lord of the Ulvenwald", "Lunarch Veteran", "Luminous Phantom", "Malevolent Hermit", "Benevolent Geist", "Mourning Patrol", "Morning Apparition", "Obsessive Astronomer", "Outland Liberator", "Frenzied Trapbreaker", "Overwhelmed Archivist", "Archive Haunt", "Phantom Carriage", "Reckless Stormseeker", "Storm-Charged Slasher", "Shady Traveler", "Stalking Predator", "Shipwreck Sifters", "Spellrune Painter", "Spellrune Howler", "Sunrise Cavalier", "Sunstreak Phoenix", "Suspicious Stowaway", "Seafaring Werewolf", "Tavern Ruffian", "Tavern Smasher", "The Celestus", "Thraben Exorcism", "Tireless Hauler", "Dire-Strain Brawler", "Tovolar, Dire Overlord", "Tovolar, the Midnight Scourge", "Tovolar's Huntmaster", "Tovolar's Packleader", "Unblinking Observer", "Vadrik, Astral Archmage", "Village Watch", "Village Reavers");
    private static final InnistradMidnightHunt instance = new InnistradMidnightHunt();

    public static InnistradMidnightHunt getInstance() {
        return instance;
    }

    private InnistradMidnightHunt() {
        super("Innistrad: Midnight Hunt", "MID", ExpansionSet.buildDate(2021, 9, 24), SetType.EXPANSION);
        this.blockName = "Innistrad: Midnight Hunt";
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 9;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        this.numBoosterDoubleFaced = 1;

        cards.add(new SetCardInfo("Abandon the Post", 127, Rarity.COMMON, mage.cards.a.AbandonThePost.class));
        cards.add(new SetCardInfo("Adeline, Resplendent Cathar", 1, Rarity.RARE, mage.cards.a.AdelineResplendentCathar.class));
        cards.add(new SetCardInfo("Ambitious Farmhand", 2, Rarity.UNCOMMON, mage.cards.a.AmbitiousFarmhand.class));
        cards.add(new SetCardInfo("Angelfire Ignition", 209, Rarity.RARE, mage.cards.a.AngelfireIgnition.class));
        cards.add(new SetCardInfo("Arcane Infusion", 210, Rarity.UNCOMMON, mage.cards.a.ArcaneInfusion.class));
        cards.add(new SetCardInfo("Archive Haunt", 68, Rarity.UNCOMMON, mage.cards.a.ArchiveHaunt.class));
        cards.add(new SetCardInfo("Ardent Elementalist", 128, Rarity.COMMON, mage.cards.a.ArdentElementalist.class));
        cards.add(new SetCardInfo("Arlinn, the Moon's Fury", 211, Rarity.MYTHIC, mage.cards.a.ArlinnTheMoonsFury.class));
        cards.add(new SetCardInfo("Arlinn, the Pack's Hope", 211, Rarity.MYTHIC, mage.cards.a.ArlinnThePacksHope.class));
        cards.add(new SetCardInfo("Arrogant Outlaw", 84, Rarity.COMMON, mage.cards.a.ArrogantOutlaw.class));
        cards.add(new SetCardInfo("Ashmouth Dragon", 159, Rarity.RARE, mage.cards.a.AshmouthDragon.class));
        cards.add(new SetCardInfo("Augur of Autumn", 168, Rarity.RARE, mage.cards.a.AugurOfAutumn.class));
        cards.add(new SetCardInfo("Awoken Demon", 100, Rarity.COMMON, mage.cards.a.AwokenDemon.class));
        cards.add(new SetCardInfo("Baithook Angler", 42, Rarity.COMMON, mage.cards.b.BaithookAngler.class));
        cards.add(new SetCardInfo("Bat Whisperer", 86, Rarity.COMMON, mage.cards.b.BatWhisperer.class));
        cards.add(new SetCardInfo("Benevolent Geist", 61, Rarity.RARE, mage.cards.b.BenevolentGeist.class));
        cards.add(new SetCardInfo("Bereaved Survivor", 4, Rarity.UNCOMMON, mage.cards.b.BereavedSurvivor.class));
        cards.add(new SetCardInfo("Bird Admirer", 169, Rarity.COMMON, mage.cards.b.BirdAdmirer.class));
        cards.add(new SetCardInfo("Bladebrand", 87, Rarity.COMMON, mage.cards.b.Bladebrand.class));
        cards.add(new SetCardInfo("Bladestitched Skaab", 212, Rarity.UNCOMMON, mage.cards.b.BladestitchedSkaab.class));
        cards.add(new SetCardInfo("Blessed Defiance", 5, Rarity.COMMON, mage.cards.b.BlessedDefiance.class));
        cards.add(new SetCardInfo("Blood Pact", 88, Rarity.COMMON, mage.cards.b.BloodPact.class));
        cards.add(new SetCardInfo("Bloodline Culling", 89, Rarity.RARE, mage.cards.b.BloodlineCulling.class));
        cards.add(new SetCardInfo("Bloodthirsty Adversary", 129, Rarity.MYTHIC, mage.cards.b.BloodthirstyAdversary.class));
        cards.add(new SetCardInfo("Bloodtithe Collector", 90, Rarity.UNCOMMON, mage.cards.b.BloodtitheCollector.class));
        cards.add(new SetCardInfo("Borrowed Time", 6, Rarity.UNCOMMON, mage.cards.b.BorrowedTime.class));
        cards.add(new SetCardInfo("Bounding Wolf", 170, Rarity.COMMON, mage.cards.b.BoundingWolf.class));
        cards.add(new SetCardInfo("Bramble Armor", 171, Rarity.COMMON, mage.cards.b.BrambleArmor.class));
        cards.add(new SetCardInfo("Briarbridge Tracker", 172, Rarity.RARE, mage.cards.b.BriarbridgeTracker.class));
        cards.add(new SetCardInfo("Brimstone Vandal", 130, Rarity.COMMON, mage.cards.b.BrimstoneVandal.class));
        cards.add(new SetCardInfo("Brood Weaver", 173, Rarity.UNCOMMON, mage.cards.b.BroodWeaver.class));
        cards.add(new SetCardInfo("Brutal Cathar", 7, Rarity.RARE, mage.cards.b.BrutalCathar.class));
        cards.add(new SetCardInfo("Burly Breaker", 174, Rarity.UNCOMMON, mage.cards.b.BurlyBreaker.class));
        cards.add(new SetCardInfo("Burn Down the House", 131, Rarity.RARE, mage.cards.b.BurnDownTheHouse.class));
        cards.add(new SetCardInfo("Burn the Accursed", 132, Rarity.COMMON, mage.cards.b.BurnTheAccursed.class));
        cards.add(new SetCardInfo("Can't Stay Away", 213, Rarity.RARE, mage.cards.c.CantStayAway.class));
        cards.add(new SetCardInfo("Candlegrove Witch", 8, Rarity.COMMON, mage.cards.c.CandlegroveWitch.class));
        cards.add(new SetCardInfo("Candlelit Cavalry", 175, Rarity.COMMON, mage.cards.c.CandlelitCavalry.class));
        cards.add(new SetCardInfo("Candletrap", 9, Rarity.COMMON, mage.cards.c.Candletrap.class));
        cards.add(new SetCardInfo("Cathar Commando", 10, Rarity.COMMON, mage.cards.c.CatharCommando.class));
        cards.add(new SetCardInfo("Cathar's Call", 11, Rarity.UNCOMMON, mage.cards.c.CatharsCall.class));
        cards.add(new SetCardInfo("Cathartic Pyre", 133, Rarity.UNCOMMON, mage.cards.c.CatharticPyre.class));
        cards.add(new SetCardInfo("Celestus Sanctifier", 12, Rarity.COMMON, mage.cards.c.CelestusSanctifier.class));
        cards.add(new SetCardInfo("Champion of the Perished", 91, Rarity.RARE, mage.cards.c.ChampionOfThePerished.class));
        cards.add(new SetCardInfo("Chapel Shieldgeist", 13, Rarity.UNCOMMON, mage.cards.c.ChapelShieldgeist.class));
        cards.add(new SetCardInfo("Chaplain of Alms", 13, Rarity.UNCOMMON, mage.cards.c.ChaplainOfAlms.class));
        cards.add(new SetCardInfo("Chilling Chronicle", 63, Rarity.UNCOMMON, mage.cards.c.ChillingChronicle.class));
        cards.add(new SetCardInfo("Clarion Cathars", 14, Rarity.COMMON, mage.cards.c.ClarionCathars.class));
        cards.add(new SetCardInfo("Clear Shot", 176, Rarity.UNCOMMON, mage.cards.c.ClearShot.class));
        cards.add(new SetCardInfo("Component Collector", 43, Rarity.COMMON, mage.cards.c.ComponentCollector.class));
        cards.add(new SetCardInfo("Consider", 44, Rarity.COMMON, mage.cards.c.Consider.class));
        cards.add(new SetCardInfo("Consuming Blob", 177, Rarity.MYTHIC, mage.cards.c.ConsumingBlob.class));
        cards.add(new SetCardInfo("Contortionist Troupe", 178, Rarity.UNCOMMON, mage.cards.c.ContortionistTroupe.class));
        cards.add(new SetCardInfo("Corpse Cobble", 214, Rarity.UNCOMMON, mage.cards.c.CorpseCobble.class));
        cards.add(new SetCardInfo("Covert Cutpurse", 92, Rarity.UNCOMMON, mage.cards.c.CovertCutpurse.class));
        cards.add(new SetCardInfo("Covetous Castaway", 45, Rarity.UNCOMMON, mage.cards.c.CovetousCastaway.class));
        cards.add(new SetCardInfo("Covetous Geist", 92, Rarity.UNCOMMON, mage.cards.c.CovetousGeist.class));
        cards.add(new SetCardInfo("Crawl from the Cellar", 93, Rarity.COMMON, mage.cards.c.CrawlFromTheCellar.class));
        cards.add(new SetCardInfo("Creeping Inn", 264, Rarity.MYTHIC, mage.cards.c.CreepingInn.class));
        cards.add(new SetCardInfo("Croaking Counterpart", 215, Rarity.RARE, mage.cards.c.CroakingCounterpart.class));
        cards.add(new SetCardInfo("Crossroads Candleguide", 253, Rarity.COMMON, mage.cards.c.CrossroadsCandleguide.class));
        cards.add(new SetCardInfo("Curse of Shaken Faith", 134, Rarity.RARE, mage.cards.c.CurseOfShakenFaith.class));
        cards.add(new SetCardInfo("Curse of Silence", 15, Rarity.RARE, mage.cards.c.CurseOfSilence.class));
        cards.add(new SetCardInfo("Curse of Surveillance", 46, Rarity.RARE, mage.cards.c.CurseOfSurveillance.class));
        cards.add(new SetCardInfo("Dauntless Avenger", 4, Rarity.UNCOMMON, mage.cards.d.DauntlessAvenger.class));
        cards.add(new SetCardInfo("Dawnhart Mentor", 179, Rarity.UNCOMMON, mage.cards.d.DawnhartMentor.class));
        cards.add(new SetCardInfo("Dawnhart Rejuvenator", 180, Rarity.COMMON, mage.cards.d.DawnhartRejuvenator.class));
        cards.add(new SetCardInfo("Dawnhart Wardens", 216, Rarity.UNCOMMON, mage.cards.d.DawnhartWardens.class));
        cards.add(new SetCardInfo("Deathbonnet Hulk", 181, Rarity.UNCOMMON, mage.cards.d.DeathbonnetHulk.class));
        cards.add(new SetCardInfo("Deathbonnet Sprout", 181, Rarity.UNCOMMON, mage.cards.d.DeathbonnetSprout.class));
        cards.add(new SetCardInfo("Defend the Celestus", 182, Rarity.UNCOMMON, mage.cards.d.DefendTheCelestus.class));
        cards.add(new SetCardInfo("Defenestrate", 95, Rarity.COMMON, mage.cards.d.Defenestrate.class));
        cards.add(new SetCardInfo("Delver of Secrets", 47, Rarity.UNCOMMON, mage.cards.d.DelverOfSecrets.class));
        cards.add(new SetCardInfo("Dennick, Pious Apparition", 217, Rarity.RARE, mage.cards.d.DennickPiousApparition.class));
        cards.add(new SetCardInfo("Dennick, Pious Apprentice", 217, Rarity.RARE, mage.cards.d.DennickPiousApprentice.class));
        cards.add(new SetCardInfo("Departed Soulkeeper", 218, Rarity.UNCOMMON, mage.cards.d.DepartedSoulkeeper.class));
        cards.add(new SetCardInfo("Deserted Beach", 260, Rarity.RARE, mage.cards.d.DesertedBeach.class));
        cards.add(new SetCardInfo("Devious Cover-Up", 48, Rarity.COMMON, mage.cards.d.DeviousCoverUp.class));
        cards.add(new SetCardInfo("Devoted Grafkeeper", 218, Rarity.UNCOMMON, mage.cards.d.DevotedGrafkeeper.class));
        cards.add(new SetCardInfo("Dire-Strain Brawler", 203, Rarity.COMMON, mage.cards.d.DireStrainBrawler.class));
        cards.add(new SetCardInfo("Dire-Strain Demolisher", 174, Rarity.UNCOMMON, mage.cards.d.DireStrainDemolisher.class));
        cards.add(new SetCardInfo("Dire-Strain Rampage", 219, Rarity.RARE, mage.cards.d.DireStrainRampage.class));
        cards.add(new SetCardInfo("Diregraf Horde", 96, Rarity.COMMON, mage.cards.d.DiregrafHorde.class));
        cards.add(new SetCardInfo("Diregraf Rebirth", 220, Rarity.UNCOMMON, mage.cards.d.DiregrafRebirth.class));
        cards.add(new SetCardInfo("Dissipate", 49, Rarity.UNCOMMON, mage.cards.d.Dissipate.class));
        cards.add(new SetCardInfo("Dreadhound", 97, Rarity.UNCOMMON, mage.cards.d.Dreadhound.class));
        cards.add(new SetCardInfo("Drownyard Amalgam", 50, Rarity.COMMON, mage.cards.d.DrownyardAmalgam.class));
        cards.add(new SetCardInfo("Dryad's Revival", 183, Rarity.UNCOMMON, mage.cards.d.DryadsRevival.class));
        cards.add(new SetCardInfo("Duel for Dominance", 184, Rarity.COMMON, mage.cards.d.DuelForDominance.class));
        cards.add(new SetCardInfo("Duelcraft Trainer", 16, Rarity.UNCOMMON, mage.cards.d.DuelcraftTrainer.class));
        cards.add(new SetCardInfo("Duress", 98, Rarity.COMMON, mage.cards.d.Duress.class));
        cards.add(new SetCardInfo("Eaten Alive", 99, Rarity.COMMON, mage.cards.e.EatenAlive.class));
        cards.add(new SetCardInfo("Eccentric Farmer", 185, Rarity.COMMON, mage.cards.e.EccentricFarmer.class));
        cards.add(new SetCardInfo("Ecstatic Awakener", 100, Rarity.COMMON, mage.cards.e.EcstaticAwakener.class));
        cards.add(new SetCardInfo("Electric Revelation", 135, Rarity.COMMON, mage.cards.e.ElectricRevelation.class));
        cards.add(new SetCardInfo("Embodiment of Flame", 141, Rarity.UNCOMMON, mage.cards.e.EmbodimentOfFlame.class));
        cards.add(new SetCardInfo("Evolving Wilds", 261, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Fading Hope", 51, Rarity.UNCOMMON, mage.cards.f.FadingHope.class));
        cards.add(new SetCardInfo("Faithful Mending", 221, Rarity.UNCOMMON, mage.cards.f.FaithfulMending.class));
        cards.add(new SetCardInfo("Falcon Abomination", 52, Rarity.COMMON, mage.cards.f.FalconAbomination.class));
        cards.add(new SetCardInfo("Falkenrath Perforator", 136, Rarity.COMMON, mage.cards.f.FalkenrathPerforator.class));
        cards.add(new SetCardInfo("Falkenrath Pit Fighter", 137, Rarity.RARE, mage.cards.f.FalkenrathPitFighter.class));
        cards.add(new SetCardInfo("Famished Foragers", 138, Rarity.COMMON, mage.cards.f.FamishedForagers.class));
        cards.add(new SetCardInfo("Fangblade Brigand", 139, Rarity.UNCOMMON, mage.cards.f.FangbladeBrigand.class));
        cards.add(new SetCardInfo("Fangblade Eviscerator", 139, Rarity.UNCOMMON, mage.cards.f.FangbladeEviscerator.class));
        cards.add(new SetCardInfo("Fateful Absence", 18, Rarity.RARE, mage.cards.f.FatefulAbsence.class));
        cards.add(new SetCardInfo("Festival Crasher", 140, Rarity.COMMON, mage.cards.f.FestivalCrasher.class));
        cards.add(new SetCardInfo("Field of Ruin", 262, Rarity.UNCOMMON, mage.cards.f.FieldOfRuin.class));
        cards.add(new SetCardInfo("Firmament Sage", 53, Rarity.UNCOMMON, mage.cards.f.FirmamentSage.class));
        cards.add(new SetCardInfo("Flame Channeler", 141, Rarity.UNCOMMON, mage.cards.f.FlameChanneler.class));
        cards.add(new SetCardInfo("Flare of Faith", 19, Rarity.COMMON, mage.cards.f.FlareOfFaith.class));
        cards.add(new SetCardInfo("Fleshtaker", 222, Rarity.UNCOMMON, mage.cards.f.Fleshtaker.class));
        cards.add(new SetCardInfo("Flip the Switch", 54, Rarity.COMMON, mage.cards.f.FlipTheSwitch.class));
        cards.add(new SetCardInfo("Florian, Voldaren Scion", 223, Rarity.RARE, mage.cards.f.FlorianVoldarenScion.class));
        cards.add(new SetCardInfo("Forest", 276, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Foul Play", 101, Rarity.UNCOMMON, mage.cards.f.FoulPlay.class));
        cards.add(new SetCardInfo("Frenzied Trapbreaker", 190, Rarity.UNCOMMON, mage.cards.f.FrenziedTrapbreaker.class));
        cards.add(new SetCardInfo("Galedrifter", 55, Rarity.COMMON, mage.cards.g.Galedrifter.class));
        cards.add(new SetCardInfo("Galvanic Iteration", 224, Rarity.RARE, mage.cards.g.GalvanicIteration.class));
        cards.add(new SetCardInfo("Gavony Dawnguard", 20, Rarity.UNCOMMON, mage.cards.g.GavonyDawnguard.class));
        cards.add(new SetCardInfo("Gavony Silversmith", 21, Rarity.COMMON, mage.cards.g.GavonySilversmith.class));
        cards.add(new SetCardInfo("Gavony Trapper", 22, Rarity.COMMON, mage.cards.g.GavonyTrapper.class));
        cards.add(new SetCardInfo("Geistflame Reservoir", 142, Rarity.RARE, mage.cards.g.GeistflameReservoir.class));
        cards.add(new SetCardInfo("Geistwave", 56, Rarity.COMMON, mage.cards.g.Geistwave.class));
        cards.add(new SetCardInfo("Ghostly Castigator", 45, Rarity.UNCOMMON, mage.cards.g.GhostlyCastigator.class));
        cards.add(new SetCardInfo("Ghoulcaller's Harvest", 225, Rarity.RARE, mage.cards.g.GhoulcallersHarvest.class));
        cards.add(new SetCardInfo("Ghoulish Procession", 102, Rarity.UNCOMMON, mage.cards.g.GhoulishProcession.class));
        cards.add(new SetCardInfo("Gisa, Glorious Resurrector", 103, Rarity.RARE, mage.cards.g.GisaGloriousResurrector.class));
        cards.add(new SetCardInfo("Grafted Identity", 57, Rarity.RARE, mage.cards.g.GraftedIdentity.class));
        cards.add(new SetCardInfo("Graveyard Glutton", 104, Rarity.RARE, mage.cards.g.GraveyardGlutton.class));
        cards.add(new SetCardInfo("Graveyard Trespasser", 104, Rarity.RARE, mage.cards.g.GraveyardTrespasser.class));
        cards.add(new SetCardInfo("Grizzly Ghoul", 226, Rarity.UNCOMMON, mage.cards.g.GrizzlyGhoul.class));
        cards.add(new SetCardInfo("Hallowed Respite", 227, Rarity.RARE, mage.cards.h.HallowedRespite.class));
        cards.add(new SetCardInfo("Harvesttide Assailant", 143, Rarity.COMMON, mage.cards.h.HarvesttideAssailant.class));
        cards.add(new SetCardInfo("Harvesttide Infiltrator", 143, Rarity.COMMON, mage.cards.h.HarvesttideInfiltrator.class));
        cards.add(new SetCardInfo("Harvesttide Sentry", 186, Rarity.COMMON, mage.cards.h.HarvesttideSentry.class));
        cards.add(new SetCardInfo("Haunted Ridge", 263, Rarity.RARE, mage.cards.h.HauntedRidge.class));
        cards.add(new SetCardInfo("Hedgewitch's Mask", 23, Rarity.COMMON, mage.cards.h.HedgewitchsMask.class));
        cards.add(new SetCardInfo("Heirloom Mirror", 105, Rarity.UNCOMMON, mage.cards.h.HeirloomMirror.class));
        cards.add(new SetCardInfo("Hobbling Zombie", 106, Rarity.COMMON, mage.cards.h.HobblingZombie.class));
        cards.add(new SetCardInfo("Homestead Courage", 24, Rarity.COMMON, mage.cards.h.HomesteadCourage.class));
        cards.add(new SetCardInfo("Hook-Haunt Drifter", 42, Rarity.COMMON, mage.cards.h.HookHauntDrifter.class));
        cards.add(new SetCardInfo("Hostile Hostel", 264, Rarity.MYTHIC, mage.cards.h.HostileHostel.class));
        cards.add(new SetCardInfo("Hound Tamer", 187, Rarity.UNCOMMON, mage.cards.h.HoundTamer.class));
        cards.add(new SetCardInfo("Howl of the Hunt", 188, Rarity.COMMON, mage.cards.h.HowlOfTheHunt.class));
        cards.add(new SetCardInfo("Hungry for More", 228, Rarity.UNCOMMON, mage.cards.h.HungryForMore.class));
        cards.add(new SetCardInfo("Immolation", 144, Rarity.COMMON, mage.cards.i.Immolation.class));
        cards.add(new SetCardInfo("Infernal Grasp", 107, Rarity.UNCOMMON, mage.cards.i.InfernalGrasp.class));
        cards.add(new SetCardInfo("Inherited Fiend", 105, Rarity.UNCOMMON, mage.cards.i.InheritedFiend.class));
        cards.add(new SetCardInfo("Insectile Aberration", 47, Rarity.UNCOMMON, mage.cards.i.InsectileAberration.class));
        cards.add(new SetCardInfo("Intrepid Adversary", 25, Rarity.MYTHIC, mage.cards.i.IntrepidAdversary.class));
        cards.add(new SetCardInfo("Island", 270, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Jack-o'-Lantern", 254, Rarity.COMMON, mage.cards.j.JackOLantern.class));
        cards.add(new SetCardInfo("Jadar, Ghoulcaller of Nephalia", 108, Rarity.RARE, mage.cards.j.JadarGhoulcallerOfNephalia.class));
        cards.add(new SetCardInfo("Jerren, Corrupted Bishop", 109, Rarity.MYTHIC, mage.cards.j.JerrenCorruptedBishop.class));
        cards.add(new SetCardInfo("Join the Dance", 229, Rarity.UNCOMMON, mage.cards.j.JoinTheDance.class));
        cards.add(new SetCardInfo("Katilda, Dawnhart Prime", 230, Rarity.RARE, mage.cards.k.KatildaDawnhartPrime.class));
        cards.add(new SetCardInfo("Kessig Naturalist", 231, Rarity.UNCOMMON, mage.cards.k.KessigNaturalist.class));
        cards.add(new SetCardInfo("Lambholt Harrier", 145, Rarity.COMMON, mage.cards.l.LambholtHarrier.class));
        cards.add(new SetCardInfo("Larder Zombie", 58, Rarity.COMMON, mage.cards.l.LarderZombie.class));
        cards.add(new SetCardInfo("Lier, Disciple of the Drowned", 59, Rarity.MYTHIC, mage.cards.l.LierDiscipleOfTheDrowned.class));
        cards.add(new SetCardInfo("Liesa, Forgotten Archangel", 232, Rarity.RARE, mage.cards.l.LiesaForgottenArchangel.class));
        cards.add(new SetCardInfo("Light Up the Night", 146, Rarity.RARE, mage.cards.l.LightUpTheNight.class));
        cards.add(new SetCardInfo("Locked in the Cemetery", 60, Rarity.COMMON, mage.cards.l.LockedInTheCemetery.class));
        cards.add(new SetCardInfo("Lord of the Forsaken", 110, Rarity.MYTHIC, mage.cards.l.LordOfTheForsaken.class));
        cards.add(new SetCardInfo("Lord of the Ulvenwald", 231, Rarity.UNCOMMON, mage.cards.l.LordOfTheUlvenwald.class));
        cards.add(new SetCardInfo("Loyal Gryff", 26, Rarity.UNCOMMON, mage.cards.l.LoyalGryff.class));
        cards.add(new SetCardInfo("Luminous Phantom", 27, Rarity.COMMON, mage.cards.l.LuminousPhantom.class));
        cards.add(new SetCardInfo("Lunar Frenzy", 147, Rarity.UNCOMMON, mage.cards.l.LunarFrenzy.class));
        cards.add(new SetCardInfo("Lunarch Veteran", 27, Rarity.COMMON, mage.cards.l.LunarchVeteran.class));
        cards.add(new SetCardInfo("Malevolent Hermit", 61, Rarity.RARE, mage.cards.m.MalevolentHermit.class));
        cards.add(new SetCardInfo("Mask of Griselbrand", 111, Rarity.RARE, mage.cards.m.MaskOfGriselbrand.class));
        cards.add(new SetCardInfo("Memory Deluge", 62, Rarity.RARE, mage.cards.m.MemoryDeluge.class));
        cards.add(new SetCardInfo("Might of the Old Ways", 189, Rarity.COMMON, mage.cards.m.MightOfTheOldWays.class));
        cards.add(new SetCardInfo("Moonrage Brute", 7, Rarity.RARE, mage.cards.m.MoonrageBrute.class));
        cards.add(new SetCardInfo("Moonrager's Slash", 148, Rarity.COMMON, mage.cards.m.MoonragersSlash.class));
        cards.add(new SetCardInfo("Moonsilver Key", 255, Rarity.UNCOMMON, mage.cards.m.MoonsilverKey.class));
        cards.add(new SetCardInfo("Moonveil Regent", 149, Rarity.MYTHIC, mage.cards.m.MoonveilRegent.class));
        cards.add(new SetCardInfo("Morbid Opportunist", 113, Rarity.UNCOMMON, mage.cards.m.MorbidOpportunist.class));
        cards.add(new SetCardInfo("Morkrut Behemoth", 114, Rarity.COMMON, mage.cards.m.MorkrutBehemoth.class));
        cards.add(new SetCardInfo("Morning Apparition", 28, Rarity.COMMON, mage.cards.m.MorningApparition.class));
        cards.add(new SetCardInfo("Mountain", 274, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Mounted Dreadknight", 150, Rarity.COMMON, mage.cards.m.MountedDreadknight.class));
        cards.add(new SetCardInfo("Mourning Patrol", 28, Rarity.COMMON, mage.cards.m.MourningPatrol.class));
        cards.add(new SetCardInfo("Mysterious Tome", 63, Rarity.UNCOMMON, mage.cards.m.MysteriousTome.class));
        cards.add(new SetCardInfo("Mystic Monstrosity", 256, Rarity.UNCOMMON, mage.cards.m.MysticMonstrosity.class));
        cards.add(new SetCardInfo("Mystic Skull", 256, Rarity.UNCOMMON, mage.cards.m.MysticSkull.class));
        cards.add(new SetCardInfo("Nebelgast Intruder", 64, Rarity.UNCOMMON, mage.cards.n.NebelgastIntruder.class));
        cards.add(new SetCardInfo("Necrosynthesis", 115, Rarity.UNCOMMON, mage.cards.n.Necrosynthesis.class));
        cards.add(new SetCardInfo("Neonate's Rush", 151, Rarity.COMMON, mage.cards.n.NeonatesRush.class));
        cards.add(new SetCardInfo("No Way Out", 116, Rarity.COMMON, mage.cards.n.NoWayOut.class));
        cards.add(new SetCardInfo("Novice Occultist", 117, Rarity.COMMON, mage.cards.n.NoviceOccultist.class));
        cards.add(new SetCardInfo("Obsessive Astronomer", 152, Rarity.UNCOMMON, mage.cards.o.ObsessiveAstronomer.class));
        cards.add(new SetCardInfo("Odric's Outrider", 29, Rarity.UNCOMMON, mage.cards.o.OdricsOutrider.class));
        cards.add(new SetCardInfo("Old Stickfingers", 234, Rarity.RARE, mage.cards.o.OldStickfingers.class));
        cards.add(new SetCardInfo("Olivia's Midnight Ambush", 118, Rarity.COMMON, mage.cards.o.OliviasMidnightAmbush.class));
        cards.add(new SetCardInfo("Ominous Roost", 65, Rarity.UNCOMMON, mage.cards.o.OminousRoost.class));
        cards.add(new SetCardInfo("Organ Hoarder", 66, Rarity.COMMON, mage.cards.o.OrganHoarder.class));
        cards.add(new SetCardInfo("Ormendahl, the Corrupter", 109, Rarity.MYTHIC, mage.cards.o.OrmendahlTheCorrupter.class));
        cards.add(new SetCardInfo("Otherworldly Gaze", 67, Rarity.COMMON, mage.cards.o.OtherworldlyGaze.class));
        cards.add(new SetCardInfo("Outland Liberator", 190, Rarity.UNCOMMON, mage.cards.o.OutlandLiberator.class));
        cards.add(new SetCardInfo("Overgrown Farmland", 265, Rarity.RARE, mage.cards.o.OvergrownFarmland.class));
        cards.add(new SetCardInfo("Overwhelmed Archivist", 68, Rarity.UNCOMMON, mage.cards.o.OverwhelmedArchivist.class));
        cards.add(new SetCardInfo("Pack's Betrayal", 153, Rarity.COMMON, mage.cards.p.PacksBetrayal.class));
        cards.add(new SetCardInfo("Path to the Festival", 191, Rarity.COMMON, mage.cards.p.PathToTheFestival.class));
        cards.add(new SetCardInfo("Patrician Geist", 69, Rarity.RARE, mage.cards.p.PatricianGeist.class));
        cards.add(new SetCardInfo("Pestilent Wolf", 192, Rarity.COMMON, mage.cards.p.PestilentWolf.class));
        cards.add(new SetCardInfo("Phantom Carriage", 70, Rarity.UNCOMMON, mage.cards.p.PhantomCarriage.class));
        cards.add(new SetCardInfo("Pithing Needle", 257, Rarity.RARE, mage.cards.p.PithingNeedle.class));
        cards.add(new SetCardInfo("Plains", 268, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Play with Fire", 154, Rarity.UNCOMMON, mage.cards.p.PlayWithFire.class));
        cards.add(new SetCardInfo("Plummet", 193, Rarity.COMMON, mage.cards.p.Plummet.class));
        cards.add(new SetCardInfo("Poppet Factory", 71, Rarity.MYTHIC, mage.cards.p.PoppetFactory.class));
        cards.add(new SetCardInfo("Poppet Stitcher", 71, Rarity.MYTHIC, mage.cards.p.PoppetStitcher.class));
        cards.add(new SetCardInfo("Primal Adversary", 194, Rarity.MYTHIC, mage.cards.p.PrimalAdversary.class));
        cards.add(new SetCardInfo("Purifying Dragon", 155, Rarity.UNCOMMON, mage.cards.p.PurifyingDragon.class));
        cards.add(new SetCardInfo("Raze the Effigy", 156, Rarity.COMMON, mage.cards.r.RazeTheEffigy.class));
        cards.add(new SetCardInfo("Reckless Stormseeker", 157, Rarity.RARE, mage.cards.r.RecklessStormseeker.class));
        cards.add(new SetCardInfo("Rem Karolus, Stalwart Slayer", 235, Rarity.RARE, mage.cards.r.RemKarolusStalwartSlayer.class));
        cards.add(new SetCardInfo("Return to Nature", 195, Rarity.COMMON, mage.cards.r.ReturnToNature.class));
        cards.add(new SetCardInfo("Revenge of the Drowned", 72, Rarity.COMMON, mage.cards.r.RevengeOfTheDrowned.class));
        cards.add(new SetCardInfo("Rise of the Ants", 196, Rarity.UNCOMMON, mage.cards.r.RiseOfTheAnts.class));
        cards.add(new SetCardInfo("Rite of Harmony", 236, Rarity.RARE, mage.cards.r.RiteOfHarmony.class));
        cards.add(new SetCardInfo("Rite of Oblivion", 237, Rarity.UNCOMMON, mage.cards.r.RiteOfOblivion.class));
        cards.add(new SetCardInfo("Ritual Guardian", 30, Rarity.COMMON, mage.cards.r.RitualGuardian.class));
        cards.add(new SetCardInfo("Ritual of Hope", 31, Rarity.UNCOMMON, mage.cards.r.RitualOfHope.class));
        cards.add(new SetCardInfo("Rockfall Vale", 266, Rarity.RARE, mage.cards.r.RockfallVale.class));
        cards.add(new SetCardInfo("Rootcoil Creeper", 238, Rarity.UNCOMMON, mage.cards.r.RootcoilCreeper.class));
        cards.add(new SetCardInfo("Rotten Reunion", 119, Rarity.COMMON, mage.cards.r.RottenReunion.class));
        cards.add(new SetCardInfo("Sacred Fire", 239, Rarity.UNCOMMON, mage.cards.s.SacredFire.class));
        cards.add(new SetCardInfo("Saryth, the Viper's Fang", 197, Rarity.RARE, mage.cards.s.SarythTheVipersFang.class));
        cards.add(new SetCardInfo("Seafaring Werewolf", 80, Rarity.RARE, mage.cards.s.SeafaringWerewolf.class));
        cards.add(new SetCardInfo("Search Party Captain", 32, Rarity.COMMON, mage.cards.s.SearchPartyCaptain.class));
        cards.add(new SetCardInfo("Seasoned Cathar", 2, Rarity.UNCOMMON, mage.cards.s.SeasonedCathar.class));
        cards.add(new SetCardInfo("Secrets of the Key", 73, Rarity.COMMON, mage.cards.s.SecretsOfTheKey.class));
        cards.add(new SetCardInfo("Seize the Storm", 158, Rarity.UNCOMMON, mage.cards.s.SeizeTheStorm.class));
        cards.add(new SetCardInfo("Shadowbeast Sighting", 198, Rarity.COMMON, mage.cards.s.ShadowbeastSighting.class));
        cards.add(new SetCardInfo("Shady Traveler", 120, Rarity.COMMON, mage.cards.s.ShadyTraveler.class));
        cards.add(new SetCardInfo("Shipwreck Marsh", 267, Rarity.RARE, mage.cards.s.ShipwreckMarsh.class));
        cards.add(new SetCardInfo("Shipwreck Sifters", 74, Rarity.COMMON, mage.cards.s.ShipwreckSifters.class));
        cards.add(new SetCardInfo("Siege Zombie", 121, Rarity.COMMON, mage.cards.s.SiegeZombie.class));
        cards.add(new SetCardInfo("Sigarda's Splendor", 33, Rarity.RARE, mage.cards.s.SigardasSplendor.class));
        cards.add(new SetCardInfo("Sigarda, Champion of Light", 240, Rarity.MYTHIC, mage.cards.s.SigardaChampionOfLight.class));
        cards.add(new SetCardInfo("Sigardian Savior", 34, Rarity.MYTHIC, mage.cards.s.SigardianSavior.class));
        cards.add(new SetCardInfo("Silver Bolt", 258, Rarity.COMMON, mage.cards.s.SilverBolt.class));
        cards.add(new SetCardInfo("Siphon Insight", 241, Rarity.RARE, mage.cards.s.SiphonInsight.class));
        cards.add(new SetCardInfo("Skaab Wrangler", 75, Rarity.UNCOMMON, mage.cards.s.SkaabWrangler.class));
        cards.add(new SetCardInfo("Slaughter Specialist", 122, Rarity.RARE, mage.cards.s.SlaughterSpecialist.class));
        cards.add(new SetCardInfo("Slogurk, the Overslime", 242, Rarity.RARE, mage.cards.s.SlogurkTheOverslime.class));
        cards.add(new SetCardInfo("Sludge Monster", 76, Rarity.RARE, mage.cards.s.SludgeMonster.class));
        cards.add(new SetCardInfo("Smoldering Egg", 159, Rarity.RARE, mage.cards.s.SmolderingEgg.class));
        cards.add(new SetCardInfo("Snarling Wolf", 199, Rarity.COMMON, mage.cards.s.SnarlingWolf.class));
        cards.add(new SetCardInfo("Soul-Guide Gryff", 35, Rarity.COMMON, mage.cards.s.SoulGuideGryff.class));
        cards.add(new SetCardInfo("Spectral Adversary", 77, Rarity.MYTHIC, mage.cards.s.SpectralAdversary.class));
        cards.add(new SetCardInfo("Spellrune Howler", 160, Rarity.UNCOMMON, mage.cards.s.SpellruneHowler.class));
        cards.add(new SetCardInfo("Spellrune Painter", 160, Rarity.UNCOMMON, mage.cards.s.SpellrunePainter.class));
        cards.add(new SetCardInfo("Stalking Predator", 120, Rarity.COMMON, mage.cards.s.StalkingPredator.class));
        cards.add(new SetCardInfo("Startle", 78, Rarity.COMMON, mage.cards.s.Startle.class));
        cards.add(new SetCardInfo("Stolen Vitality", 161, Rarity.COMMON, mage.cards.s.StolenVitality.class));
        cards.add(new SetCardInfo("Storm Skreelix", 243, Rarity.UNCOMMON, mage.cards.s.StormSkreelix.class));
        cards.add(new SetCardInfo("Storm the Festival", 200, Rarity.RARE, mage.cards.s.StormTheFestival.class));
        cards.add(new SetCardInfo("Storm-Charged Slasher", 157, Rarity.RARE, mage.cards.s.StormChargedSlasher.class));
        cards.add(new SetCardInfo("Stormrider Spirit", 79, Rarity.COMMON, mage.cards.s.StormriderSpirit.class));
        cards.add(new SetCardInfo("Strangling Grasp", 126, Rarity.UNCOMMON, mage.cards.s.StranglingGrasp.class));
        cards.add(new SetCardInfo("Stromkirk Bloodthief", 123, Rarity.UNCOMMON, mage.cards.s.StromkirkBloodthief.class));
        cards.add(new SetCardInfo("Stuffed Bear", 259, Rarity.COMMON, mage.cards.s.StuffedBear.class));
        cards.add(new SetCardInfo("Sungold Barrage", 36, Rarity.COMMON, mage.cards.s.SungoldBarrage.class));
        cards.add(new SetCardInfo("Sungold Sentinel", 37, Rarity.RARE, mage.cards.s.SungoldSentinel.class));
        cards.add(new SetCardInfo("Sunrise Cavalier", 244, Rarity.UNCOMMON, mage.cards.s.SunriseCavalier.class));
        cards.add(new SetCardInfo("Sunset Revelry", 38, Rarity.UNCOMMON, mage.cards.s.SunsetRevelry.class));
        cards.add(new SetCardInfo("Sunstreak Phoenix", 162, Rarity.MYTHIC, mage.cards.s.SunstreakPhoenix.class));
        cards.add(new SetCardInfo("Suspicious Stowaway", 80, Rarity.RARE, mage.cards.s.SuspiciousStowaway.class));
        cards.add(new SetCardInfo("Swamp", 272, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Tainted Adversary", 124, Rarity.MYTHIC, mage.cards.t.TaintedAdversary.class));
        cards.add(new SetCardInfo("Tapping at the Window", 201, Rarity.COMMON, mage.cards.t.TappingAtTheWindow.class));
        cards.add(new SetCardInfo("Tavern Ruffian", 163, Rarity.COMMON, mage.cards.t.TavernRuffian.class));
        cards.add(new SetCardInfo("Tavern Smasher", 163, Rarity.COMMON, mage.cards.t.TavernSmasher.class));
        cards.add(new SetCardInfo("The Meathook Massacre", 112, Rarity.MYTHIC, mage.cards.t.TheMeathookMassacre.class));
        cards.add(new SetCardInfo("Thermo-Alchemist", 164, Rarity.UNCOMMON, mage.cards.t.ThermoAlchemist.class));
        cards.add(new SetCardInfo("Thraben Exorcism", 39, Rarity.COMMON, mage.cards.t.ThrabenExorcism.class));
        cards.add(new SetCardInfo("Timberland Guide", 202, Rarity.COMMON, mage.cards.t.TimberlandGuide.class));
        cards.add(new SetCardInfo("Tireless Hauler", 203, Rarity.COMMON, mage.cards.t.TirelessHauler.class));
        cards.add(new SetCardInfo("Tovolar's Huntmaster", 204, Rarity.RARE, mage.cards.t.TovolarsHuntmaster.class));
        cards.add(new SetCardInfo("Tovolar's Packleader", 204, Rarity.RARE, mage.cards.t.TovolarsPackleader.class));
        cards.add(new SetCardInfo("Triskaidekaphile", 81, Rarity.RARE, mage.cards.t.Triskaidekaphile.class));
        cards.add(new SetCardInfo("Turn the Earth", 205, Rarity.UNCOMMON, mage.cards.t.TurnTheEarth.class));
        cards.add(new SetCardInfo("Unblinking Observer", 82, Rarity.COMMON, mage.cards.u.UnblinkingObserver.class));
        cards.add(new SetCardInfo("Unnatural Growth", 206, Rarity.RARE, mage.cards.u.UnnaturalGrowth.class));
        cards.add(new SetCardInfo("Unruly Mob", 40, Rarity.COMMON, mage.cards.u.UnrulyMob.class));
        cards.add(new SetCardInfo("Untamed Pup", 187, Rarity.UNCOMMON, mage.cards.u.UntamedPup.class));
        cards.add(new SetCardInfo("Vadrik, Astral Archmage", 248, Rarity.RARE, mage.cards.v.VadrikAstralArchmage.class));
        cards.add(new SetCardInfo("Vampire Interloper", 125, Rarity.COMMON, mage.cards.v.VampireInterloper.class));
        cards.add(new SetCardInfo("Vampire Socialite", 249, Rarity.UNCOMMON, mage.cards.v.VampireSocialite.class));
        cards.add(new SetCardInfo("Vanquish the Horde", 41, Rarity.RARE, mage.cards.v.VanquishTheHorde.class));
        cards.add(new SetCardInfo("Vengeful Strangler", 126, Rarity.UNCOMMON, mage.cards.v.VengefulStrangler.class));
        cards.add(new SetCardInfo("Village Reavers", 165, Rarity.UNCOMMON, mage.cards.v.VillageReavers.class));
        cards.add(new SetCardInfo("Village Watch", 165, Rarity.UNCOMMON, mage.cards.v.VillageWatch.class));
        cards.add(new SetCardInfo("Vivisection", 83, Rarity.UNCOMMON, mage.cards.v.Vivisection.class));
        cards.add(new SetCardInfo("Voldaren Ambusher", 166, Rarity.UNCOMMON, mage.cards.v.VoldarenAmbusher.class));
        cards.add(new SetCardInfo("Voldaren Stinger", 167, Rarity.COMMON, mage.cards.v.VoldarenStinger.class));
        cards.add(new SetCardInfo("Waildrifter", 55, Rarity.COMMON, mage.cards.w.Waildrifter.class));
        cards.add(new SetCardInfo("Wake to Slaughter", 250, Rarity.RARE, mage.cards.w.WakeToSlaughter.class));
        cards.add(new SetCardInfo("Willow Geist", 207, Rarity.RARE, mage.cards.w.WillowGeist.class));
        cards.add(new SetCardInfo("Wing Shredder", 169, Rarity.COMMON, mage.cards.w.WingShredder.class));
        cards.add(new SetCardInfo("Winterthorn Blessing", 251, Rarity.UNCOMMON, mage.cards.w.WinterthornBlessing.class));
        cards.add(new SetCardInfo("Wrenn and Seven", 208, Rarity.MYTHIC, mage.cards.w.WrennAndSeven.class));

        cards.removeIf(setCardInfo -> unfinished.contains(setCardInfo.getName())); // remove when mechanic is fully implemented
    }
}
