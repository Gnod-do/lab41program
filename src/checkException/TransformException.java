package checkException;

public class TransformException extends RuntimeException{
    public TransformException(){
        super("Fail to transform");
    }
}
