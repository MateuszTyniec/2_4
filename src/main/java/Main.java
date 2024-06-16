
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 1 liczbę:");
        int liczba1 = scanner.nextInt();

        System.out.println("Podaj 2 liczbę:");
        int liczba2 = scanner.nextInt();

        System.out.println("Podaj 3 liczbę:");
        int liczba3 = scanner.nextInt();

        int najwieksza = liczba1;
        if (liczba2 > najwieksza) {
            najwieksza = liczba2;
        }
        if (liczba3 > najwieksza) {
            najwieksza = liczba3;
        }

        System.out.println("Największa liczba to: " + najwieksza);

        scanner.close();
    }
}