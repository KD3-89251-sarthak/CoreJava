package com.app.fruits;

public class Mango extends Fruits {
    Mango()
    {
        this("Mango",20,"Orage");
    }
    public Mango(String name, double weight, String colour) {
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
        return "Sweet";
    }

}
