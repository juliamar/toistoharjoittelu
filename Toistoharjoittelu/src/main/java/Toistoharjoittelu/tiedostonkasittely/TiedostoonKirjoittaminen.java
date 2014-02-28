package Toistoharjoittelu.tiedostonkasittely;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Luokka tiedoston kirjoittamiseen.
 *
 * @author Julia Martikainen
 */
public class TiedostoonKirjoittaminen {

    /**
     * Tallentaa käyttäjän väärin arvaamat sanat ja niiden käännökset
     * tiedostoon, sekä kellonajan ja päivämäärän.
     *
     * @param nimi Tiedoston nimi
     * @param sana1 Kysytty sana
     * @param sana2 Käännös
     */
    public void kirjoitaTiedostoon(String nimi, String sana1, String sana2) {

        String tiedostonNimi = nimi;

        FileWriter fw = null;

        File tiedosto = new File(tiedostonNimi);

        try {
            fw = new FileWriter(tiedosto, true);
        } catch (IOException ioe) {
            // ioe.printStackTrace();
        }

        try {

            BufferedWriter bw = new BufferedWriter(fw);
            String kirjaus = "Peliaika: " + getPaivamaara() + "\n" + sana1 + ", " + sana2 + "\n\n";

            if (tiedosto.exists()) {
                bw.write(kirjaus);
            } else {
                bw.append(kirjaus);
            }
            bw.close();
        } catch (FileNotFoundException fnfe) {
            // System.out.println("Tiedostoa ei löytynyt!");
            //JOptionPane.showMessageDialog(null,"Tiedostoa ei löytynyt!");

        } catch (IOException ioe) {
            //ioe.printStackTrace();

        }

    }

    /**
     * Tallentaa sanaparilistan nimet tiedostoon.
     *
     * @param listanNimi tallennettavan listan nimi.
     * @return true jos listan nimen tallentaminen onnistuu, muuten false.
     */
    public boolean tallennaLista(String listanNimi) {

        String tiedostonNimi = "listat.txt";

        FileWriter fw = null;
        boolean totuusarvo = true;
        File tiedosto = new File(tiedostonNimi);

        if (tiedosto.exists()) {

            LueTiedosto lue = new LueTiedosto();
            lue.lueListaTiedosto("listat.txt");

            ArrayList<String> nimet = lue.getNimet();

            if (nimet.contains(listanNimi)) {
                totuusarvo = false;

            }

            if (totuusarvo) {
                try {
                    fw = new FileWriter(tiedosto, true);
                } catch (IOException ioe) {

                }

                try {
                    BufferedWriter bw = new BufferedWriter(fw);
                    String kirjaus = "\n" + listanNimi;
                    LueTiedosto tarkista = new LueTiedosto();
                    if (tarkista.lueTiedosto(listanNimi)) {
                        bw.write(kirjaus);
                        bw.close();
                    } else {
                        totuusarvo = false;

                    }
                } catch (FileNotFoundException fnfe) {
                    totuusarvo = false;

                } catch (IOException ioe) {
                    totuusarvo = false;

                }
            }
        } else {
            LueTiedosto tarkista = new LueTiedosto();

            if (tarkista.lueTiedosto(listanNimi)) {
                try {
                    fw = new FileWriter(tiedosto, true);
                } catch (IOException ioe) {

                }
                try {
                    BufferedWriter bw = new BufferedWriter(fw);
                    String kirjaus = listanNimi;
                    bw.write(kirjaus);
                    bw.close();

                } catch (FileNotFoundException fnfe) {
                    totuusarvo = false;
                } catch (IOException ioe) {
                    totuusarvo = false;

                }

            } else {
                totuusarvo = false;
            }
        }

        return totuusarvo;
    }

    /**
     * Metodi palauttaa tämän hetkisen kellonajan ja päivämäärän.
     *
     * @return päivämäärä
     */
    private static String getPaivamaara() {

        DateFormat paivays = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        Date paiva = new Date();
        return paivays.format(paiva);
    }
}
