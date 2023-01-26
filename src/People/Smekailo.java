package People;

import Behavior.IPush;
import Behavior.IShow;
import checkException.PushException;
import checkException.TimeException;

import java.util.Objects;

public class Smekailo extends Human implements IShow, IPush {

    public Smekailo(String name, String gender){
        super(name, gender);
    }

    @Override
    public void Show(String who, String what){
        System.out.println(this.getName() + " show " + who + what );
    }


//    Local classes
    public void printMessage(String msg){
        final String parent = "DO SOMETHING";

        class LocalClass{
            String msg;
            LocalClass(String msg){
                this.msg = msg;
            }

            public void print(){
                System.out.println(this.msg + " WILL " +parent );
            }
        }

        LocalClass lc = new LocalClass(msg);
        lc.print();
    }

//    unchecked exception
    @Override
    public void Push(String what) throws PushException{
        if (what == null ) throw new PushException();
        System.out.println(this.getName() + " put " + what);
    }

    public void doSomethings(String what) throws PushException{
        if (what == null)  throw new PushException();
        System.out.println(this.getName()+ " are doing " + what);
    }

    public void understand(boolean isHaveTime){
        try{
            haveTime(isHaveTime);
        } catch (TimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void haveTime(boolean isHaveTime) throws TimeException{
        if (!isHaveTime){
            throw new TimeException("NOT SUCCESSFUL");
        }

        System.out.println("SUCCESSFUL");
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
