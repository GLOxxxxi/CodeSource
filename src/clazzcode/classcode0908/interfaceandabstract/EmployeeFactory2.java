package clazzcode.classcode0908.interfaceandabstract;

/**
 * 继承 AbstractEmployee 支持 微信支付
 */
public class EmployeeFactory2 extends AbstractEmployee implements IWeChat {

    /**
     * 重写work内容
     */
    @Override
    public void work() {
        System.out.println("装个汽车");
    }

    /**
     * 支持微信支付
     */
    @Override
    public void weChatPay() {

        System.out.println("微信到账");
    }
}
