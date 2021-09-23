package clazzcode.classcode0908.interfaceandabstract1;

/**
 * 继承教学类AbstractTeaching,实现作业接口IHomework
 */
public class EnglishTeacher extends AbstractTeaching implements IHomework{
    /**
     * 重写教学方法
     */
    @Override
    void teaching() {
        System.out.println("教英语");
    }

    /**
     * 布置作业
     */
    @Override
    public void assignHomework() {
        System.out.println("就一页作业");
    }
}
