<<<<<<< HEAD
=======


>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
package Toistoharjoittelu.Sovelluslogiikka;

import Toistoharjoittelu.Sovelluslogiikka.Arvaukset;
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
public class ArvauksetTest {
<<<<<<< HEAD

=======
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
    Arvaukset arvaukset;

    @Before
    public void setUp() {
        arvaukset = new Arvaukset();
    }
<<<<<<< HEAD

=======
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
    @Test
    public void luotuArvausOlemassa() {
        assertTrue(arvaukset != null);
    }
<<<<<<< HEAD

=======
    
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
    @Test
    public void oikeinArvattujaAluksiNolla() {
        assertEquals(0, arvaukset.getOikein());
    }
<<<<<<< HEAD

=======
    
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
    @Test
    public void vaarinArvattujaAluksiNolla() {
        assertEquals(0, arvaukset.getVaarin());
    }
<<<<<<< HEAD

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
=======
    
    @Test
    public void oikeatArvauksetKasvavatYhdella(){
        arvaukset.lisaaOikein();
        assertEquals(1, arvaukset.getOikein());
    }
    
    @Test
    public void vaaratArvauksetKasvavatYhdella(){
        arvaukset.lisaaVaarin();
        assertEquals(1, arvaukset.getVaarin());
    }
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
}
