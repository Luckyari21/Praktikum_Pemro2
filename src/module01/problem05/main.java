package module01.problem05;

import java.util.Scanner;

public class main {
    static final double phi = 3.14;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double radius = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double height = input.nextDouble();

        double cylinderVolume = phi * radius * radius * height;

        System.out.printf("Volume tabung dengan jari-jari " + radius + " cm dan tinggi " + height +
                " cm adalah %.3f m3",cylinderVolume);
    }
}