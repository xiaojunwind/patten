package wind.patten.delegate.simple;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/25 15:12
 **/
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }
}
