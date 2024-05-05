package com.clinic.services;

public class AntrianKlinik {
    private boolean[] tanggalTersedia = new boolean[31];

    public AntrianKlinik() {
        for (int i = 0; i < tanggalTersedia.length; i++) {
            tanggalTersedia[i] = true;
        }
    }

    public void lihatKetersediaanTanggal() {
        System.out.println("Ketersediaan tanggal:");
        for (int i = 0; i < tanggalTersedia.length; i++) {
            if (tanggalTersedia[i]) {
                System.out.println((i + 1) + ". Tersedia");
            } else {
                System.out.println((i + 1) + ". Tidak Tersedia");
            }
        }
    }

    public boolean reservasiTanggal(int tanggal) {
        if (tanggal >= 1 && tanggal <= 31) {
            if (tanggalTersedia[tanggal - 1]) {
                tanggalTersedia[tanggal - 1] = false;
                System.out.println("Reservasi untuk tanggal " + tanggal + " berhasil.");
                return true;
            } else {
                System.out.println("Tanggal " + tanggal + " sudah dipesan.");
            }
        } else {
            System.out.println("Tanggal tidak valid.");
        }
        return false;
    }
}
