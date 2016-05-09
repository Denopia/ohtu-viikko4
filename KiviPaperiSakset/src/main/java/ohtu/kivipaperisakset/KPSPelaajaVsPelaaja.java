package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KPSPeli{

    @Override
    public String ekanSiirto(Scanner scanner) {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        return scanner.nextLine();}

    @Override
    public String tokanSiirto(Scanner scanner, String ekanSiirto) {
        System.out.print("Toisen pelaajan siirto: ");
        return scanner.nextLine();}

}