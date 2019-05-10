package wind.patten.singleton.lazy;

/**
 * @Description 通过锁对象来实现懒汉式单例
 * @Author xiaojun
 * @Date 2019/3/19 14:53
 **/
public class LazyDoubleCheckSingleton {

    private LazyDoubleCheckSingleton(){}

    private volatile static LazyDoubleCheckSingleton lazy = null;

    public static LazyDoubleCheckSingleton getInstance(){
        if (lazy == null) {
            synchronized (lazy){
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return  lazy;
    }
}
