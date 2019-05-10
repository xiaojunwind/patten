package wind.patten.proxy.jdkproxy;

import wind.patten.proxy.Person;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/21 9:47
 **/
public class Wife implements Person {
    @Override
    public void fetchPackage() {
        System.out.println("取快递");
    }
}
