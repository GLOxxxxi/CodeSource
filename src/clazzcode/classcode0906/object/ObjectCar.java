package clazzcode.classcode0906.object;

/**
 * Object 测试类，创建对象，使用hashcode，equals，toString，getClass
 */
public class ObjectCar {
    public static void main(String[] args) {
        // 创建两个Car对象 赋给相同的值
        Car car = new Car("劳斯莱斯", 162);
        Car car1 = new Car("劳斯莱斯", 162);

        // 获取对象的hashcode
        int c = car.hashCode();
        int c1 = car1.hashCode();
        System.out.println("car：" + c); // car：1956725890
        System.out.println("car1：" + c1); // car1：356573597

        //直接打印对象
        System.out.println(car); // clazzcode.classcode0906.object.Car@74a14482
        System.out.println(car1); // clazzcode.classcode0906.object.Car@1540e19d

        // 试用equals方法
        System.out.println(car == car1); // false
        boolean carEquals = car.equals(car1); // 重写equals方法
        System.out.println(carEquals); // true

        // 重写toString方法之后打印指定格式的字符串
        System.out.println("car的toString方法：" + car.toString());
        System.out.println("car1的toString方法：" + car1.toString());

        // getClass 获取字节码文件
        Class<? extends Car> carClass = car.getClass();
        System.out.println(carClass);
        Class<? extends Car> carClass1 = car1.getClass();
        // 字节码比较是否相等，用 ==
        System.out.println(carClass == carClass1);
    }
}
