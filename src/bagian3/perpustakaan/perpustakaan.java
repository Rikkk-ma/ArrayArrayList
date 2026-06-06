package bagian3.perpustakaan;

import java.util.ArrayList;

public class perpustakaan {

    private ArrayList<Buku> koleksi = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        koleksi.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("=== DAFTAR BUKU ===");

        for (int i = 0; i < koleksi.size(); i++) {
            System.out.println((i + 1) + ". "
                    + koleksi.get(i).info());
        }
    }

    public void pinjamBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equals(judul)) {

                if (b.isDipinjam()) {
                    System.out.println(judul
                            + " sedang dipinjam.");
                } else {
                    b.setDipinjam(true);
                    System.out.println(judul
                            + " berhasil dipinjam.");
                }
                return;
            }
        }

        System.out.println("Buku tidak ditemukan.");
    }

    // Latihan No.1
    public void kembalikanBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equals(judul)) {
                b.setDipinjam(false);
                System.out.println(judul
                        + " telah dikembalikan.");
                return;
            }
        }

        System.out.println("Buku tidak ditemukan.");
    }

    // Latihan No.3
    public void cariPenulis(String penulis) {
        System.out.println("Buku karya " + penulis);

        for (Buku b : koleksi) {
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                System.out.println(b.info());
            }
        }
    }

    public int jumlahTersedia() {
        int jumlah = 0;

        for (Buku b : koleksi) {
            if (!b.isDipinjam()) {
                jumlah++;
            }
        }

        return jumlah;
    }
}