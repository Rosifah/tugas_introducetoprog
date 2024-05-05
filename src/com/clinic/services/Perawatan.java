package com.clinic.services;

import java.util.function.Consumer;

public class Perawatan {
    private static final String[] kodePerawatan = {"a", "b", "c", "d"};
    private static final String[] namaPerawatan = {
            "Facial Basic --- Rp 125.000",
            "Facial Detox --- Rp 200.000",
            "Facial Acne --- Rp 285.000",
            "Facial Glowing Premium --- Rp 565.000"
    };
    private static final double[] hargaPerawatan = {125000.0, 200000.0, 285000.0, 565000.0};

    public static void printDaftarPerawatan() {
        System.out.println("Daftar com.clinic.services.Perawatan:");
        Consumer<Integer> printPerawatan = index -> System.out.println(kodePerawatan[index] + ". " + namaPerawatan[index]);
        for (int i = 0; i < kodePerawatan.length; i++) {
            printPerawatan.accept(i);
        }
    }

    public static double getHargaPerawatan(String kode) {
        for (int i = 0; i < kodePerawatan.length; i++) {
            if (kodePerawatan[i].equalsIgnoreCase(kode)) {
                return hargaPerawatan[i];
            }
        }
        return 0.0; // Kode perawatan tidak valid
    }

    public static String getDetailPerawatan(String kode) {
        for (int i = 0; i < kodePerawatan.length; i++) {
            if (kodePerawatan[i].equalsIgnoreCase(kode)) {
                return namaPerawatan[i];
            }
        }
        return null; // Kode perawatan tidak valid
    }

    public static void main(String[] args) {
        printDaftarPerawatan(); // Memanggil metode yang menggunakan Lambda Expression
    }
}
