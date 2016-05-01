package ohtu;

import javax.swing.JTextField;

class Erotus implements Komento {

    private IO io;
    private Sovelluslogiikka sovellus;
    private JTextField syotekentta;
    private JTextField tuloskentta;

    public Erotus(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.syotekentta = syotekentta;
        this.tuloskentta = tuloskentta;
    }

    @Override
    public void suorita() {
        sovellus.miinus(Integer.parseInt(this.syotekentta.getText()));
        this.tuloskentta.setText(sovellus.tulos() + "");
        this.syotekentta.setText("");
    }

    @Override
    public void peru() {
        sovellus.undo();
        this.tuloskentta.setText(sovellus.tulos() + "");
        this.syotekentta.setText("");
    }

}
