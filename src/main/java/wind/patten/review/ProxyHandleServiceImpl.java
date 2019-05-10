package wind.patten.review;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/21 13:31
 **/
public class ProxyHandleServiceImpl implements HandleService {


    private HandleService handleService;
    public ProxyHandleServiceImpl(HandleService handleService){
        this.handleService = handleService;
    }

    @Override
    public List<String> compare(String keys, String chatText) {
        List<String> hitKeys = handleService.compare(keys,chatText);
        Collections.sort(hitKeys);
        return hitKeys;
    }
}
