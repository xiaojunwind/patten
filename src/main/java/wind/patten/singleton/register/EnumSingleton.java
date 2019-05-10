package wind.patten.singleton.register;

/**
 * @Description 通过枚举类实现注册式单例，通常在API使用
 * @Author xiaojun
 * @Date 2019/3/19 17:15
 **/
public enum EnumSingleton {
    INSTANCE;
    private Object data;
    public Object getData(){
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
