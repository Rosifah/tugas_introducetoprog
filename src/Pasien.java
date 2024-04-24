import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pasien {
    private static int counter = 1;
    private int idPasien;
    private String nama;
    private LocalDate tanggalLahir;
    private List<String> riwayatPerawatan;

    public Pasien(String nama, LocalDate tanggalLahir) {
        this.idPasien = counter++;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.riwayatPerawatan = new ArrayList<>();
    }

    public int getIdPasien() {
        return idPasien;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public int getUmur() {
        return LocalDate.now().getYear() - tanggalLahir.getYear();
    }

    public List<String> getRiwayatPerawatan() {
        return riwayatPerawatan;
    }

    public void tambahRiwayatPerawatan(String riwayat) {
        riwayatPerawatan.add(riwayat);
    }

    public void hapusRiwayatPerawatan(String riwayat) {
        riwayatPerawatan.remove(riwayat);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        scanner.close();
    }
}
