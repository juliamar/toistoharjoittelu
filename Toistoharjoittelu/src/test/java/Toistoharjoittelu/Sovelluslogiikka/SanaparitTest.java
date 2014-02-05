

package Toistoharjoittelu.Sovelluslogiikka;

import Toistoharjoittelu.Sovelluslogiikka.Arvaukset;
import Toistoharjoittelu.Sovelluslogiikka.Sanaparit;
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
public class SanaparitTest {
    Sanaparit sanaparit;
    
    @Before
    public void setUp() {
        sanaparit = new Sanaparit();
        sanaparit.lueLista("maatJaKaupungit.txt");
    }
    
    @Test
    public void lisaaListaLukeeTiedoston() {
        assertTrue(sanaparit != null);
    }
    
    @Test
    public void sanalistatOvatOikeanPituisia() {
        assertEquals("Kanada",sanaparit.getSana1(0));
        assertEquals("Ottawa",sanaparit.getSana2(0));
        assertEquals("Bulgaria",sanaparit.getSana1(sanaparit.getKoko() - 1));
        assertEquals("Sofia",sanaparit.getSana2(sanaparit.getKoko() - 1));
    }
   
    @Test
    public void sanaLoytyyJosListalla() {
        boolean vastaus = sanaparit.onkoSanaaListalla("Ankara");

        assertTrue(vastaus);
    }
    
    
}
