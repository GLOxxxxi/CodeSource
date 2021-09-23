package clazzcode.classcode0909.anonymousinnerclass;

/**
 * 支付测试类，包含用匿名内部类，lambda测试支付方法
 */
public class PayTest {


    public static void main(String[] args) {
        // 匿名内部类方式
        PayPal innerPay = new PayPal() {
            @Override
            public void pay() {
                System.out.println("匿名内部类支付");
            }
        };
        // 调用支付方法
        innerPay.pay();

        // lambda方式
        PayPal lambdaPay = () -> System.out.println("lambda支付");
        // 调用支付方法
        lambdaPay.pay();

    }
}
