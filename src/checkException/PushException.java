package checkException;

public class PushException extends RuntimeException{
    public PushException(){
        super("Fail to push");
    }
}
