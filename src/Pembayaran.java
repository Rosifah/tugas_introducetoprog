import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pembayaran {
    private List<String> daftarMetode;

    public Pembayaran() {
        daftarMetode = new ArrayList<>();
        daftarMetode.add("Tunai");
        daftarMetode.add("Kartu Kredit");
        daftarMetode.add("Transfer Bank");
        // Tambahkan metode pembayaran lain jika diperlukan
    }

    public List<String> getDaftarMetode() {
        return daftarMetode;
    }
}
