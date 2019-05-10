package wind.patten.proxy.staticproxy;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/21 10:07
 **/
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("real service is called");
    }
}
