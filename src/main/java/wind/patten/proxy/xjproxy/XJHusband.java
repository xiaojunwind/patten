package wind.patten.proxy.xjproxy;

import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/21 13:04
 **/
public class XJHusband implements XJInvocationHandler {

    private Object target;
    public Object getInstance(Object person) throws Exception{
        this.target = person;
        Class<?> clazz = target.getClass();
        return XJProxy.newProxyInstance(new XJClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void before() {
        System.out.println("带上钱包和身份证件");
    }

    private void after() {
        System.out.println("检查快递，确认收货，付款");
    }
}
