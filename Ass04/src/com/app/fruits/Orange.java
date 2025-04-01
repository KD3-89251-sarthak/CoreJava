package com.app.fruits;

public class Orange extends Fruits{
    Orange()
    {
        this("Orange",20,"Orage");
    }
    public Orange(String name, double weight, String colour) {
        super(name, weight, colour);
        
    }
    void accepect()
    {
        super.accepect();
    }
    void display()
    {
        super.display();
    }
    public String test() {
        return "Sour";
    }
}

