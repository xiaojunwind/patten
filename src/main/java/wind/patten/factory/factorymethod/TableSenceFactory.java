package wind.patten.factory.factorymethod;

import wind.patten.factory.simplefactory.Sence;
import wind.patten.factory.simplefactory.TableSence;

/**
 * @author xiaojun
 * @Date 2019/3/9 17:29
 * @Version 1.0
 **/
public class TableSenceFactory implements SenceFactory {
    @Override
    public Sence create() {
        return new TableSence();
    }
}
