package com.clinic.services;

import java.util.function.Consumer;

import java.util.function.Consumer;

public class Perawatan {
    public record Treatment(String code, String name, double price) {}

    private static final Treatment[] treatments = {
            new Treatment("a", "Facial Basic --- Rp 125.000", 125000.0),
            new Treatment("b", "Facial Detox --- Rp 200.000", 200000.0),
            new Treatment("c", "Facial Acne --- Rp 285.000", 285000.0),
            new Treatment("d", "Facial Glowing Premium --- Rp 565.000", 565000.0)
    };

    public static void printDaftarPerawatan() {
        System.out.println("Daftar Perawatan:");
        Consumer<Treatment> printPerawatan = treatment ->
                System.out.println(treatment.code() + ". " + treatment.name());
        for (Treatment treatment : treatments) {
            printPerawatan.accept(treatment);
        }
    }

    public static double getHargaPerawatan(String kode) {
        for (Treatment treatment : treatments) {
            if (treatment.code().equalsIgnoreCase(kode)) {
                return treatment.price();
            }
        }
        return 0.0; // Kode perawatan tidak valid
    }

    public static String getDetailPerawatan(String kode) {
        for (Treatment treatment : treatments) {
            if (treatment.code().equalsIgnoreCase(kode)) {
                return treatment.name();
            }
        }
        return null; // Kode perawatan tidak valid
    }

    public static void main(String[] args) {
        printDaftarPerawatan(); // Memanggil metode yang menggunakan Lambda Expression
    }
}

