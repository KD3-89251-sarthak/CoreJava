package com.app.fruits;


public class Apple extends Fruits {
    Apple()
    {
        this("Apple",20,"Orage");
    }
    public Apple(String name, double weight, String colour) {
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
        return "Sweet and sour ";
    }
}
