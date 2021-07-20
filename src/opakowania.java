import java.util.*;

//Wyświetlenie podzielników (całkowitych) liczby X
//Suma podzielników liczby X
//Czy liczba jest doskonała (suma podzielników równa liczbie, np. 6 = 1 + 2 + 3)
//Szukamy liczby powyzej x, ktora jest doskonala

public class opakowania {
    public static void main(String[] args) {
        HashMap<Integer, List<Integer>> mapa = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int L1 = 0;
        int L2 = 0;
        int L3 = 0;
        System.out.print("Podaj ile tabletek mieści się w pierwszym opakowaniu: ");
        L1 = scanner.nextInt();
        System.out.print("Podaj ile tabletek mieści się w drugim opakowaniu: ");
        L2 = scanner.nextInt();
        System.out.print("Podaj ile tabletek mieści się w trzecim opakowaniu: ");
        L3 = scanner.nextInt();
        int dniSuma=0;
        boolean koniec=false;
        System.out.println("Podaj ile tabletek jest aktualnie w opakowaniu pierwszym: ");
        int opakowanieL1= scanner.nextInt();
        System.out.println("Podaj ile tabletek jest aktualnie w opakowaniu drugim: ");
        int opakowanieL2=scanner.nextInt();
        System.out.println("Podaj ile tabletek jest aktualnie w opakowaniu trzecim: ");
        int opakowanieL3=scanner.nextInt();
        do {
            if (mapa.containsKey(opakowanieL1)) {
                List<Integer> lista = mapa.get(opakowanieL1);
                lista.add(opakowanieL2);
                mapa.put(opakowanieL1, lista);
            }
            else {
                List<Integer> lista = new ArrayList<>();
                lista.add(opakowanieL2);
                mapa.put(opakowanieL1, lista);
            }
            if (dniSuma > 5000) {
                System.out.println("WYNIKI");
                for(var entry : mapa.entrySet ()) {
                    System.out.print(entry.getKey() + " : ");
                    int ile = entry.getValue().size();
                    if (ile > 30)
                        ile = 30;
                    for(int i = 0; i < ile; i++)
                        System.out.print(entry.getValue().get(i) + ", ");
                    System.out.println();
                }
                return;
            }
            if (opakowanieL1==0 && opakowanieL2 == 0 && opakowanieL3 == 0) {
                koniec=true;
                break;
            }
            if (opakowanieL1 == 0 ) opakowanieL1 = L1;
            if (opakowanieL2 == 0 ) opakowanieL2 = L2;
            if (opakowanieL3 == 0 ) opakowanieL3 = L3;
            dniSuma ++;
            opakowanieL1--;
            System.out.print(" L1: "+opakowanieL1);
            opakowanieL2--;
            System.out.print(" L2: "+opakowanieL2);
            opakowanieL3--;
            System.out.print(" L3: "+opakowanieL3);
            System.out.println();
        } while (!koniec);
        System.out.println("Wszystkie opakowania jednocześnie skończą się po: "+ dniSuma+" dni");
    }
}
