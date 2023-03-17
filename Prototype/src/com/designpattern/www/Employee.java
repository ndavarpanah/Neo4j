package com.designpattern.www;

public abstract class Employee implements Cloneable {

    private String id;
    protected String position;
    private String name;
    private String address;
    private double wage;

    abstract void work();

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        }
        catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return clone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public String getPosition(){
        return position;
    }
}
