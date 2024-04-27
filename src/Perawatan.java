import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Perawatan {
    private List<String> daftarPerawatan;

    public Perawatan() {
        daftarPerawatan = new ArrayList<>();
        daftarPerawatan.add("A. Facial Basic --- Rp 125.000");
        daftarPerawatan.add("B. Facial Detox --- Rp 200.000");
        daftarPerawatan.add("C. Facial Acne --- Rp 285.000");
        daftarPerawatan.add("D. Facial Glowing Premium --- Rp 565.000");
    }

    public List<String> getDaftarPerawatan() {
        return daftarPerawatan;
    }

    public void printDaftarPerawatan() {
        // Menggunakan lambda expression untuk mencetak daftar perawatan
        System.out.println("Daftar Perawatan:");
        daftarPerawatan.forEach(perawatan -> System.out.println(perawatan));
    }
}