package wind.patten.factory.abstractfactory;

/**
 * @author xiaojun
 * @Date 2019/3/9 17:59
 * @Version 1.0
 **/
public class TableSenceFixContent implements SenceFixContent {
    @Override
    public void fixContent() {
        System.out.println("表单式场景加载内容完成");
    }
}
