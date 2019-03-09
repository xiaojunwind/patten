package wind.patten.factory.abstractfactory;

/**
 * @author xiaojun
 * @Date 2019/3/9 17:34
 * @Version 1.0
 **/
public abstract class AbstractSenceFactory {

    public abstract SenceInit createSenceInit();
    public abstract SenceFixContent createSenceFixContent();
}
