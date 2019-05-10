package wind.patten.review;

import java.util.List;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/21 13:18
 **/
public interface HandleService {
    List<String> compare(String keys, String chatText);
}
