import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
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
                System.out.println("Apakah anda sudah melakukan reservasi? (Sudah/Belum)");
                String riwayat = scanner.nextLine();
                if (riwayat.equalsIgnoreCase("sudah")) {
                    Perawatan perawatan = new Perawatan();
                    // List<String> daftarHargaPerawatan = perawatan.getDaftarHargaPerawatan();

                    System.out.println("Daftar Perawatan dan Harga:");
                    perawatan.printDaftarPerawatan();

                    System.out.println("Pilih perawatan yang anda inginkan : (Dengan memilih opsi yang ada A/B/C/D)");
                    String treatment = scanner.nextLine();
                    // Memeriksa pilihan perawatan yang valid
                    if (treatment.equalsIgnoreCase("a") || treatment.equalsIgnoreCase("b")
                            || treatment.equalsIgnoreCase("c") || treatment.equalsIgnoreCase("d")) {
                        System.out.println("Berikut rincian pesananan anda untuk ....");
                        // Lakukan sesuatu dengan perawatan yang dipilih
                        break;
                    } else {
                        System.out.println("Perawatan yang dipilih tidak valid.");
                    }
                } else {
                    System.out.println("Silahkan melakukan reservasi terlebih dahulu.");
                    break; // Keluar dari loop while
                }
            }
        } else {
            System.out.println("Terima kasih.");
        }

        scanner.close(); // Tutup scanner
    }
}