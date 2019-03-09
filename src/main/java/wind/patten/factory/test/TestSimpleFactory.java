package wind.patten.factory.test;

import wind.patten.factory.simplefactory.Sence;
import wind.patten.factory.simplefactory.TreeSence;
/**
 * @author xiaojun
 * @Date 2019/3/9 17:27
 * @Version 1.0
 **/
public class TestSimpleFactory {
    public static void main(String[] args) {
        Sence sence = new TreeSence();
        sence.createSence();
    }
}
