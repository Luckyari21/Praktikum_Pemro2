package module01.problem03;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = input.nextInt();

        System.out.print("Masukkan Nilai Awal: ");
        int value = input.nextInt();

        int i = 0;

        do {
            if (value % 2 != 0) {
                System.out.print(value);
                if (i < n - 1) {
                    System.out.print(",");
                }
                i++;
            }
            value++;
        } while (i < n);
    }
}