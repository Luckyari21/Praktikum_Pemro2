package module02.problem03;

// Pada baris ini terjadi error karane nama class tidak sama dengan nama file.
// public class Pegawai {
public class Employee {
    public String name;
    // Pada baris inni terjadi error karena tipe data yang digunakan seharusnya
    // adalah String bukan char, karena char hanya bisa menampung satu huruf/karakter saja.
    // public char origin;
    public String origin;
    public String role;
    public int age;


    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    // Pada baris ini terjadi error karena setter harus mempunyai parameter
    // public void setRole() {
    public void setRole(String role) {
        // Pada baris ini terjadi error karena variable r tidak bisa digunakan
        // karena tidak ada variable yang bernama r di sini.
        // this.role = r;
        this.role = role;
    }
}