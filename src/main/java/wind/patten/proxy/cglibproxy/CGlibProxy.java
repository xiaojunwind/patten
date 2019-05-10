package wind.patten.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/21 10:32
 **/
public class CGlibProxy implements MethodInterceptor {


    public Object getInstance(Class<?> clazz) throws Exception{
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o,objects);
        after();
        return obj;
    }

    private void before() {
        System.out.println("带上钱包和身份证件");
    }

    private void after() {
        System.out.println("检查快递，付款确认收货");
    }
}
