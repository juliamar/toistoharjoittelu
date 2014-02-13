package Toistoharjoittelu.Sovelluslogiikka;

import Toistoharjoittelu.Sovelluslogiikka.Arvaukset;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Julia Martikainen
 */
public class ArvauksetTest {

    Arvaukset arvaukset;

    @Before
    public void setUp() {
        arvaukset = new Arvaukset();
    }

    @Test
    public void luotuArvausOlemassa() {
        assertTrue(arvaukset != null);
    }

    @Test
    public void oikeinArvattujaAluksiNolla() {
        assertEquals(0, arvaukset.getOikein());
    }

    @Test
    public void vaarinArvattujaAluksiNolla() {
        assertEquals(0, arvaukset.getVaarin());
    }

    @Test
    public void oikeatArvauksetKasvavatYhdella() {
        arvaukset.lisaaOikein();
        assertEquals(1, arvaukset.getOikein());
    }

    @Test
    public void vaaratArvauksetKasvavatYhdella() {
        arvaukset.lisaaVaarin();
        assertEquals(1, arvaukset.getVaarin());
    }

    @Test
    public void arvauksiaOikeaMaara() {
        arvaukset.lisaaVaarin();
        arvaukset.lisaaOikein();
        assertEquals(2, arvaukset.getArvaukset());
    }
}
