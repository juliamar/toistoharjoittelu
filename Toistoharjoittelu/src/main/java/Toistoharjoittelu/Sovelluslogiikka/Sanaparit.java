/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Toistoharjoittelu.Sovelluslogiikka;



/**
 *
 * @author Julia Martikainen
 */
public class Sanaparit {
    
    private LueTiedosto lue;
    private String[] sanalista1;
    private String[] sanalista2;
    private String[] taulukko;
    
    public Sanaparit(){
        
    }
    public void lisaaLista(String nimi){
        lue = new LueTiedosto(nimi);
        
        int taulukonKoko = lue.getKoko();
        this.sanalista1 = new String[taulukonKoko];
        this.sanalista2 = new String[taulukonKoko];
        
        this.sanalista1 = lue.getSanalista1();
        this.sanalista2 = lue.getSanalista2();
      
        
    }
    public int getKoko(){      
        return lue.getKoko();
    }
    public String getSana1(int kohta){      
        return sanalista1[kohta];
    }
    
    public String getSana2(int kohta){      
        return sanalista2[kohta];
    }
    
    public boolean onkoSanaaListalla(String sana){
        boolean check = false;
        for(int i= 0; i<lue.getKoko();i++){
            if(sana.equals(this.getSana1(i))){
                check = true;
            }
            else if(sana.equals(this.getSana2(i))){
                check = true;
        }               
        }
        return check;
    }
   
}
