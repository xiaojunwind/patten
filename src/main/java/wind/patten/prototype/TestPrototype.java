package wind.patten.prototype;

/**
 * @Description TODO
 * @Author xiaojun
 * @Date 2019/3/20 22:22
 **/
public class TestPrototype {
    public static void main(String[] args) {
        SysSenceContentExtendTmpEntity sysSenceContentExtendTmpEntity = new SysSenceContentExtendTmpEntity();
        sysSenceContentExtendTmpEntity.setUsername("admin");
        sysSenceContentExtendTmpEntity.setExtendQuestion("question");

        SysSenceContentExtendEntity sysSenceContentExtendEntity = new SysSenceContentExtendEntity(sysSenceContentExtendTmpEntity);
    }
}
