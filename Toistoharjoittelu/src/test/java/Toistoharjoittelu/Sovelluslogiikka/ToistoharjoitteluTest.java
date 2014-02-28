package Toistoharjoittelu.Sovelluslogiikka;

import Toistoharjoittelu.tiedostonkasittely.LueTiedosto;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Julia Martikainen
 */
public class ToistoharjoitteluTest {

    Toistoharjoittelu harjoittelu;
    LueTiedosto tiedosto;

    @Before
    public void setUp() {
        tiedosto = new LueTiedosto();
        harjoittelu = new Toistoharjoittelu();
        harjoittelu.lueLista("src/main/java/Toistoharjoittelu/tiedostot/maatJaKaupungit.txt");
    }

    @Test
    public void getArvotutSanatPalauttaaOikeanPituisenListan() {
        ArrayList<String> palautus = new ArrayList<String>();
        palautus = harjoittelu.getArvotutSanat(5);
        assertEquals(5, palautus.size());
    }

    @Test
    public void getListanPituusPalauttaaOikeanArvon() {
        assertEquals(13, this.harjoittelu.getListanPituus());
    }

    @Test
    public void getArvottenKaannoksetPalauttaaOikeanPituisenListan() {
        ArrayList<String> palautus = new ArrayList<String>();
        ArrayList<String> arpominen = harjoittelu.getArvotutSanat(5);
        palautus = harjoittelu.getKaannokset();
        assertEquals(5, palautus.size());
    }

    @Test
    public void getSana1Toimii() {
        String sana = harjoittelu.getSana1(0);
        assertEquals("Kanada", sana);
    }

    @Test
    public void getSana2Toimii() {
        String sana = harjoittelu.getSana2(0);
        assertEquals("Ottawa", sana);
    }

    @Test
    public void josSanaListallaPalauttaaTrue() {
        assertTrue(harjoittelu.onkoSanaListalla("Ottawa"));

    }

    @Test
    public void josSanaEiListallaPalauttaaFalse() {
        assertFalse(harjoittelu.onkoSanaListalla("Australia"));
    }

    @Test
    public void josMaaraOikeanPalauttaaTrue() {
        int monta = 1;
        assertTrue(harjoittelu.onkoOikeaMaara(monta));
    }

    @Test
    public void josMaaraNegatiivinenPalauttaaFalse() {
        int monta = -1;
        assertFalse(harjoittelu.onkoOikeaMaara(monta));
    }

    @Test
    public void josMaaraYhtasuuriKuinListanPituusPalauttaaTrue() {
        int monta = 13;
        assertTrue(harjoittelu.onkoOikeaMaara(monta));
    }

    @Test
    public void josMaaraSuurempiKuinListanPituusPalauttaaFalse() {
        int monta = 20;
        assertFalse(harjoittelu.onkoOikeaMaara(monta));
    }

    @Test
    public void tallennaVaaratSanatToimii() {
        harjoittelu.tallennaVaaratSanat("Testi2.txt", "Kissa", "Cat");
        tiedosto.lueTiedosto("Testi2.txt");
        assertTrue(tiedosto != null);
    }

}
