package wind.patten.singleton.lazy;

/**
 * @Description 懒汉式单例
 * @Author xiaojun
 * @Date 2019/3/19 14:49
 **/
public class LazySimpleSingleton {

    private LazySimpleSingleton(){}

    private static LazySimpleSingleton lazy = null;

    public synchronized static LazySimpleSingleton getInstance(){
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
