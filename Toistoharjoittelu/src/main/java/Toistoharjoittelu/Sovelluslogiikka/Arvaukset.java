package Toistoharjoittelu.Sovelluslogiikka;

/**
 * Luokka tallentaa väärien ja oikeiden arvausten lukumäärät.
 *
 * @author Julia Martikainen
 */
public class Arvaukset {

    private int oikein;
    private int vaarin;
    private int arvatut;

    /**
     * Konstruktori alustaa arvausten lukumäärät.
     */
    public Arvaukset() {
        this.oikein = 0;
        this.vaarin = 0;
        this.arvatut = 0;

    }

    /**
     * Metodi kasvattaa oikeita arvauksia yhdellä.
     */
    public void lisaaOikein() {
        this.oikein = this.oikein + 1;
        this.arvatut++;
    }

    /**
     * Metodi kasvattaa vääriä arvauksia yhdellä.
     */
    public void lisaaVaarin() {
        this.vaarin = this.vaarin + 1;
        this.arvatut++;
    }

    public int getArvaukset() {
        return this.arvatut;
    }

    public int getOikein() {

        return this.oikein;
    }

    public int getVaarin() {
        return this.vaarin;
    }
}
