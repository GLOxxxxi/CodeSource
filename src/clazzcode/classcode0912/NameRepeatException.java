package clazzcode.classcode0912;

/**
 * 姓名重复异常 NameRepeatException
 */
public class NameRepeatException extends Exception{

    /**
     * 姓名重复异常序列码
     */
    private static final long serialVersionUID = 5730520087089025460L;

    public NameRepeatException() {}

    public NameRepeatException(String message) {
        super(message);
    }
}
