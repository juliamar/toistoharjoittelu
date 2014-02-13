<<<<<<< HEAD
package Toistoharjoittelu.Sovelluslogiikka;

=======


package Toistoharjoittelu.Sovelluslogiikka;



>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
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
<<<<<<< HEAD

    Toistoharjoittelu harjoittelu;
    LueTiedosto tiedosto;

=======
     Toistoharjoittelu harjoittelu;
     LueTiedosto tiedosto;

    
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
    @Before
    public void setUp() {
        tiedosto = new LueTiedosto();
        harjoittelu = new Toistoharjoittelu();
        harjoittelu.lueLista("maatJaKaupungit.txt");
    }
<<<<<<< HEAD

=======
    
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
    @Test
    public void getArvotutSanatPalauttaaOikeanPituisenListan() {
        ArrayList<String> palautus = new ArrayList<String>();
        palautus = harjoittelu.getArvotutSanat(5);
        assertEquals(5, palautus.size());
    }
<<<<<<< HEAD

    @Test
    public void getArvottenKaannoksetPalauttaaOikeanPituisenListan() {
        ArrayList<String> palautus = new ArrayList<String>();
        ArrayList<String> arpominen = harjoittelu.getArvotutSanat(5);
        palautus = harjoittelu.getKaannokset();
        assertEquals(5, palautus.size());
    }

=======
    
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
    @Test
    public void getSanalistojenNimetPalauttaaNimet() {
        ArrayList<String> palautus = new ArrayList<String>();
        palautus = harjoittelu.getSanalistojenNimet();
        assertEquals("maatJaKaupungit.txt", palautus.get(0));
    }
<<<<<<< HEAD

=======
    
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
    @Test
    public void getSana1Toimii() {
        String sana = harjoittelu.getSana1(0);
        assertEquals("Kanada", sana);
    }
<<<<<<< HEAD

=======
    
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
    @Test
    public void getSana2Toimii() {
        String sana = harjoittelu.getSana2(0);
        assertEquals("Ottawa", sana);
    }

<<<<<<< HEAD
    @Test
    public void josSanaListallaPalauttaaTrue() {
        assertTrue(harjoittelu.OnkoSanaListalla("Ottawa"));

    }

    public void josSanaEiListallaPalauttaaFalse() {
        assertFalse(harjoittelu.OnkoSanaListalla("Australia"));
    }

    @Test
    public void samannimistaListaaEiVoiLisata() {
        assertFalse(harjoittelu.tallennaSanaparilista("maatJaKaupungit.txt"));
    }

    @Test
    public void tallennaVaaratSanatToimii() {
        harjoittelu.tallennaVaaratSanat("Testi2.txt", "Kissa", "Cat");
        tiedosto.lueTiedosto("Testi2.txt");
        assertTrue(tiedosto != null);
    }

=======
   
    @Test
    public void josSanaListallaPalauttaaTrue() {
        assertTrue(harjoittelu.OnkoSanaListalla("Ottawa"));
        
    }
    public void josSanaEiListallaPalauttaaFalse() {
        assertFalse(harjoittelu.OnkoSanaListalla("Australia"));     
    }
    
     @Test
    public void samannimistaListaaEiVoiLisata() {
        assertFalse(harjoittelu.tallennaSanaparilista("maatJaKaupungit.txt"));
    }
    
    @Test
    public void tallennaVaaratSanatToimii() {
        harjoittelu.tallennaVaaratSanat("testi.txt", "Kissa", "Cat");
        tiedosto.lueTiedosto("testi.txt");
        assertTrue(tiedosto != null);
    }
    
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
}
