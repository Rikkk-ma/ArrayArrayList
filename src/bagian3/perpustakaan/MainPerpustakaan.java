package bagian3.perpustakaan;

public class MainPerpustakaan {

    public static void main(String[] args) {

        perpustakaan perpus = new perpustakaan();

        perpus.tambahBuku(
                new Buku("Laskar Pelangi",
                        "Andrea Hirata", 2005));

        perpus.tambahBuku(
                new Buku("Bumi Manusia",
                        "Pramoedya", 1980));

        perpus.tambahBuku(
                new Buku("Negeri 5 Menara",
                        "Ahmad Fuadi", 2009));

        perpus.tampilkanKoleksi();

        System.out.println();

        perpus.pinjamBuku("Bumi Manusia");

        System.out.println();

        perpus.kembalikanBuku("Bumi Manusia");

        System.out.println();

        perpus.cariPenulis("Andrea Hirata");

        System.out.println();

        perpus.tampilkanKoleksi();

        System.out.println(
                "Jumlah buku tersedia : "
                + perpus.jumlahTersedia());
    }
}