package module01.problem02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai: ");
        int value = input.nextInt();

        int i = 0;

        while (i < 11) {
            if (value % 5 == 0){
                System.out.print(value / 5 - 1);
            }else {
                System.out.print(value);
            }

            if (i < 10) {
                System.out.print(",");
            }

            value++;
            i++;
        }
    }
}