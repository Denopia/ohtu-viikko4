package ohtu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Tapahtumankuuntelija implements ActionListener {

    private JButton nollaa;
    private JButton undo;
    private Sovelluslogiikka sovellus;
    private Komentotehdas komentotehdas;
    private Komento edellinen;

    public Tapahtumankuuntelija(JButton plus, JButton miinus, JButton nollaa, JButton undo, JTextField tuloskentta, JTextField syotekentta) {
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovellus = new Sovelluslogiikka();
        this.komentotehdas = new Komentotehdas(sovellus, tuloskentta, syotekentta);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Komento komento = komentotehdas.hae(ae.getActionCommand());
        if (komento != null) {
            try {
                komento.suorita();
                edellinen = komento;
            } catch (Exception e) {

            }
        } else {
            edellinen.peru();
            edellinen = null;
        }
        nollaa.setEnabled(sovellus.tulos() != 0);
        undo.setEnabled(edellinen != null);
    }

}
