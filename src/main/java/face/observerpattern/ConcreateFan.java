package face.observerpattern;

import java.rmi.MarshalException;

/**
 * @author: jia.xue
 * @create: 2020-03-04 22:59
 * @Description
 **/
public class ConcreateFan implements Fans {

    private String name;

    public ConcreateFan(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "收到了这条消息。。。"+ message);
    }
}