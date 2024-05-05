package com.clinic.services;

import com.clinic.patients.Pasien;
import java.util.Scanner;

public class Pembayaran {
    public static void lanjutKeMetodePembayaran(Pasien pasien, double biayaPembayaran) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPilih metode pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. Kartu Debit");
        System.out.println("3. Kartu Kredit");
        System.out.println("4. Transfer Bank");
        System.out.print("Pilihan Anda: ");
        int pilihanPembayaran = scanner.nextInt();
        switch (pilihanPembayaran) {
            case 1 -> bayarTunai(pasien, biayaPembayaran);
            case 2 -> bayarKartuDebit(pasien, biayaPembayaran);
            case 3 -> bayarKartuKredit(pasien, biayaPembayaran);
            case 4 -> bayarTransferBank(pasien, biayaPembayaran);
            default -> System.out.println("Pilihan tidak valid!");
        }
        scanner.close();
    }

    private static void bayarTunai(Pasien pasien, double biayaPembayaran) {
        System.out.println("\nPembayaran Tunai");
        System.out.println("Nama Pasien: " + pasien.getNama());
        System.out.println("Nomor Registrasi: " + pasien.getNomorRegistrasi());
        System.out.println("Biaya Pembayaran: Rp" + biayaPembayaran);
        System.out.println("Terima kasih atas pembayarannya!");
    }
    private static void bayarKartuDebit(Pasien pasien, double biayaPembayaran) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPembayaran Kartu Debit");
        System.out.println("Nama Pasien: " + pasien.getNama());
        System.out.println("Nomor Registrasi: " + pasien.getNomorRegistrasi());
        System.out.println("Biaya Pembayaran: Rp" + biayaPembayaran);
        System.out.print("Masukkan nomor kartu debit: ");
        String nomorKartuDebit = scanner.nextLine();
        System.out.print("Masukkan PIN: ");
        int pin = scanner.nextInt();
        System.out.println("Pembayaran sedang diproses...");
        System.out.println("Transaksi berhasil!");
        scanner.close();
    }

    private static void bayarKartuKredit(Pasien pasien, double biayaPembayaran) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPembayaran Kartu Kredit");
        System.out.println("Nama Pasien: " + pasien.getNama());
        System.out.println("Nomor Registrasi: " + pasien.getNomorRegistrasi());
        System.out.println("Biaya Pembayaran: Rp" + biayaPembayaran);
        System.out.print("Masukkan nomor kartu kredit: ");
        String nomorKartuKredit = scanner.nextLine();
        System.out.print("Masukkan CVC: ");
        int cvc = scanner.nextInt();
        System.out.println("Pembayaran sedang diproses...");
        System.out.println("Transaksi berhasil!");
        scanner.close();
    }

    private static void bayarTransferBank(Pasien pasien, double biayaPembayaran) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPembayaran Transfer Bank");
        System.out.println("Nama Pasien: " + pasien.getNama());
        System.out.println("Nomor Registrasi: " + pasien.getNomorRegistrasi());
        System.out.println("Biaya Pembayaran: Rp" + biayaPembayaran);
        System.out.print("Masukkan Jenis Bank: ");
        String jenisBank = scanner.nextLine();
        System.out.print("Masukkan Nomor Rekening: ");
        int nomorRekening = scanner.nextInt();
        System.out.println("Pembayaran sedang diproses...");
        System.out.println("Transaksi berhasil!");
        scanner.close();
    }
}
