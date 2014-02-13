package Toistoharjoittelu.Sovelluslogiikka;

import java.util.ArrayList;
import java.util.Random;

/**
 * Luokka toteuttaa sanojen sattumanvaraisen arpomisen.
<<<<<<< HEAD
 *
=======
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
 * @author Julia Martikainen
 */
public class Arpoja {

    private ArrayList<String> sanat;
    private Random arpoja;
    private Sanaparit sanaparilista;
<<<<<<< HEAD
    private ArrayList<String> kaannokset;

    /**
     * Konstruktori luo kolme uutta oliota.
     */
    public Arpoja() {
=======
    
    /**
     * Konstruktori.
     */
    public Arpoja(){
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
        arpoja = new Random();
        this.sanat = new ArrayList<String>();
        this.kaannokset = new ArrayList<String>();

    }
<<<<<<< HEAD

    /**
     * Metodi arpoo parametrina annetun määrän sanoja parametrina annetusta listasta.
     *
     * @param montako arvottavien sanojen lukumäärä.
     * @param sanaparilista lista, josta sanat arvotaan.
     *
     */
    public void arvo(int montako, Sanaparit sanaparilista) {
        this.sanaparilista = sanaparilista;
        int koko = this.sanaparilista.getKoko()-1;

        
        for (int i = 0; i < montako; i++) {
            int arvottuArvo = arpoja.nextInt(koko);
            this.sanat.add( this.sanaparilista.getSana1(arvottuArvo));
            this.kaannokset.add(this.sanaparilista.getSana2(arvottuArvo));

        }
    }

    public ArrayList<String> getArvotutSanat() {
        return this.sanat;
=======
    
    /**
     * Arpoo parametrina annetun määrän sanoja parametrina annetusta listasta.
     * @param montako arvottavien sanojen lukumäärä.
     * @param sanaparilista lista, josta sanat arvotaan.
     * 
     */
    public void arvo(int montako, Sanaparit sanaparilista){
        this.sanaparilista = sanaparilista;
        this.sanat = new ArrayList<String>();
        for(int i = 0; i<montako; i++){
            this.sanat.add(i, this.sanaparilista.getSana1(arpoja.nextInt(this.sanaparilista.getKoko())));
        }       
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
    }
    
    public ArrayList<String> getArvottujenKaannokset(){
        return this.kaannokset;
    }
}
