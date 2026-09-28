package module01.problem04;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String[] tanganAbu = new String[3];
        for (int i = 0; i < 3; i++) {
            tanganAbu[i] = input.next();
        }

        System.out.print("Tangan Bagas: ");
        String[] tanganBagas = new String[3];
        for (int i = 0; i < 3; i++) {
            tanganBagas[i] = input.next();
        }

        int poinAbu = 0;
        int poinBagas = 0;

        for (int i = 0; i < 3; i++) {
            String a = tanganAbu[i];
            String b = tanganBagas[i];

            if (a.equals(b)) {
            } else if (
                    (a.equals("B") && b.equals("G")) ||
                    (a.equals("G") && b.equals("K")) ||
                    (a.equals("K") && b.equals("B"))
            ) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }

        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}
