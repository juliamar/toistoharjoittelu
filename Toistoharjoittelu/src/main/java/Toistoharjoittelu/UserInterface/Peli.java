<<<<<<< HEAD
package Toistoharjoittelu.UserInterface;

import Toistoharjoittelu.Sovelluslogiikka.Arvaukset;
import Toistoharjoittelu.Sovelluslogiikka.Toistoharjoittelu;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Luokka toteuttaa toistoharjoittelupelin.
 *
 * @author Julia Martikainen
 */
public class Peli {

    private Toistoharjoittelu harjoittelu;
    private Arvaukset arvaukset;

    /**
     * Konstruktori luo kaksi uutta oliota.
     */
    public Peli() {
        this.harjoittelu = new Toistoharjoittelu();
        this.arvaukset = new Arvaukset();

    }

    /**
     * Metodi pyytää käyttäjää valitsemaan sanaparilistan ja kysyy listalta halutun
     * määrän sanapareja.
     */
    public void pelaa() {
        String lista = this.valitseLista();

        if (lista != null && harjoittelu.lueLista(lista)) {

            String montako = this.lueKayttajalta("Kyseltävien sanaparien määrä?", "Montako sanaa?");
            if (montako != null) {
                try {
                    int monta = Integer.parseInt(montako);
                    if (Integer.parseInt(montako) > 0) {
                        this.kysySanoja(lista, monta);
                    } else {
                        JOptionPane.showMessageDialog(null, "Anna positiivinen kokonaisluku!");
                    }
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Anna positiivinen kokonaisluku!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Anna positiivinen kokonaisluku!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Harjoittelu keskeytetty!");
        }

    }

    /**
     * Sanaparilistan valinta tapahtuu tämän metodin kautta.
     *
     * @return valittuLista Palauttaa valitun sanaparilistan.
     */
    public String valitseLista() {
        ArrayList<String> listat = harjoittelu.getSanalistojenNimet();
        Object[] komennot = new Object[listat.size()];
        for (int j = 0; j < listat.size(); j++) {
            komennot[j] = listat.get(j);
        }

        String valittuLista = (String) JOptionPane.showInputDialog(null, "\n " + "Valitse pelattava lista\n  ", "Valitse lista", JOptionPane.PLAIN_MESSAGE, null, komennot, komennot[0]);

        return valittuLista;
    }

    /**
     * Metodi toteuttaa sanojen kyselemisen.
     *
     * @param sanaparilista Valittu sanaparilista.
     * @param montako Kysyttävien sanojen määrä.
     */
    public void kysySanoja(String sanaparilista, int montako) {
        ArrayList<String> kysyttavatSanat = this.harjoittelu.getArvotutSanat(montako);
        ArrayList<String> kaannokset = this.harjoittelu.getKaannokset();

        for (int i = 0; i < montako; i++) {
            String vastaus = this.lueKayttajalta("Sanoja arvattu: " + arvaukset.getArvaukset() + "/" + montako + "\nOikein: " + this.arvaukset.getOikein() + "\nVäärin: " + this.arvaukset.getVaarin() + "\n\nAnna pari sanalle: " + kysyttavatSanat.get(i), "Kirjoita sanapari!").toLowerCase();
            if (vastaus != null) {
                String kaannos = kaannokset.get(i).toLowerCase();
                String tallennettavaKaannos = kaannokset.get(i);

                if (vastaus.equals(kaannos)) {
                    JOptionPane.showMessageDialog(null, "Oikein!");
                    this.arvaukset.lisaaOikein();

                } else {
                    JOptionPane.showMessageDialog(null, "Väärin!!");
                    this.arvaukset.lisaaVaarin();
                    this.harjoittelu.tallennaVaaratSanat("vaaratSanat.txt", kysyttavatSanat.get(i), tallennettavaKaannos);
                }

                if (i == kysyttavatSanat.size() - 1) {
                    int oikein = this.arvaukset.getOikein();
                    int vaarin = this.arvaukset.getVaarin();
                    JOptionPane.showMessageDialog(null, "Sanoja arvattu: " + montako + "/" + montako + "\nOikein: " + oikein + "\nVäärin: " + vaarin);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Toistoharjoittelu keskeytetty!");
            }
        }
    }

    /**
     * Metodi, jonka avulla käyttäjältä kysytään sanoja ja sanojen määrää.
     *
     * @param viesti Ikkunassa olevat toimintaohjeet käyttäjälle.
     * @param otsikko Ikkunan otsikko.
     * @return teksti Palauttaa käyttäkän syötteen.
     */
    public String lueKayttajalta(String viesti, String otsikko) {
        String teksti = JOptionPane.showInputDialog(null, viesti, otsikko, 1);
        if (teksti == null) {
            JOptionPane.showMessageDialog(null, "Toistoharjoittelu keskeytetty!");
        }
        return teksti;
=======


package Toistoharjoittelu.UserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Luokka toteuttaa toistoharjoittelupelin.
 * 
 * @author Julia Martikainen
 */
public class Peli implements ActionListener{
    
    
    public void actionPerformed (ActionEvent e){
	
        
                    
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
    }
}
