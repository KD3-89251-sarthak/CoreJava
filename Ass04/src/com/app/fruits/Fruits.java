
/* Apply inheritance n polymorphism 
a)  Arrange Fruit, Apple, Orange, Mango in inheritance hierarchy 
b)  Properties (instance variables) : color: String, weight : double , name: String, isFresh:   
boolean 
c)  Add suitable constructors. 
d) Override toString correctly to return state of all fruits (including: name ,color , weight ) 
e)  Add a taste() method : public String taste() which will be an abstract method 
Apple: should return "sweet and sour� 
Mango: should return "sweet"  
Orange: should return "sour" 
f) Add all of above classes under the package "com.app.fruits" 
g) Create a Class FruitBasket , with main method inside it. Use it for testing 
h) Prompt user for the basket size n create suitable data structure and give options 
0. Exit 
1. Add Mango 
boundary checking      
basket [counter++]=new 
Mango(nm, weight, color); break; 
2. Add Orange 
3. Add Apple 
NOTE: You will be adding a fresh fruit in the basket, in all of above options. 
4. Display names of all fruits in the basket. eg : for-each --- null checking --getName() 
5. Display name, color, weight, taste of all fresh fruits, in the basket. eg : for-each , null 
checking --toString , taste, isFresh: getter 
6. Display tastes of all stale (not fresh) fruits in the basket. 
7. Mark a fruit as stale i/p : index 
Eg: setter : isFresh : false 
O/P: error message (in case of invalid index) or mark it stale. 
8. Mark all sour fruits stale (optional) eg : for-each , taste --equals(String) */
package com.app.fruits;

import java.util.Scanner;

abstract class Fruits {
    String name ;
    double weight;
    String colour;
    boolean isFresh;
    public Fruits(String name, double weight, String colour) {
        this.name = name;
        this.weight = weight;
        this.colour = colour;
        isFresh=true;
    }
    Scanner sc = new Scanner(System.in);
    void accepect()
    {
        
        System.out.print("Enter name of the Fruit - ");
        name = sc.next();
        System.out.print("Enter weight of the Fruit - ");
        weight = sc.nextDouble();
        System.out.print("Enter colour  of the Fruit - ");
        colour = sc.next();
    }
    void display()
    {
        System.out.println("Name - "+name);
        System.out.println("weight - "+weight);
        System.out.println("colour - "+colour);
        if(isFresh)
        System.out.println("Fresh fruit ");
        System.out.println("Fruit is Steal");

        
    }
    public abstract String test();
    
    public String toString() {
        return "Name - "+name +" Weight - " +weight+" Colour -"+colour;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public boolean isFresh() {
        return isFresh;
    }
    public void setFresh(boolean isFresh) {
        this.isFresh = isFresh;
    }

    
}
