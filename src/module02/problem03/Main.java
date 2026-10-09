package module02.problem03;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        //Pada baris ini terjadi error karena tidak ada titik koma (;) di akhir statement
        //e.name = "Roi"
        e.name = "Roi";
        e.origin = "Kingdom of Orvel";
        e.setRole("Assasin");
        //pada baris ini nilai variable age masih kosong
        e.age = 17;

        System.out.println("Nama Pegawai: " + e.getName());
        System.out.println("Asal: " + e.getOrigin());
        System.out.println("Jabatan: " + e.role);
        // Pada baris ini output tidak sesuai soal karena tidak ada keterangan "tahun" di akhir
        // System.out.println("Umur: " + e.age);
        System.out.println("Umur: " + e.age + " Tahun");
    }
}