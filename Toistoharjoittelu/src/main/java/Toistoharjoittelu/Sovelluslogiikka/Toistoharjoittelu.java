

package Toistoharjoittelu.Sovelluslogiikka;

import Toistoharjoittelu.tiedostonkasittely.TiedostoonKirjoittaminen;
import Toistoharjoittelu.tiedostonkasittely.LueTiedosto;
import java.util.ArrayList;

/**
 * Tämä luokka hallinnoi sovelluslogiikkaa.
 * @author Julia Martikainen
 */
public class Toistoharjoittelu {
    private Sanaparit sanaparit;
    private TiedostoonKirjoittaminen kirjoita;
    private LueTiedosto lue;
    private Arpoja arvo;
   
    
     public Toistoharjoittelu() {
       this.sanaparit = new Sanaparit();
       this.kirjoita = new TiedostoonKirjoittaminen();
       this.arvo = new Arpoja();
       this.lue = new LueTiedosto();

    }
    
    public ArrayList<String> getArvotutSanat(int lukumaara){
        this.arvo.arvo(lukumaara, sanaparit);
        return this.arvo.getArvotutSanat();
    }
    
    public boolean tallennaSanaparilista(String tiedostonNimi){
        return kirjoita.tallennaLista(tiedostonNimi);
    }
    
    public ArrayList<String> getSanalistojenNimet(){
    //lue tiedosto, jossa listojen nimet ja tulostaa nimet
        this.lue.lueListaTiedosto("listat.txt");
        return this.lue.getNimet();        
    }
    
    public void tulostaListojenNimet(){
        ArrayList<String> nimet = this.getSanalistojenNimet();
        for(String nimi : nimet){
            System.out.println(nimi);
        }
    }
    
    // lukee syötetyn nimisen tiedoston
    public void lueLista(String listanNimi){
        this.sanaparit.lueLista(listanNimi);
    }
    
    public String getSana1(int kohta){
       return this.sanaparit.getSana1(kohta);
                      
    }    
     public String getSana2(int kohta){
       return this.sanaparit.getSana2(kohta);
                      
    } 
      
    public boolean OnkoSanaListalla(String sana){
    //tarkista onko arvattu sana listalla
        return this.sanaparit.onkoSanaaListalla(sana);
    }
    
    public void tallennaVaaratSanat(String sana1, String sana2){
    //tallenna väärin arvatut sanat tiedostoon
        this.kirjoita.kirjoitaTiedostoon(sana1, sana2);
    }
    
    public void poistaLista(String nimi){
        ArrayList<String> nimet = lue.getNimet();
        boolean arvo = true;
        int kohta = 0;

        ArrayList<String> uusiLista = new ArrayList<String>();
        for(int i = 0; i < nimet.size(); i++){
            if(nimet.get(i).equals(nimi)){
                arvo = false;
                kohta = i;
            }
        }    
        nimet.remove(kohta);
        
        
        if(arvo){
            kirjoita.tallennaUusiLista(nimet);
        }
            
   }
   
    
}
