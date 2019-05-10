package wind.patten.proxy.jdkproxy;

import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/21 9:53
 **/
public class TestJDKProxy {

    public static void main(String[] args) {
        try{

            Object obj =  new JDKHusband().getInstance(new Wife());
            Method method = obj.getClass().getMethod("fetchPackage", null);
            method.invoke(obj);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
