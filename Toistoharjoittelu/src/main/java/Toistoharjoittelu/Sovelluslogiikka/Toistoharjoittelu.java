package Toistoharjoittelu.Sovelluslogiikka;

import Toistoharjoittelu.tiedostonkasittely.TiedostoonKirjoittaminen;
import Toistoharjoittelu.tiedostonkasittely.LueTiedosto;
import java.util.ArrayList;

/**
 * Tämä luokka hallinnoi sovelluslogiikkaa.
 *
 * @author Julia Martikainen
 */
public class Toistoharjoittelu {

    private Sanaparit sanaparit;
    private TiedostoonKirjoittaminen kirjoita;
    private LueTiedosto lue;
    private Arpoja arvo;

    /**
     * Konstruktori.
     */
    public Toistoharjoittelu() {
        this.sanaparit = new Sanaparit();
        this.kirjoita = new TiedostoonKirjoittaminen();
        this.arvo = new Arpoja();
        this.lue = new LueTiedosto();

    }

    public ArrayList<String> getArvotutSanat(int lukumaara) {
        this.arvo.arvo(lukumaara, sanaparit);
        return this.arvo.getArvotutSanat();
    }

    public ArrayList<String> getKaannokset() {
        return this.arvo.getArvottujenKaannokset();
    }

    /**
     * Metodi tallentaa parametrina annetun tiedoston nimen tiedostoon.
     *
     * @param tiedostonNimi tallennettavan tiedoston nimi.
     * @return true jos tallennus onnistuu.
     */
    public boolean tallennaSanaparilista(String tiedostonNimi) {
        return kirjoita.tallennaLista(tiedostonNimi);
    }

    public ArrayList<String> getSanalistojenNimet() {
        //lukee tiedoston, jossa listojen nimet ja tallentaa ArrayListiin
        this.lue.lueListaTiedosto("listat.txt");
        return this.lue.getNimet();
    }

    /**
     * Metodi lukee parametrina annetun tiedoston.
     *
     * @param tiedostonNimi Luettavan tiedoston nimi.
     * @return true jos tiedoston lukeminen onnistuu, muuten false.
     */
    public boolean lueLista(String tiedostonNimi) {
        boolean totuusarvo = false;
        if (this.sanaparit.lueLista(tiedostonNimi)) {
            totuusarvo = true;
        }
        return totuusarvo;
    }

    public String getSana1(int kohta) {
        return this.sanaparit.getSana1(kohta);

    }

    public String getSana2(int kohta) {
        return this.sanaparit.getSana2(kohta);

    }

    /**
     * Metodi tarkistaa löytyykö parametrina annettu sana Sanaparilistalta.
     *
     * @param sana tarkistettava sana.
     * @return true jos sana löytyy listalta.
     */
    public boolean OnkoSanaListalla(String sana) {
        return this.sanaparit.onkoSanaaListalla(sana);
    }

    /**
     * Metodi tallentaa väärin arvatut sanat tiedostoon.
     *
     * @param tiedostonNimi Tiedosto väärin arvatuille sanoille.
     * @param sana1 tallennettava kysytty sana.
     * @param sana2 tallennettava käännös.
     *
     */
    public void tallennaVaaratSanat(String tiedostonNimi, String sana1, String sana2) {

        this.kirjoita.kirjoitaTiedostoon(tiedostonNimi, sana1, sana2);
    }

//    public void poistaLista(String nimi){
//        ArrayList<String> nimet = lue.getNimet();
//        boolean arvo = true;
//        int kohta = 0;
//
//        ArrayList<String> uusiLista = new ArrayList<String>();
//        for(int i = 0; i < nimet.size(); i++){
//            if(nimet.get(i).equals(nimi)){
//                arvo = false;
//                kohta = i;
//            }
//        }    
//        nimet.remove(kohta);
//        
//        
//        if(arvo){
//            kirjoita.tallennaUusiLista(nimet);
//        }
//            
//   }
}
