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
public class Arvaukset {
    
    private int oikein;
    private int vaarin;
    
    public Arvaukset(){
        this.oikein = 0;
        this.vaarin = 0;
          
    }
    
    public void lisaaOikein(){
        this.oikein = this.oikein + 1;
    }
    
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
