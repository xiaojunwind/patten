package wind.patten.factory.abstractfactory;

/**
 * @author xiaojun
 * @Date 2019/3/9 17:43
 * @Version 1.0
 **/
public class TreeSenceFactory extends AbstractSenceFactory {

    @Override
    public SenceInit createSenceInit() {
        return new TreeSenceInit();
    }

    @Override
    public SenceFixContent createSenceFixContent() {
        return new TreeSenceFixContent();
    }
}
