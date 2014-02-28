package Toistoharjoittelu.Sovelluslogiikka;

import java.util.ArrayList;
import java.util.Random;

/**
 * Luokka toteuttaa sanojen sattumanvaraisen arpomisen.
 *
 * @author Julia Martikainen
 */
public class Arpoja {

    private ArrayList<String> sanat;
    private Random arpoja;
    private Sanaparit sanaparilista;
    private ArrayList<String> kaannokset;

    /**
     * Konstruktori luo kolme uutta oliota.
     */
    public Arpoja() {
        arpoja = new Random();
        this.sanat = new ArrayList<String>();
        this.kaannokset = new ArrayList<String>();

    }

    /**
     * Metodi arpoo parametrina annetun määrän sanoja parametrina annetusta
     * listasta.
     *
     * @param montako arvottavien sanojen lukumäärä.
     * @param sanaparilista lista, josta sanat arvotaan.
     *
     */
    public void arvo(int montako, Sanaparit sanaparilista) {
        this.sanaparilista = sanaparilista;
        int koko = this.sanaparilista.getKoko();
        int i = 0;
        ArrayList<Integer> arvot = new ArrayList<Integer>();

        while (i < montako) {
            int arvottuArvo = arpoja.nextInt(koko);
            if (!(arvot.contains(arvottuArvo))) {
                arvot.add(arvottuArvo);
                this.sanat.add(this.sanaparilista.getSana1(arvottuArvo));
                this.kaannokset.add(this.sanaparilista.getSana2(arvottuArvo));
                i++;
            }

        }

    }

    public ArrayList<String> getArvotutSanat() {
        return this.sanat;
    }

    public ArrayList<String> getArvottujenKaannokset() {
        return this.kaannokset;
    }
}
