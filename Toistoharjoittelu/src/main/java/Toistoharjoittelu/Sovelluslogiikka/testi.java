

package Toistoharjoittelu.Sovelluslogiikka;

/**
 *
 * @author Julia Martikainen
 */
public class testi {
    public static void main(String Args[]){
    
    Sanaparit sanat = new Sanaparit();
    TiedostoonKirjoittaminen kirjoita = new TiedostoonKirjoittaminen();
    sanat.lisaaLista("maatJaKaupungit.txt");
    String sana1 = sanat.getSana1(3);
    String sana2 = sanat.getSana2(3);
    System.out.println(sana1 + " ja " + sana2);
    kirjoita.KirjoitaTiedostoon(sana1, sana2);
    
    
    }
           
}
