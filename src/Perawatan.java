import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Perawatan {
    private List<String> daftarPerawatan;

    public Perawatan() {
        daftarPerawatan = new ArrayList<>();
        daftarPerawatan.add("Pemeriksaan Umum");
        daftarPerawatan.add("Pengobatan Flu");
        daftarPerawatan.add("Pemeriksaan Gigi");
        // Tambahkan perawatan lain jika diperlukan
    }

    public List<String> getDaftarPerawatan() {
        return daftarPerawatan;
    }
}
