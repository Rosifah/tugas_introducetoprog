import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AntrianKlinik {
    private Queue<String> antrianPasien;

    public AntrianKlinik() {
        antrianPasien = new LinkedList<>();
    }

    public void antrianPasien(String namaPasien) {
        antrianPasien.add(namaPasien);
        System.out.println(namaPasien + " telah ditambahkan ke dalam antrian.");
    }

    public void keluarantrianPasien() {
        if (!antrianPasien.isEmpty()) {
            String pasienBerikutnya = antrianPasien.poll();
            System.out.println("Pasien selanjutnya yang akan dilayani: " + pasienBerikutnya);
        } else {
            System.out.println("Antrian kosong. Tidak ada pasien yang keluar dari antrian.");
        }
    }

    public void tampilAntrian() {
        System.out.println("Antrian saat ini:");
        for (String pasien : antrianPasien) {
            System.out.println(pasien);
        }
    }

    public void antrianSelesai() {
        if (antrianPasien.isEmpty()) {
            System.out.println("Antrian telah selesai. Semua pasien telah dilayani.");
        } else {
            System.out.println("Antrian belum selesai. Masih ada pasien dalam antrian.");
        }
    }

    public static void main(String[] args) {
        AntrianKlinik antrianKlinik = new AntrianKlinik();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Masukkan nama pasien atau ketik 'selesai' untuk keluar:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            } else {
                antrianKlinik.antrianPasien(input);
            }
        }

        antrianKlinik.tampilAntrian();
        antrianKlinik.keluarantrianPasien();
        antrianKlinik.antrianSelesai();

        scanner.close();
    }
}
