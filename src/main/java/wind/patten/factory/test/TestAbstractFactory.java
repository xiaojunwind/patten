package wind.patten.factory.test;

import wind.patten.factory.abstractfactory.AbstractSenceFactory;
import wind.patten.factory.abstractfactory.TableSenceFactory;
import wind.patten.factory.abstractfactory.TreeSenceFactory;

/**
 * @author xiaojun
 * @Date 2019/3/9 17:49
 * @Version 1.0
 **/
public class TestAbstractFactory {

    public static void main(String[] args) {
        AbstractSenceFactory factory = new TreeSenceFactory();
        factory.createSenceInit().init();
        factory.createSenceFixContent().fixContent();

        factory = new TableSenceFactory();
        factory.createSenceInit().init();
        factory.createSenceFixContent().fixContent();
    }
}
