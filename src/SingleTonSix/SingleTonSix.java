package SingleTonSix;

import java.io.ObjectStreamException;

/**
 * @author Mrs.Wang
 * @create 2019-10-24 21:27
 */
public class SingleTonSix {
    private static final long serialVersionUID = 888L;

    private static class MySingleTon {
        private static final SingleTonSix singleTon = new SingleTonSix();
    }

    private SingleTonSix() {
    }

    public static SingleTonSix getInstance() {
        return MySingleTon.singleTon;
    }

    protected Object readResolve() throws ObjectStreamException {

        return MySingleTon.singleTon;
    }
}
