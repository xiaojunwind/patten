package wind.patten.factory.factorymethod;

import wind.patten.factory.simplefactory.Sence;
import wind.patten.factory.simplefactory.TreeSence;

/**
 * @author xiaojun
 * @Date 2019/3/9 17:27
 * @Version 1.0
 **/
public class TreeSenceFactory implements SenceFactory{
    @Override
    public Sence create() {
        return new TreeSence();
    }
}
