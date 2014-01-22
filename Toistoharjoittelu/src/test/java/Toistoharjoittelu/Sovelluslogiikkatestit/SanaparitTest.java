

package Toistoharjoittelu.Sovelluslogiikkatestit;

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
        sanaparit.lisaaLista("maatJaKaupungit.txt");
    }
    
    @Test
    public void lisaaListaLukeeTiedoston() {
        assertTrue(sanaparit != null);
    }
    
    @Test
    public void sanalistatOvatOikeanPituisia() {
        assertEquals("Kanada",sanaparit.getSana1(0));
        assertEquals("Ottawa",sanaparit.getSana2(0));
        assertEquals("Bulgaria",sanaparit.getSana1(sanaparit.getKoko()));
        assertEquals("Sofia",sanaparit.getSana2(sanaparit.getKoko()));
    }
   
    @Test
    public void sanaLoytyyJosListoilla() {
        boolean vastaus1 = sanaparit.onkoSanaaListalla("Turkki");
        boolean vastaus2 = sanaparit.onkoSanaaListalla("Ankara");
        assertTrue(vastaus1);
        assertTrue(vastaus2);
    }
    
    
}
