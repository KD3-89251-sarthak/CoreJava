package question2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*1. Add Dummy Data of Projects in the Set 
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
public class Program {
    private static Scanner sc = new Scanner(System.in);
    private static Set<Project> set = new HashSet<Project>();
    private static List<Project>list=new ArrayList<Project>(); 

    public static Project[] dummyData() {
        Project[] arr = new Project[4];
        arr[0] = new Project(1, "Train Reservation System", 5000000, "Java");
        arr[1] = new Project(2, "Airline Reservation System", 6000000, ".NET");
        arr[2] = new Project(4, "Online Grocery Shop", 3000000, "Java");
        arr[3] = new Project(5, "Online Book Shop", 3000000, ".NET");
        return arr;
    }

    public static int menueList() {
        int choice;
        System.out.println("----------------------------------------------------------------");
        System.out.println("0.Exit");
        System.out.println("1.Add dummy data to  set");
        System.out.println("2.Take input from user and add to set");
        System.out.println("3.Dsiplay all projects from set");
        System.out.println("4.Delete the project by id ");
        System.out.println("5.Copy all elemnts to the set");
        System.out.println("6.Display all projects from the List");
        System.out.println("7.Sort all projects by using the list on <Cost> fiel ");
        System.out.print("Enter your choice --> ");
        choice = sc.nextInt();
        System.out.println("----------------------------------------------------------------");

        return choice;
    }

    public static void addProjectToSetUsingDummmyData(Project[] arr) {
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (Project i : set) {
            i.display();
        }
        if (set.isEmpty()) {
            System.out.println("Projects added to the set using the dummy data");
        }
    }

    public static void acceptTheDataForProjectFromUser(int[] ar) {
        System.out.print("Enter how many projects do u want to add to the set --> ");
        ar[0] = sc.nextInt();
        Project[] arr = new Project[ar[0]];
        for (int l = 0; l < arr.length; l++) {
            arr[l] = new Project();
            arr[l].accept();
            set.add(arr[l]);
        }

    }

    public static void displayAllProjects() {
        if (!set.isEmpty()) {
            for (Project i : set) {
                i.display();
            }
        }

    }
public static boolean deleteProjectById(int[]ar)
{
    Project p=new Project();
    System.out.println("Enter the id to delete the id");
    ar[0]=sc.nextInt();
    p.setId(ar[0]);
    if(set.contains(p))
    {
        set.remove(p);
        return true;
    }
    else{
        return false;
    }
}
public static void addToListFromSet()
{
    Iterator<Project> i = set.iterator();
    while(i.hasNext())
    {
        list.add(i.next());
    }
   
}
public static void displayAllProjectsFromList()
{
    System.out.println("Dsiplaying from the list ------->");
    for(Project o : list)
    {
     o.display();
    }
}
public static void sortByUsingListOnCost() // Use comparaator 
{

    list.sort(new SortByCost());
    System.out.println("List after sorting by the cost Updated list -- > ");
    displayAllProjectsFromList();
}
    public static void main(String[] args) {
        Project[] arr = dummyData();
        int[] ar = new int[1];
        int choice;
        while ((choice = menueList()) != 0) {
            switch (choice) {
                case 1: {
                    addProjectToSetUsingDummmyData(arr);
                    break;
                }
                case 2: {
                    acceptTheDataForProjectFromUser(ar);
                    break;
                }
                case 3: {
                    displayAllProjects();
                    break;
                }
                case 4 : 
                {
                    boolean b = deleteProjectById(ar);
                    System.out.println(b ? "Index Deleted ":"Index not found for deletion please provide the valid index");
                    break;
                }
                case 5 : 
                {
                    addToListFromSet();
                    break;
                }
                case 6 :
                {
                    displayAllProjectsFromList();
                    break;
                }
                case 7 :
                {
                    sortByUsingListOnCost();
                }
                default:
                System.out.println("Please enter valid choice");
                    break;
            }
        }
    }
}
