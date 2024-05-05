package com.clinic.patients;

import java.util.List;

public sealed class Pasien permits PasienMember {
    private String nama;
    private String nomorRegistrasi;

    public Pasien(String nama) {
        this.nama = nama;
        this.nomorRegistrasi = generateNomorRegistrasi();
    }

    private String generateNomorRegistrasi() {
        return "REG" + (int) (Math.random() * 10000);
    }

    public String getNama() {
        return nama;
    }

    public String getNomorRegistrasi() {
        return nomorRegistrasi;
    }

    public static boolean cekPasienBaru(List<String> daftarPasien, String nama) {
        return !daftarPasien.contains(nama);
    }
}

