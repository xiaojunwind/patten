package wind.patten.singleton.hungry;

/**
 * @Description 饿汉式静态块单例
 * @Author xiaojun
 * @Date 2019/3/18 16:15
 **/
public class HugryStaticSingleton {

    private static final HugryStaticSingleton hugrySingleton;
    static {
        hugrySingleton = new HugryStaticSingleton();
    }
    private HugryStaticSingleton(){}
    public static HugryStaticSingleton getInstance(){
        return hugrySingleton;
    }
}
