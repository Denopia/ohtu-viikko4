package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KPSPeli {

    private static final Scanner scanner = new Scanner(System.in);

    public KPSPeli() {
    }

    public static KPSPeli luo(String pelimuoto) {
        if (pelimuoto.equals("a")) {
            return new KPSPelaajaVsPelaaja();
        }
        if (pelimuoto.equals("b")) {
            return new KPSTekoaly();
        }
        return new KPSParempiTekoaly();
    }

    public void pelaa() {
        Tuomari tuomari = new Tuomari();

        String ekanSiirto = ekanSiirto(scanner);
        String tokanSiirto = tokanSiirto(scanner, ekanSiirto);

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            ekanSiirto = ekanSiirto(scanner);
            tokanSiirto = tokanSiirto(scanner, ekanSiirto);
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    public abstract String ekanSiirto(Scanner scanner);

    public abstract String tokanSiirto(Scanner scanner, String ekanSiirto);

    public boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}
