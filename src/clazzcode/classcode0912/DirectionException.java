package clazzcode.classcode0912;

/**
 * 获取信息异常 GetMessageException
 */
public class DirectionException extends Exception {

    /**
     * 内存溢出异常序列码
     */
    private static final long serialVersionUID = -6466118699278230213L;

    public DirectionException() {}

    public DirectionException(String message) {
        super(message);
    }
}
