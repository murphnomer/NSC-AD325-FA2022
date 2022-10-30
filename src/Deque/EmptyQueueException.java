package Deque;

public class EmptyQueueException extends Throwable {

    public EmptyQueueException() {
        super();
    }
    public EmptyQueueException(String message) {
        super(message);
    }
}
