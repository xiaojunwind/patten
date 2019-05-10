package wind.patten.delegate.simple;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/25 15:15
 **/
public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工B，我现在开始做" + command + "工作");
    }
}
