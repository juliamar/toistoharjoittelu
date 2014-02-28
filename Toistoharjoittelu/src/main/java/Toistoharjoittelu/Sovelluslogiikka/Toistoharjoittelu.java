package Toistoharjoittelu.Sovelluslogiikka;

import Toistoharjoittelu.tiedostonkasittely.TiedostoonKirjoittaminen;
import Toistoharjoittelu.tiedostonkasittely.LueTiedosto;
import java.io.File;
import java.io.FileNotFoundException;
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
    public boolean tallennaSanaparilista(String tiedostopolku) {

        return kirjoita.tallennaLista(tiedostopolku);

    }

    public ArrayList<String> getSanalistojenTiedostopolut() {
        //lukee tiedoston, jossa listojen nimet ja tallentaa ArrayListiin
        ArrayList<String> nimet = new ArrayList<String>();

        if (this.lue.lueListaTiedosto("listat.txt")) {
            nimet = this.lue.getNimet();
        }

        return nimet;
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

    public int getListanPituus() {
        return this.sanaparit.getKoko();
    }

    /**
     * Metodi tarkistaa löytyykö parametrina annettu sana Sanaparilistalta.
     *
     * @param sana tarkistettava sana.
     * @return true jos sana löytyy listalta.
     */
    public boolean onkoSanaListalla(String sana) {
        return this.sanaparit.onkoSanaaListalla(sana);
    }

    /**
     * Metodi tarkistaa onko käyttäjän syöttämä kysyttävien sanojen määrä
     * positiivinen kokonaisluku, joka ei ole suurempi kuin listalla olevien
     * sanaparien määrä.
     *
     * @param monta tarkistettava arvo.
     * @return true jos arvo on hyväksyttävä, muuten false.
     */
    public boolean onkoOikeaMaara(int monta) {
        boolean totuusarvo = false;
        if (monta > 0 && monta <= this.getListanPituus()) {
            totuusarvo = true;
        }
        return totuusarvo;
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

}
