
/* Maintain a HashSet of projects and perform given operations in a menu-driven program. 
Ensure that projects are not duplicated by the project id in the set. 
Each project information includes int id, String title, int teamSize, double projectCost , String technology. 
1. Add Dummy Data of Projects in the Set 
2. Input a Project from user and add in Set 
3. Display all Projects in Set 
4. Delete a Project by Id from Set 
5. Copy All Projects from Set to ArrayList 
6. Display all Projects from List 
7. Sort all Projects in List by cost 
Dummy Data 
8. Find project with Max team size using Collections.max() - 
new Project(1, "Train Reservation System", 5000000, "Java") - 
new Project(2, "Airline Reservation System",3, 6000000, ".NET") - 
new Project(4, "Online Grocery Shop", 6, 3000000, "Java") - 
new Project(5, "Online Book Shop", 2, 3000000, ".NET")  */
package question2;

import java.util.Scanner;

public class Project {
    /* int id, String title, int teamSize, double projectCost , String technology */
    private static Scanner sc=new Scanner(System.in);
    private int id;
    private String title;
    private double projectCost;
    private String technology;
    Project()
    {
        this(0,"Water fall ",100000,"Spring top");
    }
    Project(int id , String title , double projectCost,String technology)
    {
        this.id=id;
        this.technology=technology;
        this.title=title;
        this.projectCost=projectCost;
    }
    public boolean equals(Object obj)
    {
        if(obj==null)
        return false;
        if(obj==this)
        return true;
        if(!(obj instanceof Project))
        return false;
        Project o=(Project)obj;
        if(this.id==o.id)
            return true;
        return false;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
   public void accept()
   {
    System.out.print("Enter id - ");
    id =sc.nextInt();
    System.out.print("Enter title of the project  - ");
    title=sc.next();
    System.out.print("Enter name of techonology used  - ");
    technology=sc.next();
    System.out.print("Enter title of the project Cost  - ");
    projectCost=sc.nextDouble();
   }
   public void display()
   {
    System.out.print("Id of Project - "+id + " ");
    System.out.print("Title of Project - "+title+ " ");
    System.out.print("Technology used in Project - "+technology+ " ");
    System.out.print(" Cost - "+projectCost+ " ");
    System.out.println();
   }
   public int getId() {
    return id;
   }
   public void setId(int id) {
    this.id = id;
   }
   public String getTitle() {
    return title;
   }
   public void setTitle(String title) {
    this.title = title;
   }
   public double getProjectCost() {
    return projectCost;
   }
   public void setProjectCost(double projectCost) {
    this.projectCost = projectCost;
   }
   public String getTechnology() {
    return technology;
   }
   public void setTechnology(String technology) {
    this.technology = technology;
   }

}
