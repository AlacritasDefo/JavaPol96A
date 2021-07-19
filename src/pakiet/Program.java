package pakiet;

public class Program {
    public static void main(String[] args) {
        //Program oblicza odsetki z lokaty bankowej
        // oprocentowanie roczne
        double procent = 1.03;
        double kwota = 1000;
        int lataLokaty = 5;
        int rok = 1;
        do {
            kwota = kwota * procent;
            rok++;
        } while (rok <= lataLokaty);
        System.out.format("Kwota na końcu lokaty: %8.2f zł" , kwota);
    }
}
