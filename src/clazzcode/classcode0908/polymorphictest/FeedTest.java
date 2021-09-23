package clazzcode.classcode0908.polymorphictest;

/**
 * 为食测试类 TestFeed ,包含了创建了三个向上转型的对象,创建了 Person 类对象调用feedDog方法
 *
 */
public class FeedTest {
    public static void main(String[] args) {
        // 创建三个向上转型的Dog 子类对象装到父类容器中
        Dog husky = new Husky();
        Dog teddy = new Teddy();
        Dog tuDog = new TuDog();

        // 创建一个人类喂食对象
        Person person = new Person();
        // 调用为食方法传对应的 dog 对象
        System.out.println("==============哈士奇==============");
        person.feedDog(husky);
        System.out.println("============泰迪================");
        person.feedDog(teddy);
        System.out.println("=============土狗===============");
        person.feedDog(tuDog);
    }
}
