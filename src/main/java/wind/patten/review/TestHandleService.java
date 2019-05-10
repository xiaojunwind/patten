package wind.patten.review;

import java.util.List;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/21 13:46
 **/
public class TestHandleService {
    public static void main(String[] args) {
        HandleService handleService = new ProxyHandleServiceImpl(new HandleServiceImpl());
        List<String> keys=handleService.compare("7,2,3,4","23576");
        System.out.println(keys.toString());
    }
}
