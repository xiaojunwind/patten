package wind.patten.delegate.simple;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/25 15:20
 **/
public class TestDelegate {
    public static void main(String[] args) {
        new Boss().command("登录",new Leader());
    }
}
