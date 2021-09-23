package clazzcode.classcode0908.interfaceandabstract;

/**
 * 继承 AbstractEmployee
 */
public class EmployeeFactory3 extends AbstractEmployee {
    /**
     * 重写工作内容
     */
    @Override
    public void work() {
        System.out.println("测个汽车");
    }
}
