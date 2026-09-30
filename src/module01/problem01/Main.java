package module01.problem01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String fullName = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String placeOfBirth = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int dateOfBirth = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int monthOfBirth = input.nextInt();

        String[] months = {
                "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        System.out.print("Masukkan Tahun Lahir: ");
        int yearOfBirth = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int height = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double weight = input.nextDouble();

        System.out.println("Nama Lengkap " + fullName + ", Lahir di " + placeOfBirth
                + " pada Tanggal " + dateOfBirth + " " + months[monthOfBirth - 1]
                + " " + yearOfBirth);

        System.out.println("Tinggi Badan " + height + " cm dan Berat Badan " + weight
                + " kilogram");

    }
}