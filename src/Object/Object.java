package Object;

import jdk.jshell.Snippet;

public abstract class Object {
    private String name;
    private String color;
    private Status status;


    public Object(String name, String color, Status status){
        this.name = name;
        this.color = color;
        this.status = status;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public Status getStatus(){
        return status;
    }

    public void setStatus(Status status){
        this.status = status;
    }
}
