package clazzcode.classcode0908.polymorphic;

/**
 * Animals测试类包含创建两个向上造型的对象,调用重写之后的方法,再向下造型调用子类特有的方法
 */
public class AnimalsTest {
    public static void main(String[] args) {
        // 人类,猪类向上造型
        Animals animal = new Person();
        Animals animal1 = new Pig();
        // 调用重写之后的方法
        animal.eat();
        animal1.eat();

        // 向下造型
        Person person = (Person) animal;
        Pig pig = (Pig) animal1;
        // 调用子类特有方法
        person.coding();
        pig.gongBaiCai();
    }
}
