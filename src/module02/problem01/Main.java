package module02.problem01;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Fruit apple = new Fruit("Apel", 0.4, 7000, 40);
        apple.printInfo();

        Fruit manggo = new Fruit("Mangga", 0.2, 3500, 15);
        manggo.printInfo();

        Fruit avocado = new Fruit("Alpukat", 0.25, 10000, 12);
        avocado.printInfo();
    }
}