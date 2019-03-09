package wind.patten.factory.abstractfactory;

/**
 * @author xiaojun
 * @Date 2019/3/9 17:58
 * @Version 1.0
 **/
public class TableSenceInit implements SenceInit {
    @Override
    public void init() {
        System.out.println("表单式场景初始化完成");
    }
}
