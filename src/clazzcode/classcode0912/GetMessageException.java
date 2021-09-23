package clazzcode.classcode0912;

/**
 * 获取信息异常 GetMessageException
 */
public class GetMessageException extends Exception {

    /**
     * 获取信息异常序列码
     */
    private static final long serialVersionUID = 4272075706916928941L;

    public GetMessageException() {}

    public GetMessageException(String message) {
        super(message);
    }
}
