package Object;

import Behavior.ITransform;
import checkException.TransformException;

import java.util.Objects;

import static Object.Status.TRANSFORMED_STATE;

public class Umbrella extends Object implements ITransform {
    public Table table;
    public FoldingChair chair;
    public Umbrella(String name, String color, Status status){
        super(name, color, status);
    }

//    unchecked exception
    @Override
    public void Transform(Status status) throws TransformException {
        if (status != TRANSFORMED_STATE ) throw new TransformException();
        System.out.println("The umbrella spread out");
        System.out.println(this.getName() + "has changed its status to " + status);
        System.out.println(this.getName() + "has turned into " + "table and chair ");
    }

    @Override
    public String toString(){
        return this.getName() + this.getColor() + this.getStatus();
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getName(), this.getColor(), this.getStatus());
    }

    @Override
    public boolean equals(java.lang.Object X){
        if (X == null) return false;
        if (this == X) return true;
        Umbrella umbrella = (Umbrella) X;
        return Objects.equals(this.getName(), umbrella.getName()) &&
                Objects.equals(this.getColor(), umbrella.getColor()) &&
                Objects.equals(this.getStatus(), umbrella.getStatus());
    }
}
