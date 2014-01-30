

package Toistoharjoittelu.Sovelluslogiikka;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Julia Martikainen
 */
public class Arpoja {
    private ArrayList<String> sanat;
    private Random arpoja;
    private Sanaparit sanaparilista;
    
    public Arpoja(){
        arpoja = new Random();
        
    }
    public void arvo(int montako, Sanaparit sanaparilista){
        this.sanaparilista = sanaparilista;
        this.sanat = new ArrayList<String>();
        for(int i = 0; i<montako; i++){
            //this.sanat[i] = this.sanaparilista.getSana1(arpoja.nextInt(this.sanaparilista.getKoko()));
            this.sanat.add(i, this.sanaparilista.getSana1(arpoja.nextInt(this.sanaparilista.getKoko())));
        }       
    }
    
    public ArrayList<String> getArvotutSanat(){
        return this.sanat;  
    }
}
