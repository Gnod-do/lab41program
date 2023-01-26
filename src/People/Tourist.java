package People;

import Behavior.ITalk;

import java.util.Objects;

public class Tourist extends Human{
    public Tourist(String name, String gender){
        super(name, gender);
    }

    public class Newperson extends Tourist implements ITalk {
        public Newperson(String name, String gender){
            super(name, gender);
        }

        @Override
        public void Talk(String with, String about){
            System.out.println(this.getName() + " talk with " + with + about + ".");
        }

    }
//Static class
    public static class AnotherPerson extends Tourist {
        public AnotherPerson(String name, String gender){
            super(name, gender);
        }

        public static void Present(String where){
            System.out.println("Another person presents " + where);
        }
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
