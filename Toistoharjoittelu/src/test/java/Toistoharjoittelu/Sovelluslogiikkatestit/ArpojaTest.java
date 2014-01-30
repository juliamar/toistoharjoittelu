/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Toistoharjoittelu.Sovelluslogiikkatestit;

import Toistoharjoittelu.Sovelluslogiikka.Arpoja;
import Toistoharjoittelu.Sovelluslogiikka.Sanaparit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Finwolf
 */
public class ArpojaTest {
    Arpoja arpoja;
    Sanaparit sanaparit;
    int montako;
    
    @Before
    public void setUp() {
        arpoja = new Arpoja();   
        sanaparit = new Sanaparit();
        sanaparit.lueLista("maatJaKaupungit.txt");
        montako = 2;
    }
    
    @Test
    public void arvoArpooOikeanMaaranSanoja() {
       arpoja.arvo(montako, sanaparit);
       int maara = arpoja.getArvotutSanat().size();
       assertEquals(2, maara);
    }
}
