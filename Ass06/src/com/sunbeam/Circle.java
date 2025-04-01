package com.sunbeam;

//User-defined exception for negative diameter
class InvalidDiameterException extends Exception {
 public InvalidDiameterException(String message) {
     super(message);
 }
}

//Circle class definition
class Circle {
 private double myX;
 private double myY;
 private double myDiameter;

 // Default constructor
 public Circle() {
     this.myX = 0;
     this.myY = 0;
     this.myDiameter = 100;
 }

 // Parameterized constructor
 public Circle(double x, double y, double diameter) throws InvalidDiameterException {
     if (diameter < 0) {
         throw new InvalidDiameterException("Diameter cannot be negative.");
     }
     this.myX = x;
     this.myY = y;
     this.myDiameter = diameter;
 }

 // Accessor methods
 public double getX() {
     return myX;
 }

 public double getY() {
     return myY;
 }

 public double getDiameter() {
     return myDiameter;
 }

 // Mutator method for diameter with validation
 public void setDiameter(double diameter) throws InvalidDiameterException {
     if (diameter < 0) {
         throw new InvalidDiameterException("Diameter cannot be negative.");
     }
     this.myDiameter = diameter;
 }

 // Display circle details
 public void display() {
     System.out.println("Circle Center: (" + myX + ", " + myY + ")");
     System.out.println("Diameter: " + myDiameter);
 }

 public static void main(String[] args) {
     try {
         Circle c1 = new Circle(); // Default constructor
         c1.display();
         
         Circle c2 = new Circle(5, 5, 50); // Parameterized constructor
         c2.display();
         
         c2.setDiameter(25); // Updating diameter
         c2.display();
         
         // Uncommenting below will throw an exception
         Circle c3 = new Circle(2, 2, -10);
     } catch (InvalidDiameterException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}
