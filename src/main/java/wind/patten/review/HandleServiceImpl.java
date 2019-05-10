package wind.patten.review;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/21 13:28
 **/
public class HandleServiceImpl implements HandleService {
    @Override
    public List<String> compare(String keys, String chatText) {
        List<String> hitKeys = new LinkedList<String>();
        if(keys!=null&&keys.length()>0){
            String[] spit = keys.split(",");
            for (int i = 0; i < spit.length; i++) {
                Pattern pattern = Pattern.compile(spit[i]);
                Matcher matcher = pattern.matcher(chatText);
                if(matcher.find()){
                    hitKeys.add(spit[i]);
                }
            }
        }
        return hitKeys;
    }
}
