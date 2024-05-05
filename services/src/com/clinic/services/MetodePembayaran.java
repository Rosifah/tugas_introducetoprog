package com.clinic.services;

import com.clinic.patients.Pasien;

import java.util.Scanner;

public class MetodePembayaran implements IPayment {
    @Override
    public void bayarTunai(Pasien pasien, double biayaPembayaran) {
        System.out.println("\nPembayaran Tunai");
        System.out.println("Nama Pasien: " + pasien.getNama());
        System.out.println("Nomor Registrasi: " + pasien.getNomorRegistrasi());
        System.out.println("Biaya Pembayaran: Rp" + biayaPembayaran);
        System.out.println("Terima kasih atas pembayarannya!");
    }

    @Override
    public void bayarKartuDebit(Pasien pasien, double biayaPembayaran) {
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

    @Override
    public void bayarKartuKredit(Pasien pasien, double biayaPembayaran) {

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

    @Override
    public void bayarTransferBank(Pasien pasien, double biayaPembayaran) {
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
