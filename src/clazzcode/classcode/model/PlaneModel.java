package clazzcode.classcode.model;

public class PlaneModel extends AbstractModel{
    /**
     * 重写抽象方法
     */
    @Override
    public void changeClothes() {
        System.out.println("平台模特换衣呢");
    }

    /**
     * 重写toString
     * @return 父类的toString
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * 重写equals指定成员变量相同即为true
     * @param o 对象
     * @return 是否相同
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractModel that = (AbstractModel) o;
        return Double.compare(that.getWaistline(), getWaistline()) == 0 && Double.compare(that.getChestline(), getChestline()) == 0;
    }
}
