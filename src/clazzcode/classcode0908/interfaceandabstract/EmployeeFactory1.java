package clazzcode.classcode0908.interfaceandabstract;

/**
 * 继承 AbstractEmployee 支持 阿里支付,微信支付
 */
public class EmployeeFactory1 extends AbstractEmployee implements IAli, IWeChat {

    /**
     * 重写工作内容
     */
    @Override
    public void work() {
        System.out.println("造个汽车");
    }

    /**
     * 支付支付宝
     */
    @Override
    public void aliPay() {
        System.out.println("支付宝到账");
    }

    /**
     * 支持微信
     */
    @Override
    public void weChatPay() {

        System.out.println("微信收款");
    }
}
