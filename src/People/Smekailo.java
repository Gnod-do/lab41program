package People;

import Behavior.IPush;
import Behavior.IShow;

import java.util.Objects;

public class Smekailo extends Human implements IShow, IPush {

    public Smekailo(String name, String gender){
        super(name, gender);
    }

    @Override
    public void Show(String who, String what){
        System.out.println(this.getName() + " show " + who + what );
    }

    @Override
    public void Push(String what){
        System.out.println(this.getName() + " put " + what);
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
        Smekailo smekailo = (Smekailo) X;
        return Objects.equals(this.getName(), smekailo.getName()) &&
                Objects.equals(this.getGender(), smekailo.getGender());
    }
}
