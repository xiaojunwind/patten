package wind.patten.factory.simplefactory;
/**
 * @author xiaojun
 * @Date 2019/3/9 17:27
 * @Version 1.0
 **/
public class TableSence implements Sence {
    @Override
    public void createSence() {
        System.out.println("创建一个表单式场景");
    }
}
