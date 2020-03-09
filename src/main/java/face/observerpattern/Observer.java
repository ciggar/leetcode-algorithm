package face.observerpattern;

/**
 * @author: jia.xue
 * @create: 2020-03-04 23:06
 * @Description
 **/
public class Observer {

    public static void main(String[] args) {

        Fans fan1 = new ConcreateFan("zhangsan");
        Fans fan2 = new ConcreateFan("lisi");
        Fans fan3 = new ConcreateFan("wangwu");

        Idol cai = new ConcreateIdol();
        cai.addFan(fan1);
        cai.addFan(fan2);
        cai.addFan(fan3);

        cai.notify("我会唱、跳、Rap还有篮球");

    }
}