package clazzcode.classcode0908.homework1;

/**
 * 人类,有开车方法,不同车有不同特效
 */
public class Person {
    
    void drive(AbstractCar car) {
        // 调用run方法
        car.run();
        // 判断传入的车类子类对象是那个子类对象,并调用该对象特有方法
        if (car instanceof BullCar) {
            BullCar bullCar = (BullCar) car;
            bullCar.eatGrass();
        } else if(car instanceof MilitaryVehicles) {
            MilitaryVehicles militaryVehicles = (MilitaryVehicles) car;
            militaryVehicles.fire();
        } else if(car instanceof Truck) {
            Truck truck = (Truck) car;
            truck.translate();
        }
    }
}
