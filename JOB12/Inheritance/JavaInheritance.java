package JOB12.Inheritance;
/**
 *Created by 21343007_M.fikry
 * @author HP
 */
public class JavaInheritance {
    public static void main(String[] args) {
        // Membuat objek kendaraan roda dua
        RodaDua sepeda = new RodaDua();
        // Membuat objek kendaraan roda empat
        RodaEmpat mobil = new RodaEmpat();

        sepeda.tampilkanHarga();
        sepeda.hargaAkhir();

        mobil.tampilkanHarga();
        mobil.hargaAkhir();
    }
}
