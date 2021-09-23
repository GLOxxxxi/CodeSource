package clazzcode.classcode0908.interfaceandabstract;

/**
 * 工厂测试类,包含了创建三个工厂对象,分别实现上班下班打卡和工作,工厂1还可以微信支付宝支付,工厂2只能微信支付
 */
public class FactoryTest {

    public static void main(String[] args) {
        System.out.println("=====================第一工厂======================");
        // 创建第一工厂对象
        EmployeeFactory1 employeeFactory1 = new EmployeeFactory1();
        // 调用打卡方法和,工作,支付方法
        employeeFactory1.clockIn();
        employeeFactory1.clockOut();
        employeeFactory1.work();
        employeeFactory1.aliPay();
        employeeFactory1.weChatPay();
        System.out.println("======================第二工厂=====================");
        // 创建第二工厂对象
        EmployeeFactory2 employeeFactory2 = new EmployeeFactory2();
        // 调用打卡方法和,工作,支付方法
        employeeFactory2.clockIn();
        employeeFactory2.clockOut();
        employeeFactory2.work();
        employeeFactory2.weChatPay();
        System.out.println("=====================第三工厂======================");
        // 创建第三工厂对象
        EmployeeFactory3 employeeFactory3 = new EmployeeFactory3();
        // 调用打卡方法和,工作
        employeeFactory3.clockIn();
        employeeFactory3.clockOut();
        employeeFactory3.work();
    }
}
