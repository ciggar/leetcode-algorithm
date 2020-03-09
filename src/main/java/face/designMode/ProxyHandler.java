package face.designMode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.rmi.MarshalException;

/**
 * @author: jia.xue
 * @create: 2020-03-04 22:23
 * @Description 动态代理
 **/
public class ProxyHandler implements InvocationHandler {


    //接收被代理的对象
    private Object object;

    public ProxyHandler(Object object) {
        this.object = object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke... methodName:"+ method.getName());
        method.invoke(object,args);
        System.out.println("after invoke... methodName:"+ method.getName());
        return null;
    }

    //执行动态代理
    public static void main(String[] args) {

        StaticCarService staticCarService = new StaticCarServiceImpl();


        ProxyHandler proxyHandler = new ProxyHandler(staticCarService);
        StaticCarService proxyInstance = (StaticCarService)Proxy.newProxyInstance(staticCarService.getClass().getClassLoader(), staticCarService.getClass().getInterfaces(), proxyHandler);

        proxyInstance.run();
    }
}