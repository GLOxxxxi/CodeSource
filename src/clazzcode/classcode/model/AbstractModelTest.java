package clazzcode.classcode.model;

public class AbstractModelTest {
    public static void main(String[] args) {
        // 创建两个t台模特对象
        TShowModel tShowModel = new TShowModel();
        TShowModel tShowModel1 = new TShowModel();
        // 调用普通方法，抽象方法
        tShowModel.walkThrough();
        tShowModel1.changeClothes();
        // 对象赋值
        tShowModel.setName("胡胡");
        tShowModel.setChestline(45);
        tShowModel.setHipline(53);
        tShowModel.setWaistline(54);
        // 调用重写之后的toString
        System.out.println(tShowModel.toString());
        tShowModel1.setName("胡胡双胞胎");
        tShowModel1.setChestline(45);
        tShowModel1.setHipline(53);
        tShowModel1.setWaistline(54);
        System.out.println(tShowModel1.toString());
        // 调用重写之后的equals
        System.out.println(tShowModel.equals(tShowModel1));

        // 创建两个广告模特对象
        AdvertModel advertModel = new AdvertModel();
        AdvertModel advertModel1 = new AdvertModel();
        // 调用普通方法，抽象方法
        advertModel.walkThrough();
        advertModel1.changeClothes();
        // 对象赋值
        advertModel.setName("图图");
        advertModel.setChestline(41);
        advertModel.setHipline(521);
        advertModel.setWaistline(512);
        // 调用重写之后的toString
        System.out.println(advertModel.toString());

        advertModel1.setName("图图");
        advertModel1.setChestline(41);
        advertModel1.setHipline(52);
        advertModel1.setWaistline(51);
        System.out.println(advertModel1.toString());
        // 调用重写之后的equals
        System.out.println(advertModel.equals(advertModel1));
        // 创建两个平面模特对象
        PlaneModel planeModel = new PlaneModel();
        PlaneModel planeModel1 = new PlaneModel();
        // 调用普通方法，抽象方法
        planeModel.walkThrough();
        planeModel1.changeClothes();
        // 对象赋值
        planeModel.setName("宝宝");
        planeModel.setChestline(44);
        planeModel.setHipline(33);
        planeModel.setWaistline(44);
        // 调用重写之后的toString
        System.out.println(planeModel.toString());
        planeModel1.setName("宝宝双胞胎姐姐");
        planeModel1.setChestline(44);
        planeModel1.setHipline(331);
        planeModel1.setWaistline(44);
        System.out.println(planeModel1.toString());
        // 调用重写之后的equals
        System.out.println(planeModel.equals(planeModel1));

    }
}
