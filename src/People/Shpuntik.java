package People;

import Behavior.ILegBend;
import Behavior.ISitdown;

import java.util.Objects;

public class Shpuntik extends Human implements ISitdown, ILegBend {
    public Shpuntik(String name, String gender){
         super(name, gender);
    }

    @Override
    public void Sitdown(String where){
        System.out.println(this.getName() + " sitdown on the " + where);
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
