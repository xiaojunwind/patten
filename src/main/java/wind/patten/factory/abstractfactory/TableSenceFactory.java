package wind.patten.factory.abstractfactory;

/**
 * @author xiaojun
 * @Date 2019/3/9 17:58
 * @Version 1.0
 **/
public class TableSenceFactory extends AbstractSenceFactory {
    @Override
    public SenceInit createSenceInit() {
        return new TreeSenceInit();
    }

    @Override
    public SenceFixContent createSenceFixContent() {
        return new TreeSenceFixContent();
    }
}
