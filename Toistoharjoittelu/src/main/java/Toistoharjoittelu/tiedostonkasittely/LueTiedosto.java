package Toistoharjoittelu.tiedostonkasittely;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Luokka tiedoston lukemiseen.
<<<<<<< HEAD
 *
=======
 * 
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf
 * @author Julia Martikainen
 *
 */
public class LueTiedosto {

<<<<<<< HEAD
    FileInputStream fis = null;
    BufferedInputStream bis = null;
    BufferedReader br = null;

    private String line;
    private ArrayList<String> sanalista1;
    private ArrayList<String> sanalista2;
    private ArrayList<String> nimet;

    /**
     * Metodi yrittää lukea tiedoston. Jos onnistuu, sanaparit talletetaan
     * kahteen listaan.
     *
     * @param tiedostonNimi sanaparitiedoston nimi.
     * @return true, jos tiedoston lukeminen onnistuu, muuten false.
     */
    public boolean lueTiedosto(String tiedostonNimi) {
        File tiedosto = new File("src/main/java/Toistoharjoittelu/tiedostonkasittely/" + tiedostonNimi);
        boolean totuusarvo = false;

        try {
            fis = new FileInputStream(tiedosto);
            bis = new BufferedInputStream(fis);
            br = new BufferedReader(new InputStreamReader(bis));
            int laskuri = 0;

            // Lukee tiedoston kerran ja laskee listojen pituuden.
            while ((line = br.readLine()) != null) {
                laskuri++;
            }

            fis.getChannel().position(0);

            br = new BufferedReader(new InputStreamReader(bis));

            this.sanalista1 = new ArrayList<String>();
            this.sanalista2 = new ArrayList<String>();

            int index = 0;

            //Lukee tiedoston uudelleen ja tallentaa sanaparit kahteen listaan.
            while ((line = br.readLine()) != null) {
                try {
                    String delims = "[, ]+";
                    String[] taulukko = line.split(delims);
                    this.sanalista1.add(index, taulukko[0]);
                    this.sanalista2.add(index, taulukko[1]);
                    index++;
                    totuusarvo = true;
                } catch (ArrayIndexOutOfBoundsException aerr) {

                    totuusarvo = false;
                }
            }
            fis.close();
            bis.close();
            br.close();

        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "Tiedostoa ei löytynyt. Luettavan tiedoston on oltava tiedostonkasittely-pakkauksen alla.");
            //System.out.println("Tiedostoa ei löytynyt. Luettavan tiedoston on oltava tiedostonkasittely-pakkauksen alla.");
        } catch (IOException ioe) {

        }

        return totuusarvo;
    }

    public int getKoko() {
        return this.sanalista1.size();
    }
=======
			FileInputStream fis = null;
			BufferedInputStream bis = null;
			BufferedReader br = null;
			
			private String line; 
                        private ArrayList<String> sanalista1;
                        private ArrayList<String> sanalista2;
                        private ArrayList<String> nimet;

                        

					
		
                        /**
			 * Yrittää lukea tiedoston. Jos onnistuu, sanaparit talletetaan kahteen listaan.   
                         * @param tiedostonNimi sanaparitiedoston nimi.
                         * @return true, jos tiedoston lukeminen onnistuu, muuten false.
			 */
			public boolean lueTiedosto(String tiedostonNimi){
                              File tiedosto = new File("src/main/java/Toistoharjoittelu/tiedostonkasittely/" + tiedostonNimi);
                              boolean totuusarvo = false;
			
                            try
                            {
                                    fis = new FileInputStream(tiedosto);
                                    bis = new BufferedInputStream(fis);
                                    br = new BufferedReader(new InputStreamReader(bis));
                                    int laskuri = 0;



                                     // Lukee tiedoston kerran ja laskee listojen pituuden.

                                    while ((line = br.readLine()) != null)
                                    {
                                            laskuri ++;
                                    }

                                    if(laskuri == 0){
                                        //JOptionPane.showMessageDialog(null,"Tiedoston lukeminen epäonnistui!");
                                        System.out.println("Tiedoston lukeminen epäonnistui!");
                                        System.exit(1);
                                    }
                                    fis.getChannel().position(0);

                                    br = new BufferedReader(new InputStreamReader(bis));



	
                                    this.sanalista1 = new ArrayList<String>();
                                    this.sanalista2 = new ArrayList<String>();


                                    int index = 0;

                                 //Lukee tiedoston uudelleen ja tallentaa sanaparit kahteen listaan.

                                    while ((line = br.readLine()) != null)
                                    {     
                                            try{
                                                    String delims = "[, ]+";
                                                    String[] taulukko = line.split(delims);
                                                    this.sanalista1.add(index, taulukko[0]);
                                                    this.sanalista2.add(index, taulukko[1]);
                                                    index++;	
                                                    totuusarvo = true;
                                            }		        	
                                            catch(NumberFormatException e)
                                            {
                                                //JOptionPane.showMessageDialog(null,"Tiedoston tulee sisältää sanaparit  kahdessa sarakkeessa pilkuilla erotettuina.");
                                                System.out.println("Tiedoston tulee sisältää sanaparit  kahdessa sarakkeessa pilkuilla erotettuina.");
                                            }	
                                            catch(ArrayIndexOutOfBoundsException aerr)
                                            {
                                                aerr.printStackTrace();
                                            }
                                    }
                                    fis.close();
                                    bis.close();
                                    br.close();	


                            } 
                            catch (FileNotFoundException fnfe)
                            {
                                    //JOptionPane.showMessageDialog(null,"Tiedostoa ei löytynyt. Luettavan tiedoston on oltava tiedostonkasittely-pakkauksen alla.");
                                    System.out.println("Tiedostoa ei löytynyt. Luettavan tiedoston on oltava tiedostonkasittely-pakkauksen alla.");
                            }
                            catch (IOException ioe)
                            {
                                    ioe.printStackTrace();
                            }

                            return totuusarvo;
                        }	
			
			
		
			
                        public int getKoko(){
                            return this.sanalista1.size();
                        }
 
                        public int getNimetKoko(){
                            return this.nimet.size();
                        }
                         public ArrayList<String> getNimet(){
                            return this.nimet;
                        }
                        public ArrayList<String> getSanalista2(){
                            return this.sanalista2;
                        }
                         public ArrayList<String> getSanalista1(){
                            return this.sanalista1;
                        }
                        
                        /**
                         * Lukee yksisarakkeisen tiedoston.
                         * @param tiedostonNimi  tiedoston nimi.
                         */
                        public void lueListaTiedosto(String tiedostonNimi){
                            File listaTiedosto = new File("src/main/java/Toistoharjoittelu/tiedostonkasittely/" + tiedostonNimi);
                            
                         
			 // Yrittää lukea tiedoston. Jos onnistuu, sanaparilistojen nimet talletetaan yhteen listaan.                             
			 
			try
			{
			        fis = new FileInputStream(listaTiedosto);
			        bis = new BufferedInputStream(fis);
			        br = new BufferedReader(new InputStreamReader(bis));
			        int laskuri = 0;
                                
			        
			        /**
			         * Lukee tiedoston kerran ja laskee listan pituuden.
			         */
			        while ((line = br.readLine()) != null)
			        {
			        	laskuri ++;
			        }
			        fis.getChannel().position(0);

			        br = new BufferedReader(new InputStreamReader(bis));
			 
                                this.nimet = new ArrayList<String>();

			        			       			        
			        int i = 0;
		        	/**
		        	 * Lukee tiedoston uudelleen ja tallentaa listojen nimet yhteen listaan.
		        	 */
			        while ((line = br.readLine()) != null)
			        {     
			        	try{
                                                
                                                nimet.add(line);
				        	i++;	
			        	}		        	
			        	catch(NumberFormatException e)
			        	{
			        	}
			        }
			        fis.close();
			        bis.close();
			        br.close();	
                                
			        
			} 
			catch (FileNotFoundException fnfe)
			{
			        System.out.println("Tiedostoa ei löytynyt. Luettavan tiedoston on oltava tiedostonkasittely-pakkauksen alla.");
			}
			catch (IOException ioe)
			{
			        ioe.printStackTrace();
			}
			
                        }
	
}
>>>>>>> 426e20b666d7efe998da5ef8d98f1d550b6f09bf

    public int getNimetKoko() {
        return this.nimet.size();
    }

    public ArrayList<String> getNimet() {
        return this.nimet;
    }

    public ArrayList<String> getSanalista2() {
        return this.sanalista2;
    }

    public ArrayList<String> getSanalista1() {
        return this.sanalista1;
    }

    /**
     * Metodi lukee yksisarakkeisen tiedoston.
     *
     * @param tiedostonNimi tiedoston nimi.
     */
    public void lueListaTiedosto(String tiedostonNimi) {
        File listaTiedosto = new File("src/main/java/Toistoharjoittelu/tiedostonkasittely/" + tiedostonNimi);

        //Yrittää lukea tiedoston. Jos onnistuu, sanaparilistojen nimet talletetaan yhteen listaan.
        try {
            fis = new FileInputStream(listaTiedosto);
            bis = new BufferedInputStream(fis);
            br = new BufferedReader(new InputStreamReader(bis));
            int laskuri = 0;

             //Lukee tiedoston kerran ja laskee listan pituuden.
            while ((line = br.readLine()) != null) {
                laskuri++;
            }
            fis.getChannel().position(0);

            br = new BufferedReader(new InputStreamReader(bis));

            this.nimet = new ArrayList<String>();

            int i = 0;

             //Lukee tiedoston uudelleen ja tallentaa listojen nimet yhteen listaan.
            while ((line = br.readLine()) != null && !(line.isEmpty())) {

                nimet.add(line);
                i++;

            }
            fis.close();
            bis.close();
            br.close();

        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "Lisää pelattava lista. Tiedoston on oltava tiedostonkasittely-pakkauksen alla.");

        } catch (IOException ioe) {
            //ioe.printStackTrace();

        }

    }

}
