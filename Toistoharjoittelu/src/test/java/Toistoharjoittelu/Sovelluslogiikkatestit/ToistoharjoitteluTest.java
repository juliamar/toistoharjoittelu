

package Toistoharjoittelu.Sovelluslogiikkatestit;

import Toistoharjoittelu.Sovelluslogiikka.Arpoja;
import Toistoharjoittelu.Sovelluslogiikka.Sanaparit;
import Toistoharjoittelu.Sovelluslogiikka.Toistoharjoittelu;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Julia Martikainen
 */
public class ToistoharjoitteluTest {
     Toistoharjoittelu harjoittelu;
    
    @Before
    public void setUp() {
        harjoittelu = new Toistoharjoittelu();
    }
    
    @Test
    public void lueListaToimii() {
        harjoittelu.lueLista("maatJaKaupungit.txt");
        String sana = harjoittelu.getSana1(0);
        assertEquals("Kanada", sana);
    }
   
    @Test
    public void josSanaListallaPalauttaaTrue() {
        harjoittelu.lueLista("maatJaKaupungit.txt");
        assertTrue(harjoittelu.OnkoSanaListalla("Ottawa"));
        
    }
    public void josSanaEiListallaPalauttaaFalse() {
        harjoittelu.lueLista("maatJaKaupungit.txt");
        assertFalse(harjoittelu.OnkoSanaListalla("Australia"));     
    }
    
     @Test
    public void samannimistaListaaEiVoiLisata() {
        assertFalse(harjoittelu.tallennaSanaparilista("maatJaKaupungit.txt"));
    }
}
