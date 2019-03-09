package wind.patten.factory.test;

import wind.patten.factory.factorymethod.SenceFactory;
import wind.patten.factory.factorymethod.TableSenceFactory;
import wind.patten.factory.factorymethod.TreeSenceFactory;
import wind.patten.factory.simplefactory.Sence;

/**
 * @author xiaojun
 * @Date 2019/3/9 17:29
 * @Version 1.0
 **/
public class TestFactoryMethod {
    public static void main(String[] args) {
        SenceFactory senceFactory = new TreeSenceFactory();
        Sence sence = senceFactory.create();
        sence.createSence();

        senceFactory = new TableSenceFactory();
        sence = senceFactory.create();
        sence.createSence();
    }
}
