package SingleTonSix;

/**
 * @author Mrs.Wang
 * @create 2019-10-24 21:23
 */
public class SingleTonTwo {
    private static SingleTonTwo singleTon;
    private SingleTonTwo(){

    }
    synchronized public static SingleTonTwo getInstance(){
        if(singleTon != null){
        }else{
            singleTon = new SingleTonTwo();
        }
        return singleTon;
    }
}
