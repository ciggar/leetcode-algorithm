package face.classloader;

/**
 * @author: jia.xue
 * @create: 2020-03-17 16:18
 * @Description
 **/
public class MyClassLoader extends ClassLoader {

    public static void main(String[] args) {
        Car car = new Car();
        ClassLoader classLoader = car.getClass().getClassLoader();
        while (classLoader.getParent() != null) {
            ClassLoader parent = classLoader.getParent();
            System.out.println(parent.toString());
            classLoader = parent;
        }
        System.out.println(classLoader.getParent());
    }
}