package Toistoharjoittelu.UserInterface;

/**
 * Käynnistää graafisen käyttöliittymän.
 *
 * @author Julia Martikainen
 */
public class Main {

    public static void main(String[] args) {

        GUI graph = new GUI();
        graph.setVisible(true);
        graph.run();
        graph.validate();
    }
}
