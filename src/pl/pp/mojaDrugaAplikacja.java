package pl.pp;

import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz liczbe:");
        int x = scanner.nextInt();

        System.out.println("x = " + x);

        var result= x * 2;
        System.out.println("x * 2 = " + result);

        result = x * x;
        System.out.println("x * x = " + result);

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Proszę podaj swój wiek:");
        int a = scanner2.nextInt();

        var result2 = a * 31556926;
        System.out.println("Twój wiek w sekundach składa " + result2 + " sekund!");

        scanner.close();
        scanner2.close();

    }
}