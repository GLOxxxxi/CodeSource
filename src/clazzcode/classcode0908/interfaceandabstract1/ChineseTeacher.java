package clazzcode.classcode0908.interfaceandabstract1;
/**
 * 继承教学类AbstractTeaching
 */
public class ChineseTeacher extends AbstractTeaching{
    /**
     * 重写teaching方法
     */
    @Override
    void teaching() {
        System.out.println("教语文,学做人");
    }
}
