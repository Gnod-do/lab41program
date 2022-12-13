package People;

import java.util.Objects;

public class Tourist extends Human{
    public Tourist(String name, String gender){
        super(name, gender);
    }

    @Override
    public String toString(){
        return this.getName() + this.getGender();
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getName(), this.getGender());
    }

    @Override
    public boolean equals(Object X){
        if (X == null) return false;
        if (this == X) return true;
        Tourist tourist = (Tourist) X;
        return Objects.equals(this.getName(), tourist.getName()) &&
                Objects.equals(this.getGender(), tourist.getGender());
    }
}
