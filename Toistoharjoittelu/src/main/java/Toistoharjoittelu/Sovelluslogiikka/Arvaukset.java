<<<<<<< HEAD
=======

>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
package Toistoharjoittelu.Sovelluslogiikka;

/**
 * Luokka tallentaa väärien ja oikeiden arvausten lukumäärät.
<<<<<<< HEAD
 *
=======
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
 * @author Julia Martikainen
 */
public class Arvaukset {

    private int oikein;
    private int vaarin;
<<<<<<< HEAD
    private int arvatut;

    /**
     * Konstruktori alustaa arvausten lukumäärät.
     */
    public Arvaukset() {
=======
    
    /**
     * Konstruktori.
     */
    public Arvaukset(){
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
        this.oikein = 0;
        this.vaarin = 0;
        this.arvatut = 0;

    }
<<<<<<< HEAD

    /**
     * Metodi kasvattaa oikeita arvauksia yhdellä.
     */
    public void lisaaOikein() {
=======
    
    /**
     * Kasvattaa oikeita arvauksia yhdellä.
     */
    public void lisaaOikein(){
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
        this.oikein = this.oikein + 1;
        this.arvatut++;
    }
<<<<<<< HEAD

    /**
     * Metodi kasvattaa vääriä arvauksia yhdellä.
     */
    public void lisaaVaarin() {
=======
    
     /**
     * Kasvattaa vääriä arvauksia yhdellä.
     */
    public void lisaaVaarin(){
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
        this.vaarin = this.vaarin + 1;
        this.arvatut++;
    }

    public int getArvaukset(){
        return this.arvatut;
    }
    public int getOikein() {

        return this.oikein;
    }

    public int getVaarin() {
        return this.vaarin;
    }
}
