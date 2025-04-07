/*Create a menu driven code that have below menus 
1. add the student in the collection - accept the details from user and add in the collection 2. Display all the 
students using iterator. 
3. search the student on rollno and if found display his details. 
4. sort the students on rollno 
5. sort the students on name 
6. sort the students on marks 
(Hint - use List Interface and Object of ArrayList)  */
package question1;
import java.util.Scanner;

public class Student implements Comparable<Student> {
    private int rollNo;
    private String name;
    private double marks;
    private static Scanner sc = new Scanner(System.in);

    public Student() {
        this(0, "Kedar", 100);
    }

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public  void accept() {
        System.out.print("Enter Roll no of the student -->  ");
        rollNo = sc.nextInt();
        System.out.print("Enter name  of the Student -->  ");
        name = sc.next();
        System.out.print("Enter Marks  of the Student -->  ");
        marks = sc.nextDouble();
    }

    public void display() {
        System.out.println("Roll No  - " + rollNo);
        System.out.println("Name - " + name);
        System.out.println("Marks - " + marks);
    }
    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (this == o)
            return true;
        if (!(o instanceof Student))
            return false;
        Student s = (Student) o;
        if (s.rollNo == this.rollNo)
            return true;
        return false;
    }

    public int compareTo(Student obj) {
        return this.rollNo - obj.rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

}
