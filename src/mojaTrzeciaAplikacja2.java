package pl.pp;
import java.util.Scanner;

public class mojaTrzeciaAplikacja2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double fahrenheit, celsjusz, kelwin;

        while (true) {
            System.out.println("Podaj temperaturę w Fahrenheitach (wpisz -1 aby zakończyć): ");
            fahrenheit = scanner.nextDouble();

            if (fahrenheit == -1) {
                System.out.println("Zakończono program.");
                break;
            }

            celsjusz = (fahrenheit - 32.0) / 1.8;
            kelwin = celsjusz + 273.16;

            System.out.println(fahrenheit + " Fahrenheitów to " + celsjusz + " stopni Celsjusza i " + kelwin + " Kelwina");
        }

        scanner.close();

    }
}