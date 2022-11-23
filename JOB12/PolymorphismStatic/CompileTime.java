package JOB12.PolymorphismStatic;
/**
 *Created by 21343007_M.fikry
 * @author HP
 */
class CompileTime {
    // method keliling dengan single argumen
    static int keliling(int a) {
        return 4 * a;
    }

    // method keliling dengan dua argumen (method overloading)
    static int keliling(int l, int b) {
        return 2 * (l + b);
    }
}