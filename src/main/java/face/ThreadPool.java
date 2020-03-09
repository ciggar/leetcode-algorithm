package face;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author: jia.xue
 * @create: 2020-03-09 22:31
 * @Description
 **/
public class ThreadPool {

    /**
     * corePoolSize 核心线程数
     * maximunPoolSize 最大线程数
     * keepAliveTime when the number of threads is greater than
     *      *        the core, this is the maximum time that excess idle threads
     *      *        will wait for new tasks before terminating.
     *
     * 创建一个数组类型的阻塞队列，固定大小是10
     */
    public static ExecutorService executorService = new ThreadPoolExecutor(10,10,60l,TimeUnit.SECONDS,new ArrayBlockingQueue<>(10));

    /**
     * 利用guava工具创建线程池
     */
    static {
        ThreadFactoryBuilder threadFactoryBuilder = new ThreadFactoryBuilder();
        ThreadFactory threadFactory = threadFactoryBuilder.setNameFormat("demo-pool-%d").build();

        //利用ThreadFactory创建线程池
        new ThreadPoolExecutor(5,100,60,TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>(1024),threadFactory,new ThreadPoolExecutor.AbortPolicy());
    }
}