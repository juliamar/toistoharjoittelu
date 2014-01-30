/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Toistoharjoittelu.tiedostonkasittely;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import Toistoharjoittelu.tiedostonkasittely.LueTiedosto;
import java.util.ArrayList;
/**
 *
 * @author Julia Martikainen
 */
public class TiedostoonKirjoittaminen {
        
    public void kirjoitaTiedostoon(String sana1, String sana2){

            String tiedostonNimi = "src/main/java/Toistoharjoittelu/tiedostonkasittely/tallennetutSanat.txt";
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
                    System.out.println("Tiedostoa ei löytynyt");
                } 
             catch (IOException ioe)
                {
                        ioe.printStackTrace();
                }
             
            }
    public boolean tallennaLista(String listanNimi){
    //kirjoita listojen nimet erilliseen tiedostoon
            String tiedostonNimi = "src/main/java/Toistoharjoittelu/tiedostonkasittely/listat.txt";
            FileWriter fw = null;
            
            File tiedosto = new File(tiedostonNimi);
            LueTiedosto lue = new LueTiedosto();
            lue.lueListaTiedosto("listat.txt");
            boolean totuusarvo = true;
            ArrayList<String> nimet = lue.getNimet();
            

            if(nimet.contains(listanNimi)){
                    totuusarvo = false;
                    System.out.println("Et voi lisätä samannimistä listaa!");
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
                            String kirjaus = listanNimi + "\n";

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
                        System.out.println("Tiedostoa ei löytynyt");
                    } 
                 catch (IOException ioe)
                    {
                            ioe.printStackTrace();
                    }
            }
             return totuusarvo;
    }
    
  public void tallennaUusiLista(ArrayList<String> listat){
    //kirjoita listojen nimet erilliseen tiedostoon
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
                        System.out.println("Tiedostoa ei löytynyt");
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
