package JOB12.AbstractionInterface;
/**
 *Created by 21343007_M.fikry
 * @author HP
 */
class AktivitasPagiAnak implements AktivitasPagi {
    @Override
    public void lari() {
        System.out.println("Aktivitas pertama pagi ini adalah lari pagi");
    }

    @Override
    public void berenang() {
        System.out.println("Aktivitas kedua pagi ini adalah berenang");
    }
}
