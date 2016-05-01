package ohtu;

import java.util.HashMap;
import javax.swing.JTextField;

public class Komentotehdas {

   private HashMap<String, Komento> komennot;

    public Komentotehdas(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        komennot = new HashMap<String, Komento>();
        komennot.put("+", new Summa(sovellus,tuloskentta,syotekentta));
        komennot.put("-", new Erotus(sovellus,tuloskentta,syotekentta));
        komennot.put("Z", new Nollaa(sovellus,tuloskentta,syotekentta));
    }

    public Komento hae(String operaatio) {
        Komento komento = komennot.get(operaatio);
        return komento;
    }
}
