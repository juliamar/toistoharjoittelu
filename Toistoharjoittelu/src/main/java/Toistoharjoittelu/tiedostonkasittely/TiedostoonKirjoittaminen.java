

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
 * @author Julia Martikainen
 */
public class TiedostoonKirjoittaminen {
        
    
    /**
     * Tallentaa käyttäjän väärin arvaamat sanat ja niiden käännökset tiedostoon, sekä kellonajan ja päivämäärän.
     * @param nimi  Tiedoston nimi
     * @param sana1  Kysytty sana
     * @param sana2  Käännös
     */
    public void kirjoitaTiedostoon(String nimi, String sana1, String sana2){

            String tiedostonNimi = "src/main/java/Toistoharjoittelu/tiedostonkasittely/" + nimi;
            FileWriter fw = null;
            File tiedosto = new File(tiedostonNimi);
        
            try
                {
                        fw = new FileWriter(tiedosto, true);
                }
                catch (IOException ioe)
                {
                        ioe.printStackTrace();
                }
            
             try
                {
                        BufferedWriter bw = new BufferedWriter(fw);
                        String kirjaus = "Peliaika: " + getPaivamaara() + "\n" + sana1 + ", " + sana2 + "\n";
                        
                        if (tiedosto.exists()){
                            bw.write(kirjaus);
                        } else {
                            bw.append(kirjaus);
                        }
                        //bw.append(kirjaus);
                        bw.close();
                } 
             catch(FileNotFoundException fnfe)
             {
                       System.out.println("Tiedostoa ei löytynyt!");
                     //JOptionPane.showMessageDialog(null,"Tiedostoa ei löytynyt!");
                } 
             catch (IOException ioe)
                {
                        ioe.printStackTrace();
                }
             
            }
    
    /**
     * Tallentaa sanaparilistan nimet tiedostoon.
     * @param listanNimi  tallennettavan listan nimi.
     * @return true jos listan nimen tallentaminen onnistuu, muuten false.
     */
    public boolean tallennaLista(String listanNimi){

            String tiedostonNimi = "src/main/java/Toistoharjoittelu/tiedostonkasittely/listat.txt";
            FileWriter fw = null;
            
            File tiedosto = new File(tiedostonNimi);
            LueTiedosto lue = new LueTiedosto();
            lue.lueListaTiedosto("listat.txt");
            
            boolean totuusarvo = true;
            ArrayList<String> nimet = lue.getNimet();
            

            if(nimet.contains(listanNimi)){
                    totuusarvo = false;
                    JOptionPane.showMessageDialog(null,"Et voi lisätä samannimistä listaa!");
                    //System.out.println("Et voi lisätä samannimistä listaa!");
            }                

            
            if(totuusarvo){
                try
                    {
                            fw = new FileWriter(tiedosto, true);
                    }
                    catch (IOException ioe)
                    {
                            ioe.printStackTrace();
                    }

                 try
                    {
                            BufferedWriter bw = new BufferedWriter(fw);
                            String kirjaus = "\n" +listanNimi;
                            LueTiedosto tarkista = new LueTiedosto();
                            if(tarkista.lueTiedosto(listanNimi)){
                                if (tiedosto.exists()){
                                    bw.write(kirjaus);
                                } else {
                                    bw.append(kirjaus);
                                }

                                bw.close();
                            }else {
                                totuusarvo = false;
                                JOptionPane.showMessageDialog(null,"Tiedoston tulee sisältää sanaparit  kahdessa sarakkeessa pilkulla eroteltuina.");
                            }
                    } 
                 catch(FileNotFoundException fnfe)
                 {
                        totuusarvo = false;
                        JOptionPane.showMessageDialog(null,"Tiedostoa ei löytynyt!");
                        //System.out.println("Tiedostoa ei löytynyt!");
                    } 
                 catch (IOException ioe)
                    {
                            totuusarvo = false;
                            ioe.printStackTrace();
                    }
            }
             return totuusarvo;
    }
    /**
     * Tallentaa sanaparilistojen nimet tiedostoon yhden listan poiston yhteydessä.
     * @param listat tallennettava ArrayList.
     */
  public void tallennaUusiLista(ArrayList<String> listat){

            String tiedostonNimi = "src/main/java/Toistoharjoittelu/tiedostonkasittely/listat.txt";
            FileWriter fw = null;
            File tiedosto = new File(tiedostonNimi);
            
                      

            
            
                try
                    {
                            fw = new FileWriter(tiedosto, true);
                    }
                    catch (IOException ioe)
                    {
                            ioe.printStackTrace();
                    }

                 try
                    {
                            
                            BufferedWriter bw = new BufferedWriter(fw);
                            for(int i = 0; i < listat.size();i++){
                                bw.append(listat.get(i) + "\n");
                            }                           
                            bw.close();
                    } 
                 catch(FileNotFoundException fnfe)
                 {
                        //JOptionPane.showMessageDialog(null,"Tiedostoa ei löytynyt!");
                        System.out.println("Tiedostoa ei löytynyt!");
                    } 
                 catch (IOException ioe)
                    {
                            ioe.printStackTrace();
                    }
            
             
    }
  
private static String getPaivamaara(){

    DateFormat paivays = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
    Date paiva = new Date();
    return paivays.format(paiva);
}
}
