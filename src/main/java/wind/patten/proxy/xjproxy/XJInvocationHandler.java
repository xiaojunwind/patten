package wind.patten.proxy.xjproxy;

import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/21 9:40
 **/
public interface XJInvocationHandler {

    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
