package Toistoharjoittelu.Sovelluslogiikka;

import Toistoharjoittelu.tiedostonkasittely.LueTiedosto;
import java.util.ArrayList;

/**
 * Luokka hallinnoi sanapareja.
 *
 * @author Julia Martikainen
 */
public class Sanaparit {

    private LueTiedosto lue;
    private ArrayList<String> sanalista1;
    private ArrayList<String> sanalista2;
    private String[] taulukko;

    /**
     * Metodi lukee parametrina annetun listan ja tallentaa sarakkeet ArrayListeiksi.
     *
     * @param nimi tiedoston nimi.
     * @return 
     */
    public boolean lueLista(String nimi) {
        boolean totuusarvo = false;
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
        }
        return totuusarvo;
    }

}
