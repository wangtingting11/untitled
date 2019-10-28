package SingleTonSix;

/**
 * @author Mrs.Wang
 * @create 2019-10-24 21:17
 */
public class SingleTonOne {
    private static SingleTonOne singleTon = new SingleTonOne();
    private SingleTonOne(){

    }
    public static SingleTonOne getInstance(){
        return singleTon;
    }
}
