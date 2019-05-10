package wind.patten.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description 注册式单例，spring常用
 * @Author xiaojun
 * @Date 2019/3/19 17:11
 **/
public class ContainerSingleton {
    private ContainerSingleton(){}
    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();

    public static Object getInstance(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object obj = null;
                try{
                    obj = Class.forName(className).newInstance();
                    ioc.put(className,obj);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return obj;
            } else {
                return ioc.get(className);
            }
        }
    }
}
