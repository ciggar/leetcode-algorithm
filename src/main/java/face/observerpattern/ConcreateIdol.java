package face.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: jia.xue
 * @create: 2020-03-04 23:03
 * @Description 具体的主题/ 具体的明星
 **/
public class ConcreateIdol implements Idol {

    private List<Fans> fansList = new ArrayList<>();

    @Override
    public void addFan(Fans fans) {
        fansList.add(fans);
    }

    @Override
    public void deleteFans(Fans fans) {
        fansList.remove(fans);
    }

    @Override
    public void notify(String message) {
        for (Fans fan : fansList) {
            fan.update(message);
        }
    }
}