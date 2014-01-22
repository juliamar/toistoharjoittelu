

package Toistoharjoittelu.Sovelluslogiikka;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lukee tiedoston ja tallentaa sanaparit listaan.
 * @author Julia Martikainen
 *
 */
public class LueTiedosto {

			FileInputStream fis = null;
			BufferedInputStream bis = null;
			BufferedReader br = null;
			
			private String line; 
                        private String[] sanalista1;
                        private String[] sanalista2;

                        private int koko;
					
		 /* Konstruktori */
		 
			public LueTiedosto(String tiedostonNimi){
				  File tiedosto = new File("src/main/java/Toistoharjoittelu/Sovelluslogiikka/" + tiedostonNimi);
			/**
			 * Yrittää lukea tiedoston. Jos onnistuu, sanaparit talletetaan kahteen listaan.                             
			 */
			try
			{
			        fis = new FileInputStream(tiedosto);
			        bis = new BufferedInputStream(fis);
			        br = new BufferedReader(new InputStreamReader(bis));
			        int laskuri = 0;
                                
			        
			        /**
			         * Lukee tiedoston kerran ja laskee listojen pituuden.
			         */
			        while ((line = br.readLine()) != null)
			        {
			        	laskuri ++;
			        }
			        fis.getChannel().position(0);

			        br = new BufferedReader(new InputStreamReader(bis));
			 
			   


			        this.koko = laskuri;	
                                this.sanalista1 = new String[laskuri];
                                this.sanalista2 = new String[laskuri];
			        			       			        
			        int index = 0;
		        	/**
		        	 * Lukee tiedoston uudelleen ja tallentaa sanaparit kahteen listaan.
		        	 */
			        while ((line = br.readLine()) != null)
			        {     
			        	try{
			        		String delims = "[, ]+";
			        		String[] taulukko = line.split(delims);
                                                this.sanalista1[index] = taulukko[0]; 
                                                this.sanalista2[index] = taulukko[1]; 
				        	index++;	
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
			        System.out.println("Tiedostoa ei löytynyt. Luettavan tiedoston on oltava Sovelluslogiikka-pakkauksen alla.");
			}
			catch (IOException ioe)
			{
			        ioe.printStackTrace();
			}
			
		 
		
			
		}	
			
			
			/**
			 * Metodit palauttavat taulukon, jossa sanaparit ovat ja taulukon koon.
			 * 
			 */
			

			public int getKoko(){
                                return this.koko -1;
                        }
                        public String[] getSanalista1(){
                            return this.sanalista1;
                        }
                        public String[] getSanalista2(){
                            return this.sanalista2;
                        }
	
}


