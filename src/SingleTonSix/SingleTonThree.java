package SingleTonSix;

/**
 * @author Mrs.Wang
 * @create 2019-10-24 21:24
 */
public class SingleTonThree {
    private volatile static SingleTonThree singleton;

    private SingleTonThree() {
    }

    public static SingleTonThree getInstance() {
        try {
            if (singleton != null) {
            } else {
                synchronized (SingleTonThree.class) {
                    if (singleton == null) {
                        singleton = new SingleTonThree();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return singleton;
    }
}
