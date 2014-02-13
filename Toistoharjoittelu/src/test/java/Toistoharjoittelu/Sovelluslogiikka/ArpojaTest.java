<<<<<<< HEAD
=======


>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
package Toistoharjoittelu.Sovelluslogiikka;

import Toistoharjoittelu.Sovelluslogiikka.Arpoja;
import Toistoharjoittelu.Sovelluslogiikka.Sanaparit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Julia Martikainen
 */
public class ArpojaTest {
<<<<<<< HEAD

    Arpoja arpoja;
    Sanaparit sanaparit;
    int montako;

    @Before
    public void setUp() {
        arpoja = new Arpoja();
=======
    Arpoja arpoja;
    Sanaparit sanaparit;
    int montako;
    
    @Before
    public void setUp() {
        arpoja = new Arpoja();   
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
        sanaparit = new Sanaparit();
        sanaparit.lueLista("maatJaKaupungit.txt");
        montako = 2;
    }
<<<<<<< HEAD

    @Test
    public void arvoArpooOikeanMaaranSanoja() {
        arpoja.arvo(montako, sanaparit);
        int maara = arpoja.getArvotutSanat().size();
        assertEquals(2, maara);
    }

    @Test
    public void arvoArpooOikeanMaaranKaannoksia() {
        arpoja.arvo(montako, sanaparit);
        int maara = arpoja.getArvottujenKaannokset().size();
        assertEquals(2, maara);
    }
    

=======
    
    @Test
    public void arvoArpooOikeanMaaranSanoja() {
       arpoja.arvo(montako, sanaparit);
       int maara = arpoja.getArvotutSanat().size();
       assertEquals(2, maara);
    }
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
}
