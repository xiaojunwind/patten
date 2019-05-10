package wind.patten.proxy.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/21 10:40
 **/
public class TestCGlibProxy {
    public static void main(String[] args) {

        try {
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"D://cglib_proxy_classes");
            People obj = (People) new CGlibProxy().getInstance(People.class);
            System.out.println(obj);
            obj.fetchPackage();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
