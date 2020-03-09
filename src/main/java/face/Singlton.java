package face;

/**
 * @author: jia.xue
 * @create: 2020-03-04 21:05
 * @Description
 **/
public class Singlton {

    private static volatile Singlton singlton;

    public static Singlton getInstance(){
        if (singlton == null){
            synchronized (Singlton.class){
                if (singlton == null) {
                    singlton = new Singlton();
                }
            }
        }
        return singlton;
    }
}