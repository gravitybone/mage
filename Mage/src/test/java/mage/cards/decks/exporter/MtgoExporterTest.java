package mage.cards.decks.exporter;

import mage.cards.decks.DeckCardInfo;
import mage.cards.decks.DeckCardLists;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class MtgoExporterTest {

    @Test
    public void writeDeck() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DeckCardLists deck = new DeckCardLists();
        deck.getCards().add(new DeckCardInfo("Forest", "RNA", "1", 2));
        deck.getCards().add(new DeckCardInfo("Plains", "RNA", "2", 3));
        deck.getSideboard().add(new DeckCardInfo("Island", "RNA", "3", 2));
        MtgoExporter exporter = new MtgoExporter();
        exporter.writeDeck(baos, deck);
        assertEquals(
                "2 Forest\n" +
                "3 Plains\n" +
                "\n" +
                "\n" +
                "2 Island\n" +
                "\n", new String(baos.toByteArray()));
    }

}