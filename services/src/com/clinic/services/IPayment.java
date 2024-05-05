package com.clinic.services;

import com.clinic.patients.Pasien;

public interface IPayment {
    void bayarTunai(Pasien pasien, double biayaPembayaran);
    void bayarKartuDebit(Pasien pasien, double biayaPembayaran);
    void bayarKartuKredit(Pasien pasien, double biayaPembayaran);
    void bayarTransferBank(Pasien pasien, double biayaPembayaran);
}
