package Toistoharjoittelu.UserInterface;

import Toistoharjoittelu.Sovelluslogiikka.Toistoharjoittelu;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Graafinen käyttöliittymä.
 *
 * @author Julia Martikainen
 */
public class GUI extends JFrame {

    private JButton nappi1 = new JButton("Lisää tiedosto");
    private JButton nappi2 = new JButton("Pelaa");
    private JButton nappi3 = new JButton("Lopeta");
    private JLabel teksti = new JLabel("Tervetuloa toistoharjoitteluun!");
    private Container kontti = getContentPane();
    private JFileChooser fc = new JFileChooser();
    private File filu;

    public static final Object[] valinta = {"Kyllä", "Ei"};

    Toistoharjoittelu toistoharjoittelu;

    /**
     * Konstruktori luo uuden Toistoharjoittelu-olion.
     */
    public GUI() {

        this.toistoharjoittelu = new Toistoharjoittelu();
    }

    /**
     * Metodi asettaa graafisen käyttöliittymän ikkunan tiettyyn paikkaan tietyn
     * kokoiseksi.
     */
    public void run() {

        setSize(500, 300);
        setLocation(200, 200);
        setTitle("Toistoharjoittelu");
        valikko();
    }

    /**
     * Metodi luo valikon, jossa käyttäjä voi lisätä sanaparilistoja, siirtyä peliin tai
     * poistua.
     */
    private void valikko() {

        kontti.setLayout(null);
        teksti.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
        teksti.setForeground(Color.WHITE);
        teksti.setBounds(120, 50, 300, 50);
        nappi1.setBounds(10, 200, 150, 40);
        nappi2.setBounds(170, 200, 140, 40);
        nappi3.setBounds(320, 200, 140, 40);
        kontti.add(teksti);
        kontti.add(nappi1);
        kontti.add(nappi2);
        kontti.add(nappi3);
        kontti.setBackground(Color.PINK);

        super.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                GUI.lopeta();

            }

        });

        nappi1.addActionListener(new LisaaLista());
        nappi2.addActionListener(new Pelaa());
        nappi3.addActionListener(new Lopeta());

    }

    /**
     * Sulkee ohjelman.
     */
    private class Lopeta implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            GUI.lopeta();

        }

    }

    /**
     * Siirtyy sanaparilistan valintaan ja sanoparien kyselyyn.
     */
    private class Pelaa implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == nappi2) {
                Peli pelaa = new Peli();
                pelaa.pelaa();
            }

        }

    }

    /**
     * Lisää käyttäjän valitseman halutun tiedoston listoihin.
     */
    private class LisaaLista implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == nappi1) {
                fc.setCurrentDirectory(new File("src/main/java/Toistoharjoittelu/tiedostot/"));
                fc.setDialogTitle("Valitse Tiedosto");
                FileNameExtensionFilter filtteri = new FileNameExtensionFilter("Sanaparit", "txt");
                fc.setFileFilter(filtteri);

                int i = fc.showOpenDialog(null);

                if (i == JFileChooser.APPROVE_OPTION) {
                    filu = fc.getSelectedFile();
                    if (toistoharjoittelu.tallennaSanaparilista(filu.getName())) {
                        JOptionPane.showMessageDialog(null, "Tiedoston lisääminen onnistui!");
                    } else {

                        JOptionPane.showMessageDialog(null, "Tiedoston lisääminen epäonnistui!");
                    }

                }

            }

        }

    }

    /**
     * Metodi sulkee ohjelman.
     */
    public static void lopeta() {
        int lopetus = JOptionPane.showOptionDialog(null, "Lopetetaanko ohjelma?", "Lopetus", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, GUI.valinta, GUI.valinta[0]);
        if (lopetus == 0) {
            System.exit(0);
        }
    }

}
