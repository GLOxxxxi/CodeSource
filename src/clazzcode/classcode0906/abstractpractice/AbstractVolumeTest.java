package clazzcode.classcode0906.abstractpractice;

/**
 * AbstractVolume 测试类，包含了正方体类和球类的创建对象，分别调用方法求体积
 */
public class AbstractVolumeTest {

    public static void main(String[] args) {
        // 创建正方体对象 使用有参构造
        Cube cube = new Cube(6.5);
        // 求体积正方体体积并打印
        System.out.println("正方体体积：" + cube.getVolume());
        // 创建球体对象 使用有参构造
        Sphere sphere = new Sphere(3.4);
        // 求体积球体体积并打印
        System.out.println("球体体积：" + sphere.getVolume());
    }
}
