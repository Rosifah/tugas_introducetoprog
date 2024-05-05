package com.clinic.patients;

public final class PasienMember extends Pasien {
    private int idMember;

    public PasienMember(String nama, int idMember) {
        super(nama);
        this.idMember = idMember;
    }

    public int getIdMember() {
        return idMember;
    }
}
