package Toistoharjoittelu.tiedostonkasittely;

import Toistoharjoittelu.tiedostonkasittely.LueTiedosto;
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
public class LueTiedostoTest {

    LueTiedosto tiedosto;

    @Before
    public void setUp() {
        tiedosto = new LueTiedosto();
        tiedosto.lueTiedosto("maatJaKaupungit.txt");
    }

    @Test
    public void loytyykoTiedosto() {
        assertTrue(tiedosto != null);

    }

    @Test
    public void tallentuukoTiedostonKokoOikein() {
        assertEquals(16, tiedosto.getKoko());

    }

    @Test
    public void tallentuukoKokoSanalista1() {
        assertEquals("Kanada", tiedosto.getSanalista1().get(0));
        assertEquals("Bulgaria", tiedosto.getSanalista1().get(tiedosto.getKoko() - 1));

    }

    @Test
    public void tallentuukoKokoSanalista2() {
        assertEquals("Ottawa", tiedosto.getSanalista2().get(0));
        assertEquals("Sofia", tiedosto.getSanalista2().get(tiedosto.getKoko() - 1));

    }
}
