package ohtu.kivipaperisakset;

import java.util.Scanner;

import java.util.Scanner;

public class KPSParempiTekoaly extends KPSPeli {

    private static final TekoalyParannettu tekoaly = new TekoalyParannettu(20);

    @Override
    public String ekanSiirto(Scanner scanner) {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        return scanner.nextLine();
    }

    @Override
    public String tokanSiirto(Scanner scanner, String ekanSiirto) {
        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        tekoaly.asetaSiirto(ekanSiirto);
        return tokanSiirto;
    }

}
