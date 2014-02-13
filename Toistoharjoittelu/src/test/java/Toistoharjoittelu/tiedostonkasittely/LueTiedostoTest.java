<<<<<<< HEAD
=======

>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
package Toistoharjoittelu.tiedostonkasittely;

import Toistoharjoittelu.tiedostonkasittely.LueTiedosto;
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
public class LueTiedostoTest {
<<<<<<< HEAD

    LueTiedosto tiedosto;

=======
    LueTiedosto tiedosto;
    
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
    @Before
    public void setUp() {
        tiedosto = new LueTiedosto();
        tiedosto.lueTiedosto("maatJaKaupungit.txt");
    }
<<<<<<< HEAD

=======
    
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
    @Test
    public void loytyykoTiedosto() {
        assertTrue(tiedosto != null);

    }
<<<<<<< HEAD

    @Test
    public void tallentuukoTiedostonKokoOikein() {
        assertEquals(16, tiedosto.getKoko());

    }

=======
     @Test
    public void tallentuukoTiedostonKokoOikein() {
        assertEquals(16, tiedosto.getKoko());
        
    }
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
    @Test
    public void tallentuukoKokoSanalista1() {
        assertEquals("Kanada", tiedosto.getSanalista1().get(0));
        assertEquals("Bulgaria", tiedosto.getSanalista1().get(tiedosto.getKoko() - 1));
<<<<<<< HEAD

    }

=======
        
    }
    
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
    @Test
    public void tallentuukoKokoSanalista2() {
        assertEquals("Ottawa", tiedosto.getSanalista2().get(0));
        assertEquals("Sofia", tiedosto.getSanalista2().get(tiedosto.getKoko() - 1));
<<<<<<< HEAD

=======
        
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
    }
}
