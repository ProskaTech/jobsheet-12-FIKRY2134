package JOB12.Inheritance;
/**
 *Created by 21343007_M.fikry
 * @author HP
 */
class RodaEmpat extends Kendaraan {
    double NaikHargaKe = 8; // 1 kali

    void hargaAkhir() {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah di modifikasi, harga mobil menjadi Rp. " + hargaDasar);
    }
}