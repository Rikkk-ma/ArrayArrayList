package tugas;

// Nama : Rico Ramadhani
// NPM  : 2410010093

public class MainTugas {

    public static void main(String[] args) {

        KelasKuliah kelas = new KelasKuliah();

        // Array mata kuliah
        String[] mataKuliah = {
            "Pemrograman Berbasis Objek",
            "Struktur Data",
            "Basis Data"
        };

        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        System.out.println();

        // Tambah minimal 5 mahasiswa
        kelas.tambahMahasiswa(
                new Mahasiswa("Andi", "241001001", 80));

        kelas.tambahMahasiswa(
                new Mahasiswa("Budi", "241001002", 75));

        kelas.tambahMahasiswa(
                new Mahasiswa("Aqis", "241001003", 55));

        kelas.tambahMahasiswa(
                new Mahasiswa("Dina", "241001004", 90));

        kelas.tambahMahasiswa(
                new Mahasiswa("Eko", "241001005", 45));

        kelas.tampilkanSemua();

        System.out.println();
        System.out.println("Rata-rata Nilai : "
                + kelas.hitungRataRata());

        System.out.println("Jumlah Lulus : "
                + kelas.jumlahLulus());

        System.out.println("Jumlah Mahasiswa : "
                + kelas.jumlahMahasiswa());

        // Tambah mahasiswa baru
        kelas.tambahMahasiswa(
                new Mahasiswa("Fajar", "241001006", 85));

        System.out.println();
        System.out.println("Setelah menambah mahasiswa baru");

        System.out.println("Jumlah Mahasiswa : "
                + kelas.jumlahMahasiswa());

        kelas.tampilkanSemua();
    }
}