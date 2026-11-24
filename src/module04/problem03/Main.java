package module04.problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int choice = Integer.parseInt(input.nextLine());

        if (choice == 1) {
            System.out.print("Nama hewan peliharaan: ");
            String nameCat = input.nextLine();

            System.out.print("Ras: ");
            String breedCat = input.nextLine();

            System.out.print("Warna Bulu: ");
            String furColorCat = input.nextLine();

            Cat cat = new Cat(nameCat, breedCat, furColorCat);
            cat.displayInfo();
        }
        else if (choice == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String nameDog = input.nextLine();

            System.out.print("Ras: ");
            String breedDog = input.nextLine();

            System.out.print("Warna Bulu: ");
            String furColorDog = input.nextLine();

            System.out.print("Kemampuan: ");
            String[] abilities = input.nextLine().split(", ");

            Dog dog = new Dog(nameDog, breedDog, furColorDog, abilities);
            dog.displayInfo();
        }
    }
}