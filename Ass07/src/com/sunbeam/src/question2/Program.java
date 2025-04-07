

/*Use Arrays.sort() to sort array of Students using Comparator. The 1st level sorting should be on city
(desc), 2nd level sorting should be on marks (desc), 3rd level sorting should be on name (asc).
class Student {
private int roll;
private String name;
private String city;
private double marks;
// ...*/


package question2;


import java.util.Arrays;
import java.util.Comparator;

class Student {
    private int roll;
    private String name;
    private String city;
    private double marks;

    // Constructor
    public Student(int roll, String name, String city, double marks) {
        this.roll = roll;
        this.name = name;
        this.city = city;
        this.marks = marks;
    }

    // Getters
    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getMarks() {
        return marks;
    }

    // Setters
    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // toString method
    @Override
    public String toString() {
        return roll + " - " + name + " - " + city + " - " + marks;
    }
}

public class Program {
    public static void main(String[] args) {
        Student[] students = {
            new Student(101, "Amit", "Pune", 85.0),
            new Student(102, "Ravi", "Mumbai", 90.0),
            new Student(103, "Sneha", "Pune", 90.0),
            new Student(104, "Ravi", "Mumbai", 85.0),
            new Student(105, "Anjali", "Delhi", 92.0)
        };

        // Sorting using Arrays.sort() and Comparator
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // 1. City - Descending
                int cityCompare = s2.getCity().compareTo(s1.getCity());
                if (cityCompare != 0) 
                return cityCompare;

                // 2. Marks - Descending
               int marksCompare = Double.compare(s2.getMarks(), s1.getMarks());
                if (marksCompare != 0) return marksCompare;

                // 3. Name - Ascending
                return s1.getName().compareTo(s2.getName());
            }
        });

        // Print the sorted students
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

