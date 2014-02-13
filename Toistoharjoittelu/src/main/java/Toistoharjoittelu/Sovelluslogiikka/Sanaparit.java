package Toistoharjoittelu.Sovelluslogiikka;

import Toistoharjoittelu.tiedostonkasittely.LueTiedosto;
import java.util.ArrayList;

/**
 * Luokka hallinnoi sanapareja.
<<<<<<< HEAD
 *
=======
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
 * @author Julia Martikainen
 */
public class Sanaparit {

    private LueTiedosto lue;
    private ArrayList<String> sanalista1;
    private ArrayList<String> sanalista2;
    private String[] taulukko;
<<<<<<< HEAD

    /**
     * Metodi lukee parametrina annetun listan ja tallentaa sarakkeet ArrayListeiksi.
     *
     * @param nimi tiedoston nimi.
     * @return 
     */
    public boolean lueLista(String nimi) {
        boolean totuusarvo = false;
=======
    
    /**
     * Lukee parametrina annetun listan ja tallentaa sarakkeet ArrayListeiksi.
     * @param nimi tiedoston nimi.
     */
    public void lueLista(String nimi){
        lue = new LueTiedosto();
        lue.lueTiedosto(nimi);
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
        this.sanalista1 = new ArrayList<String>();
        this.sanalista2 = new ArrayList<String>();
        lue = new LueTiedosto();
        
        if (lue.lueTiedosto(nimi)) {
            this.sanalista1 = lue.getSanalista1();
            this.sanalista2 = lue.getSanalista2();
            totuusarvo = true;
        }
        return totuusarvo;
    }

    public int getKoko() {
        return lue.getKoko();
    }

    public String getSana1(int kohta) {
        return sanalista1.get(kohta);
    }

    public String getSana2(int kohta) {
        return sanalista2.get(kohta);
    }
<<<<<<< HEAD

    /**
     * Metodi tarkistaa löytyykö parametrina annettu sana listalta.
     *
     * @param sana tarkistettava sana.
     * @return true jos sana löytyy.
     */
    public boolean onkoSanaaListalla(String sana) {
        boolean totuusarvo = false;
        for (int i = 0; i < lue.getKoko(); i++) {
            if (sana.equals(this.getSana2(i))) {
                totuusarvo = true;
            }
=======
    
    /**
     * Tarkistaa löytyykö parametrina annettu sana listalta.
     * @param sana tarkistettava sana.
     * @return true jos sana löytyy.
     */
    public boolean onkoSanaaListalla(String sana){
        boolean check = false;
        for(int i= 0; i<lue.getKoko();i++){
            if(sana.equals(this.getSana2(i))){
                check = true;
            }                        
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
        }
        return totuusarvo;
    }

}
