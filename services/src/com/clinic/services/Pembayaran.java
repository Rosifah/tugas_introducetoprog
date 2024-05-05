package com.clinic.services;

import com.clinic.patients.Pasien;

import java.util.Scanner;

public class Pembayaran {
    public static void lanjutKeMetodePembayaran(Pasien pasien, double biayaPembayaran) {
        Scanner scanner = new Scanner(System.in);
        MetodePembayaran metodePembayaran = new MetodePembayaran();
        System.out.println("\nPilih metode pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. Kartu Debit");
        System.out.println("3. Kartu Kredit");
        System.out.println("4. Transfer Bank");
        System.out.print("Pilihan Anda: ");
        int pilihanPembayaran = scanner.nextInt();
        switch (pilihanPembayaran) {
            case 1 -> metodePembayaran.bayarTunai(pasien, biayaPembayaran);
            case 2 -> metodePembayaran.bayarKartuDebit(pasien, biayaPembayaran);
            case 3 -> metodePembayaran.bayarKartuKredit(pasien, biayaPembayaran);
            case 4 -> metodePembayaran.bayarTransferBank(pasien, biayaPembayaran);
            default -> System.out.println("Pilihan tidak valid!");
        }
        scanner.close();
    }
}
