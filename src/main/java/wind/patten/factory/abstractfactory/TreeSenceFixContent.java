package wind.patten.factory.abstractfactory;

/**
 * @author xiaojun
 * @Date 2019/3/9 17:47
 * @Version 1.0
 **/
public class TreeSenceFixContent implements SenceFixContent{
    @Override
    public void fixContent() {
        System.out.println("树场景加载内容完成");
    }
}
