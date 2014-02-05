
package Toistoharjoittelu.Sovelluslogiikka;

/**
 * Luokka tallentaa väärien ja oikeiden arvausten lukumäärät.
 * @author Julia Martikainen
 */
public class Arvaukset {
    
    private int oikein;
    private int vaarin;
    
    /**
     * Konstruktori.
     */
    public Arvaukset(){
        this.oikein = 0;
        this.vaarin = 0;
          
    }
    
    /**
     * Kasvattaa oikeita arvauksia yhdellä.
     */
    public void lisaaOikein(){
        this.oikein = this.oikein + 1;
    }
    
     /**
     * Kasvattaa vääriä arvauksia yhdellä.
     */
    public void lisaaVaarin(){
        this.vaarin = this.vaarin + 1;
    }
    
    public int getOikein(){
    
        return this.oikein;
    }
    
    public int getVaarin(){
        return this.vaarin;
    }
}
