

package Toistoharjoittelu.Sovelluslogiikka;

import Toistoharjoittelu.tiedostonkasittely.TiedostoonKirjoittaminen;

/**
 *
 * @author Julia Martikainen
 */
public class testi {
    public static void main(String Args[]){
    
    Sanaparit sanat = new Sanaparit();
    TiedostoonKirjoittaminen kirjoita = new TiedostoonKirjoittaminen();
    sanat.lueLista("maatJaKaupungit.txt");
    String sana1 = sanat.getSana1(3);
    String sana2 = sanat.getSana2(3);
    System.out.println(sana1 + " ja " + sana2);
    kirjoita.kirjoitaTiedostoon(sana1, sana2);
    Toistoharjoittelu harkka = new Toistoharjoittelu();
    harkka.tallennaSanaparilista("maatJaKaupungit.txt");
    
    
    
    }
           
}
