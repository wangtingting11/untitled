package SingleTonSix;

/**
 * @author Mrs.Wang
 * @create 2019-10-24 21:26
 */
public class SingleTonFour {
    private static class MySingleTon {
        private static SingleTonFour singleTon = new SingleTonFour();
    }

    private SingleTonFour() {
    }

    public static SingleTonFour getInstance() {
        return MySingleTon.singleTon;
    }
}
