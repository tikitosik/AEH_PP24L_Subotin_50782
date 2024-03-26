package pl.pp;
import java.util.Scanner;

public class mojaCzwartaAplikacja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Podaj dolny limit:");
            int x = scanner.nextInt();

            System.out.println("Podaj górny limit:");
            int y = scanner.nextInt();

            if (y <= x) {
                System.out.println("Koniec");
                scanner.close();
                break;
            }

            int odpowiedz = calculateSumOfSquares(x, y);
            System.out.println("Suma kwadratów liczb całkowitych od " + x + " do " + y + " wynosi: " + odpowiedz);

        }
    }

    public static int calculateSumOfSquares(int dolny, int gorny) {
        int sum = 0;
        for (int i = dolny; i <= gorny; i++) {
            sum += i * i;
        }
        return sum;
    }
}