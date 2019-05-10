package wind.patten.proxy.staticproxy;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/21 10:10
 **/
public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
