import People.Shpuntik;
import People.Smekailo;
import People.Tourist;
import Object.*;

public class Main {
    public static void main(String[] args){
        Smekailo smekailo = new Smekailo("Smekailo","Felmale");
        Shpuntik shpuntik = new Shpuntik("Shpuntik","'Male");
        Tourist tourist = new Tourist("Tourist","Male");
        Table table = new Table("table","red",Status.INITIAL_STATE);
        FoldingChair chair = new FoldingChair("Folding Chair","blue",Status.INITIAL_STATE);
        Umbrella umbrella = new Umbrella("umbrella","green", Status.INITIAL_STATE);

        smekailo.Show(tourist.getName(), "a kind of clumsy structure");
        System.out.println("It's like an " + umbrella.getName());
        smekailo.Push("the button on the " + umbrella.getName());
        umbrella.Transform(Status.TRANSFORMED_STATE);
        shpuntik.Sitdown(table.getName());
        shpuntik.LegBend("in the most unnatural way");
        System.out.println("");
    }
}

