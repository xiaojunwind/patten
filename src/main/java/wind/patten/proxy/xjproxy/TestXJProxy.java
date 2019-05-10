package wind.patten.proxy.xjproxy;

import wind.patten.proxy.Person;
import wind.patten.proxy.jdkproxy.Wife;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/21 13:08
 **/
public class TestXJProxy {
    public static void main(String[] args) {
        try{
            Person obj = (Person) new XJHusband().getInstance(new Wife());
            System.out.println(obj.getClass());
            obj.fetchPackage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
