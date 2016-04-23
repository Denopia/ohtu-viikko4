package ohtu.intjoukkosovellus;

public class IntJoukko {

    public final static int KAPASITEETTI = 5, // aloitustalukon koko
            OLETUSKASVATUS = 5;  // luotava uusi taulukko on 
    // näin paljon isompi kuin vanha
    private int kasvatuskoko;     // Uusi taulukko on tämän verran vanhaa suurempi.
    private int[] ljono;      // Joukon luvut säilytetään taulukon alkupäässä. 
    private int alkioidenLkm;    // Tyhjässä joukossa alkioiden_määrä on nolla. 

    public IntJoukko() {
        this(KAPASITEETTI);
    }

    public IntJoukko(int kapasiteetti) {
        this(kapasiteetti, OLETUSKASVATUS);
    }

    public IntJoukko(int kapasiteetti, int kasvatuskoko) {
        if (kapasiteetti < 0 || kasvatuskoko < 0)throw new IndexOutOfBoundsException("Ei saa antaa negatiivisia arvoja");//heitin vaan jotain :D   
        ljono = new int[kapasiteetti];
        for (int i = 0; i < ljono.length; i++)ljono[i] = 0;
        alkioidenLkm = 0;
        this.kasvatuskoko = kasvatuskoko;
    }

    public boolean lisaa(int luku) {
        if (!kuuluu(luku)) {
            if (alkioidenLkm == ljono.length)kasvataTaulukoKokoa();            
            ljono[alkioidenLkm] = luku;
            alkioidenLkm++;
            return true;
        }
        return false;
    }

    public void kasvataTaulukoKokoa() {
        int[] uusiJono = new int[alkioidenLkm + kasvatuskoko];
        kopioiTaulukko(ljono, uusiJono);
        ljono = uusiJono;
    }

    public boolean kuuluu(int luku) {
        for (int lukuJoukossa : ljono) {
            if (luku == lukuJoukossa) {
                return true;
            }
        }
        return false;
    }

    public boolean poista(int luku) {
        if (kuuluu(luku)) {
            int[] uusiJono = new int[this.ljono.length];
            kopioiTaulukkoIlmanLukua(luku, uusiJono, ljono);
            ljono = uusiJono;
            alkioidenLkm--;
            return true;
        }
        return false;
    }

    private void kopioiTaulukko(int[] vanha, int[] uusi) {
        for (int i = 0; i < vanha.length; i++) {
            uusi[i] = vanha[i];
        }

    }

    public void kopioiTaulukkoIlmanLukua(int luku, int[] uusi, int[] vanha) {
        int i = 0;
        for (int lukuJonossa : vanha) {
            if (luku != lukuJonossa) {
                uusi[i] = lukuJonossa;
                i++;
            }
        }
    }

    public int mahtavuus() {
        return alkioidenLkm;
    }

    @Override
    public String toString() {
        String tuotos = "{";
        for (int i = 0; i < alkioidenLkm - 1; i++)tuotos += ljono[i] + ", ";
        if (alkioidenLkm != 0)tuotos += ljono[alkioidenLkm - 1];   
        tuotos += "}";
        return tuotos;
    }

    public int[] toIntArray() {
        int[] taulu = new int[alkioidenLkm];
        for (int i = 0; i < taulu.length; i++)taulu[i] = ljono[i];
        return taulu;
    }

    public static IntJoukko yhdiste(IntJoukko a, IntJoukko b) {
        IntJoukko x = new IntJoukko();
        for (int lukuEkaTaulussa : a.toIntArray())x.lisaa(lukuEkaTaulussa);  
        for (int lukuTokaTaulussa : b.toIntArray())x.lisaa(lukuTokaTaulussa);  
        return x;
    }

    public static IntJoukko leikkaus(IntJoukko a, IntJoukko b) {
        IntJoukko y = new IntJoukko();
        for (int lukuEkaTaulussa : a.toIntArray()) {
            for (int lukuTokaTaulussa : b.toIntArray()) {
                if (lukuEkaTaulussa == lukuTokaTaulussa)y.lisaa(lukuEkaTaulussa);         
            }
        }
        return y;
    }

    public static IntJoukko erotus(IntJoukko a, IntJoukko b) {
        IntJoukko z = new IntJoukko();
        for (int lukuEkaTaulussa : a.toIntArray())z.lisaa(lukuEkaTaulussa);  
        for (int lukuTokaTaulussa : b.toIntArray())z.poista(lukuTokaTaulussa);    
        return z;
    }

}
