package wind.patten.singleton.lazy;

/**
 * @Description 通过内部类实现懒汉式单例，兼顾性能问题
 * @Author xiaojun
 * @Date 2019/3/19 14:58
 **/
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){}

    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

}
