package JOB12.PolymorpishmDynamic;
/**
 *Created by 21343007_M.fikry
 * @author HP
 */
class Bank {
    float sukuBunga() {
        return 0;
    }
}

class BRI extends Bank {
    // overriding sukuBunga method
    float sukuBunga() {
        return 5.5f;
    }
}
