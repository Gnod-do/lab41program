import Behavior.IPlace;
import People.Shpuntik;
import People.Smekailo;
import People.Tourist;
import Object.*;
import checkException.PushException;
import checkException.TransformException;

public class Main {


    public static void main(String[] args){
       Smekailo smekailo = new Smekailo("Smekailo","Felmale");
        Shpuntik shpuntik = new Shpuntik("Shpuntik","'Male");
        Tourist tourist = new Tourist("Tourist","Male");
        Table table = new Table("table","red",Status.INITIAL_STATE);
        FoldingChair chair = new FoldingChair("Folding Chair","blue",Status.INITIAL_STATE);
        Umbrella umbrella = new Umbrella("Umbrella","green", Status.INITIAL_STATE);
        Tourist.Newperson newperson = tourist.new Newperson("Other man","male");

        IPlace Place = new IPlace() {
            private String location;
            @Override
            public void setLocation(String location) {
                this.location = location;
            }

            public String getLocation(){
                return location;
            }

           @Override
           public void express(){
                System.out.println(getLocation());
            }
        };
        Place.setLocation("IN THE ROOM");
        Place.express();

        smekailo.Show(tourist.getName(), "a kind of clumsy structure");
        smekailo.printMessage(smekailo.getName());
        System.out.println("It's like an " + umbrella.getName());

        try {
            smekailo.Push("the button on the " + umbrella.getName());
        }catch (PushException elex){
            System.out.println((elex.getMessage()));
        }

        try{
            umbrella.Transform(Status.TRANSFORMED_STATE);
        }catch (TransformException clex){
            System.out.println(clex.getMessage());
        }

        shpuntik.Sitdown(table.getName());
        shpuntik.LegBend("in the most unnatural way");

        try {
            shpuntik.Feel("comfort or inspiration");
        }catch (PushException lek){
            System.out.println(lek.getMessage());
        }

        newperson.Talk(shpuntik.getName(),"another topic");
        System.out.println("Then");
        shpuntik.Leave(table.getName());
        Tourist.AnotherPerson.Present("there");
        System.out.println(shpuntik.getName() + " turn around and ");
        shpuntik.Ask("that man","somethings new");
        System.out.println("");

    }

}

