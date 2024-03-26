package pl.pp;
import java.util.Scanner;

public class mojaCzwartaAplikacja2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Wybierz operację:");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Wyjście");

            int choice = wybranaOdpowiedz(scanner);

            if (choice == 5) {
                System.out.println("Koniec");
                break;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Niepoprawny wybór operacji. Spróbuj ponownie");
                continue;
            }

            System.out.println("Podaj pierwszą liczbę:");
            double num1 = scanner.nextDouble();
            System.out.println("Podaj drugą liczbę:");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Wynik dodawania: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Wynik odejmowania: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Wynik mnożenia: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Nie można dzielić przez zero");
                    } else {
                        System.out.println("Wynik dzielenia: " + (num1 / num2));
                    }
                    break;

            }
        }
    }

    public static int wybranaOdpowiedz(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Niepoprawne dane. Wprowadź liczbę całkowitą");
        }
        return scanner.nextInt();
    }
}
