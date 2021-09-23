package clazzcode.classcode0908.homework1;

/**
 * 车类驾驶测试类DriveTest，创建三个车类子类对象，在创建人类分别调用他们的drive方法
 */
public class DriveTest {
    public static void main(String[] args) {
        // 创建三个车类对象
        AbstractCar truck = new Truck();
        AbstractCar bull = new BullCar();
        AbstractCar military = new MilitaryVehicles();

        // 创建人类对象
        Person person = new Person();
        // 调用各自的开车方法
        System.out.println("===========货车============");
        person.drive(truck);
        System.out.println("===========牛车============");
        person.drive(bull);
        System.out.println("===========军车============");
        person.drive(military);

    }
}
