<<<<<<< HEAD
=======


>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
package Toistoharjoittelu.Sovelluslogiikka;

import Toistoharjoittelu.Sovelluslogiikka.Arvaukset;
import Toistoharjoittelu.Sovelluslogiikka.Sanaparit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
<<<<<<< HEAD

=======
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
/**
 *
 * @author Julia Martikainen
 */
public class SanaparitTest {
<<<<<<< HEAD

    Sanaparit sanaparit;

=======
    Sanaparit sanaparit;
    
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
    @Before
    public void setUp() {
        sanaparit = new Sanaparit();
        sanaparit.lueLista("maatJaKaupungit.txt");
    }
<<<<<<< HEAD

=======
    
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
    @Test
    public void lisaaListaLukeeTiedoston() {
        assertTrue(sanaparit != null);
    }
<<<<<<< HEAD

    @Test
    public void sanalistatOvatOikeanPituisia() {
        assertEquals("Kanada", sanaparit.getSana1(0));
        assertEquals("Ottawa", sanaparit.getSana2(0));
        assertEquals("Bulgaria", sanaparit.getSana1(sanaparit.getKoko() - 1));
        assertEquals("Sofia", sanaparit.getSana2(sanaparit.getKoko() - 1));
    }

=======
    
    @Test
    public void sanalistatOvatOikeanPituisia() {
        assertEquals("Kanada",sanaparit.getSana1(0));
        assertEquals("Ottawa",sanaparit.getSana2(0));
        assertEquals("Bulgaria",sanaparit.getSana1(sanaparit.getKoko() - 1));
        assertEquals("Sofia",sanaparit.getSana2(sanaparit.getKoko() - 1));
    }
   
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
    @Test
    public void sanaLoytyyJosListalla() {
        boolean vastaus = sanaparit.onkoSanaaListalla("Ankara");

        assertTrue(vastaus);
    }
<<<<<<< HEAD

=======
    
    
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
}
