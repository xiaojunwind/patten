package wind.patten.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/21 9:48
 **/
public class JDKHusband implements InvocationHandler {

    private Object target;
    public Object getInstance(Object person) throws Exception{
        this.target = person;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void before() {
        System.out.println("带上钱包及证件");
    }

    private void after() {
        System.out.println("检查快递是否损坏，没问题，付款收货");
    }
}
