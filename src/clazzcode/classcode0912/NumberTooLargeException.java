package clazzcode.classcode0912;

/**
 * 数值过大异常 NumberTooLargeException
 */
public class NumberTooLargeException extends Exception {

    /**
     * 数值过大异常序列码
     */
    private static final long serialVersionUID = 2410320406119054939L;

    public NumberTooLargeException() {}

    public NumberTooLargeException(String message) {
        super(message);
    }
}
