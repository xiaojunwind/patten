package wind.patten.singleton.serializable;

import java.io.Serializable;

/**
 * @Description 序列化
 * @Author xiaojun
 * @Date 2019/3/19 17:24
 **/
public class SerializableSingleton implements Serializable {
    private SerializableSingleton(){}

    private final static SerializableSingleton INSTANCE = new SerializableSingleton();

    public static SerializableSingleton getInstance(){
        return INSTANCE;
    }

    private Object readResolve(){
        return INSTANCE;
    }
}
