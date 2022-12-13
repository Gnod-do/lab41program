package Object;

import People.Shpuntik;

import java.util.Objects;

public class Table extends Object{
    public Table(String name, String color,Status status){
        super(name, color,status);
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
        Table table = (Table) X;
        return Objects.equals(this.getName(), table.getName()) &&
                Objects.equals(this.getColor(), table.getColor()) &&
                Objects.equals(this.getStatus(), table.getStatus());
    }
}
