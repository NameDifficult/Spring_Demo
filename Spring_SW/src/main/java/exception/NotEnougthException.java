package exception;

/**
 * @Author Mi
 * @Date 2022/3/26 10:55
 * @Version 1.0
 */

/**
 * 运行时异常
 */
public class NotEnougthException extends RuntimeException{
    public NotEnougthException() {
        super();
    }

    public NotEnougthException(String message) {
        super(message);
    }
}
