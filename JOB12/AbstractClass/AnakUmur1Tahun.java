package JOB12.AbstractClass;
/**
 *Created by 21343007_M.fikry
 * @author HP
 */
class AnakUmur1Tahun extends Orang {
    public void namaAyahku() {
        System.out.println("Nama Ayahku adalah " + namaAyah);
    }

    @Override
    public void makan() {
        System.out.println("Anak Umur 1 Tahun Makan Asi");
    }

    @Override
    public void minum() {
        System.out.println("Anak Umur 1 Tahun Minum Asi");
    }
}
