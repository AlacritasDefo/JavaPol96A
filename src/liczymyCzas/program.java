package liczymyCzas;

public class program {
    public static void main(String[] args) {
        Display display = new Display(23,56,23);
        display.plusSeconds(234);
        System.out.println(display.toString());

    }
}
