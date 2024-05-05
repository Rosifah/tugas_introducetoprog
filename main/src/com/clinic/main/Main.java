package com.clinic.main;

import com.clinic.patients.*;
import com.clinic.services.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input Nama Pasien
            System.out.print("Nama Pasien: ");
            String namaPasien = scanner.nextLine();

            // Input jenis pasien (Regular atau Member)
            System.out.print("Apakah Pasien Member? (ya/tidak): ");
            String isMemberInput = scanner.nextLine();
            boolean isMember = isMemberInput.equalsIgnoreCase("ya");

            Pasien pasien;
            if (isMember) {
                while (true) {
                    try {
                        System.out.print("ID Member: ");
                        String idMemberStr = scanner.nextLine();
                        int idMember = Integer.parseInt(idMemberStr);
                        pasien = new PasienMember(namaPasien, idMember);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("ID Member harus berupa bilangan bulat. Silakan masukkan kembali.");
                    }
                }
            } else {
                pasien = new Pasien(namaPasien);
            }

            // Daftar Perawatan
            Perawatan.printDaftarPerawatan();

            // Pilih Perawatan
            System.out.print("Pilih Perawatan (A/B/C/D): ");
            String perawatanDipilih = scanner.next().toUpperCase();
            double hargaPerawatan = Perawatan.getHargaPerawatan(perawatanDipilih);

            // Reservasi Tanggal
            AntrianKlinik antrian = new AntrianKlinik();
            System.out.println("\nMenu Reservasi dan Pembayaran:");
            while (true) {
                System.out.println("1. Lihat ketersediaan tanggal");
                System.out.println("2. Reservasi tanggal");
                System.out.println("3. Selesai");
                System.out.println("\nPilih menu:");
                int menu = scanner.nextInt();
                switch (menu) {
                    case 1:
                        antrian.lihatKetersediaanTanggal();
                        break;
                    case 2:
                        System.out.print("Pilih tanggal yang ingin diresevasi (1-31): ");
                        int tanggal = scanner.nextInt();
                        if (antrian.reservasiTanggal(tanggal)) {
                            Pembayaran.lanjutKeMetodePembayaran(pasien, hargaPerawatan);
                            return; // Keluar dari program setelah selesai
                        }
                        break;
                    case 3:
                        System.out.println("Reservasi Berhasil!");
                        return; // Keluar dari program setelah selesai
                    default:
                        System.out.println("Menu tidak valid.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Harap masukkan angka atau teks yang sesuai.");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}