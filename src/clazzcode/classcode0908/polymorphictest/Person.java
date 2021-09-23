package clazzcode.classcode0908.polymorphictest;

/**
 * 人类提供喂狗方法,和每种狗的特有方法
 */
public class Person {

    /**
     * 喂狗方法
     * @param dog 狗对象
     */
    public void feedDog(Dog dog) {
        // 吃方法
        dog.eat();

        // 判断传入的狗类子类对象是那个子类对象,并调用该对象特有方法
        if (dog instanceof Husky) {
            Husky husky = (Husky) dog;
            husky.breakHome();
        } else if(dog instanceof Teddy) {
            Teddy teddy = (Teddy) dog;
            teddy.fuck();
        } else if(dog instanceof TuDog) {
            TuDog tuDog = (TuDog) dog;
            tuDog.protectHome();
        }

    }
}
