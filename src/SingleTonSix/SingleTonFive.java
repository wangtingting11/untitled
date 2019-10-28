package SingleTonSix;

/**
 * @author Mrs.Wang
 * @create 2019-10-24 21:27
 */
public class SingleTonFive {
    private static SingleTonFive singleTon = null;

    private SingleTonFive() {
    }

    static {
        singleTon = new SingleTonFive();
    }

    public static SingleTonFive getInstance() {
        return singleTon;
    }
}
