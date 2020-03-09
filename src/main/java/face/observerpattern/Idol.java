package face.observerpattern;

/**
 * @author: jia.xue
 * @create: 2020-03-04 23:01
 * @Description 抽象主题/ 抽象明星
 **/
public interface Idol {

    //增加粉丝
    public void addFan(Fans fans);

    //删除粉丝
    public void deleteFans(Fans fans);

    //通知粉丝
    public void notify(String message);
}