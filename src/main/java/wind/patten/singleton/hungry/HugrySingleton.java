package wind.patten.singleton.hungry;

/**
 * @Description 饿汉式单例
 * @Author xiaojun
 * @Date 2019/3/18 16:12
 **/
public class HugrySingleton {

    private HugrySingleton(){}

    private static final HugrySingleton hugrySingleton = new HugrySingleton();

    public static HugrySingleton getInstance(){
        return hugrySingleton;
    }

}
