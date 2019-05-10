package wind.patten.singleton.threadlocal;

/**
 * @Description 通过ThreadLocal 读写屏障来实现单例，但是单例只在当前线程中保证，非全局
 * @Author xiaojun
 * @Date 2019/3/19 17:20
 **/
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }

}
