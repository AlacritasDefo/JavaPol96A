package tablica;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;
/*Zadanie 7
        Utwórz tablicę T zawierającą n losowych liczb całkowitych z przedziału 1...m. Znajdź długość najdłuższego
        ciągu takich samych wartości.
        Znajdź długość najdłuższego ciągu wartości większych niż średnia arytmetyczna liczb z tablicy T.*/
public class zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int n = scanner.nextInt();
        int[] tab1 = new int[n];
        System.out.println("Podaj górną granicę przedziału: ");
        int m = scanner.nextInt();
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < n; i++) {
            tab1[i] = random.nextInt(m);
            System.out.print(tab1[i] + " ");
        }
        int wartosc = tab1[0];
        int dlugosc = 1;
        int max = 1; // 1 2 2 2 0
        int maxL = wartosc;
        System.out.println();
        for (int i = 1; i < n; i++) {
            if (tab1[i] == wartosc) {
                dlugosc++;
            } else {
                if (dlugosc > max) {
                    max = dlugosc;
                    maxL = wartosc;
                }
                    wartosc = tab1[i];
                    dlugosc = 1;
                }
        }
        if (dlugosc > max) {
            max = dlugosc;
            maxL = wartosc;
        }
        System.out.println("Max równa się: " + max);
        System.out.println("Ciąg liczby: " + maxL);
    }
}