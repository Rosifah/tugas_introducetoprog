import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingin melakukan Registrasi Pasien Baru? (Ya/Tidak)");
        String jawaban = scanner.nextLine();

        if (jawaban.equalsIgnoreCase("Ya")) {
            System.out.println("Masukkan nama pasien:");
            String nama = scanner.nextLine();

            System.out.println("Masukkan tanggal lahir pasien (format: dd/MM/yyyy):");
            String tanggalLahirStr = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr, formatter);

            Pasien pasien1 = new Pasien(nama, tanggalLahir);

            System.out.println("Informasi Pasien:");
            System.out.println("ID: " + pasien1.getIdPasien());
            System.out.println("Nama: " + pasien1.getNama());
            System.out.println("Tanggal Lahir: " + pasien1.getTanggalLahir().format(formatter));
            System.out.println("Umur: " + pasien1.getUmur());

            while (true) {
                System.out.println("Masukkan riwayat perawatan pasien (ketik 'selesai' untuk selesai):");
                String riwayat = scanner.nextLine();
                if (riwayat.equalsIgnoreCase("selesai")) {
                    break;
                }
                pasien1.tambahRiwayatPerawatan(riwayat);
            }

            System.out.println("Riwayat Perawatan Pasien:");
            for (String riwayat : pasien1.getRiwayatPerawatan()) {
                System.out.println("- " + riwayat);
            }
        } else {
            System.out.println("Terima kasih.");
        }

        scanner.close();
    }
}
