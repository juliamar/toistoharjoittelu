

package Toistoharjoittelu.Sovelluslogiikka;
import java.util.ArrayList;
import java.util.Random;

/**
 * Luokka toteuttaa sanojen sattumanvaraisen arpomisen.
 * @author Julia Martikainen
 */
public class Arpoja {
    private ArrayList<String> sanat;
    private Random arpoja;
    private Sanaparit sanaparilista;
    
    /**
     * Konstruktori.
     */
    public Arpoja(){
        arpoja = new Random();
        
    }
    
    /**
     * Arpoo parametrina annetun määrän sanoja parametrina annetusta listasta.
     * @param montako arvottavien sanojen lukumäärä.
     * @param sanaparilista lista, josta sanat arvotaan.
     * 
     */
    public void arvo(int montako, Sanaparit sanaparilista){
        this.sanaparilista = sanaparilista;
        this.sanat = new ArrayList<String>();
        for(int i = 0; i<montako; i++){
            this.sanat.add(i, this.sanaparilista.getSana1(arpoja.nextInt(this.sanaparilista.getKoko())));
        }       
    }
    
    public ArrayList<String> getArvotutSanat(){
        return this.sanat;  
    }
}
