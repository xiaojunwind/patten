package wind.patten.proxy.staticproxy;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/21 10:07
 **/
public class Proxy implements Subject {

    private Subject subject;
    public Proxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    private void after() {
        System.out.println("called after request().");
    }

    private void before() {
        System.out.println("called before request().");
    }
}
