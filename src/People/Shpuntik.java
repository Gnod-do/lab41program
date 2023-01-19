package People;

import Behavior.IAsk;
import Behavior.ILeave;
import Behavior.ILegBend;
import Behavior.ISitdown;
import checkException.PushException;

import java.util.Objects;

public class Shpuntik extends Human implements ISitdown, ILegBend, ILeave, IAsk {
    public Shpuntik(String name, String gender){
         super(name, gender);
    }

    @Override
    public void Sitdown(String where){
        System.out.println(this.getName() + " sitdown on the " + where);
    }

    @Override
    public void Leave(String from){
        System.out.println(this.getName() + " leave from " + from);
    }

    @Override
    public void Ask(String who,String about){
        System.out.println(this.getName() + " ask " + who + " about " + about);
    }

    public void Feel(String how){
        if (how == null) throw  new PushException();
        System.out.println(this.getName() + " don't feel " + how + ".");
    }



    @Override
    public void LegBend(String how){
        System.out.println(this.getName() + " bends legs " + how);
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
        Shpuntik shpuntik = (Shpuntik) X;
        return Objects.equals(this.getName(), shpuntik.getName()) &&
                Objects.equals(this.getGender(), shpuntik.getGender());
    }
}
