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

    Arpoja arpoja;
    Sanaparit sanaparit;
    int montako;

    @Before
    public void setUp() {
        arpoja = new Arpoja();
        sanaparit = new Sanaparit();
        sanaparit.lueLista("src/main/java/Toistoharjoittelu/tiedostot/maatJaKaupungit.txt");
        montako = 2;
    }

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

}
