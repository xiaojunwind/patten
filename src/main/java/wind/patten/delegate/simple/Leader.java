package wind.patten.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/25 15:13
 **/
public class Leader {

    private Map<String,IEmployee> targets = new HashMap<String, IEmployee>();

    public Leader(){
        targets.put("加密",new EmployeeA());
        targets.put("登录",new EmployeeB());
    }

    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
