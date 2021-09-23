package clazzcode.classcode0912;

/**
 * 内存溢出异常 MemoryCacheException
 */
public class MemoryCacheException extends Exception {

    /**
     * 内存溢出异常序列码
     */
    private static final long serialVersionUID = -2958055650858596416L;

    public MemoryCacheException() {}

    public MemoryCacheException(String message) {
        super(message);
    }
}
