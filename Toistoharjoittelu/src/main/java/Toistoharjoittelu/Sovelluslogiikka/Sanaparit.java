
package Toistoharjoittelu.Sovelluslogiikka;

import Toistoharjoittelu.tiedostonkasittely.LueTiedosto;
import java.util.ArrayList;



/**
 *
 * @author Julia Martikainen
 */
public class Sanaparit {
    
    private LueTiedosto lue;
    private ArrayList<String> sanalista1;
    private ArrayList<String> sanalista2;
    private String[] taulukko;
    
    public Sanaparit(){
        
    }
    public void lueLista(String nimi){
        lue = new LueTiedosto();
        lue.lueTiedosto(nimi);
        this.sanalista1 = new ArrayList<String>();
        this.sanalista2 = new ArrayList<String>();
        
        this.sanalista1 = lue.getSanalista1();
        this.sanalista2 = lue.getSanalista2();
      
        
    }
    public int getKoko(){      
        return lue.getKoko();
    }
    public String getSana1(int kohta){      
        return sanalista1.get(kohta);
    }
    
    public String getSana2(int kohta){      
        return sanalista2.get(kohta);
    }
    
    public boolean onkoSanaaListalla(String sana){
        boolean check = false;
        for(int i= 0; i<lue.getKoko();i++){
            if(sana.equals(this.getSana2(i))){
                check = true;
            }                        
        }
        return check;
    }
   
}
