package Toistoharjoittelu.tiedostonkasittely;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Julia Martikainen
 */
public class TiedostoonKirjoittaminenTest {

    TiedostoonKirjoittaminen kirjoita;
    LueTiedosto lue;

    @Before
    public void setUp() {
        kirjoita = new TiedostoonKirjoittaminen();
        lue = new LueTiedosto();
    }

    @Test
    public void kirjoitaTiedostoonToimii() {
        kirjoita.kirjoitaTiedostoon("Testi1.txt", "Koira", "dog");
        lue.lueTiedosto("Testi1.txt");
        assertTrue(lue != null);
    }
    
}
