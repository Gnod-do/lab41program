package Object;

import java.util.Objects;

public class FoldingChair extends Object{
    public FoldingChair(String name, String color, Status status){
        super(name, color, status);
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
        FoldingChair chair = (FoldingChair) X;
        return Objects.equals(this.getName(), chair.getName()) &&
                Objects.equals(this.getColor(), chair.getColor()) &&
                Objects.equals(this.getStatus(), chair.getStatus());
    }
}
