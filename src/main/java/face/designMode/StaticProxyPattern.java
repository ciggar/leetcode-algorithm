package face.designMode;

/**
 * @author: jia.xue
 * @create: 2020-03-04 22:05
 * @Description 静态代理模式
 **/
public class StaticProxyPattern implements StaticCarService{

    private StaticCarService carService;

    public StaticProxyPattern(StaticCarService carService) {
        super();
        this.carService = carService;
    }

    public StaticProxyPattern() {
    }

    @Override
    public void run() {

        System.out.println("我放首歌。。。");
        carService.run();
        System.out.println("停下车，关闭音乐，停下来看风景");

    }


    public static void main(String[] args) {
        StaticCarServiceImpl staticCarService = new StaticCarServiceImpl();
        StaticProxyPattern staticProxyPattern = new StaticProxyPattern(staticCarService);
        staticProxyPattern.run();
    }
}