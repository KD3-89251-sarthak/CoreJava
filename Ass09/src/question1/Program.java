package question1;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program {
    private static Scanner sc = new Scanner(System.in);
    private static List<Student>list=new LinkedList<Student>();
    public static void searchStudentOnRollNo()
    {
        System.out.print("Enter Rollno to find the Student --> ");
        int id= sc.nextInt();
        Student ss=new Student();
        ss.setRollNo(id);
        //ss.display();
        if(list.contains(ss))
        {
            System.out.println("Details of the student --> ");
            int index= list.indexOf(ss);
            list.get(index).display();
        }
        else{
            System.out.println("Student not found");
        }
    }
    public  static void addStudent()
    {
        int i=0;
        System.out.print("How many students do u want to add -->");
        i=sc.nextInt();
        Student []s =new Student[i];
        for(int l = 0 ; l < s.length;l++ )
        {
            s[l]=new Student();
            s[l].accept();
            list.add(s[l]);
        }
    }
    public static void sortByName()
    {
        list.sort(new SortByName());
        System.out.println("Sorted by name -->");
        Iterator<Student>s=list.iterator();
        while(s.hasNext())
        {
            s.next().display();
        }
    }
    public static void sortByMarks()
    {
        list.sort(new SortByMarks());
        System.out.println("Sorted by name -->");
        Iterator<Student>s=list.iterator();
        while(s.hasNext())
        {
            s.next().display();
        }
    }
    public static void sortByRollNo()
    {
        Collections.sort(list);
        for(Student i : list)
        {
            i.display();
        }
    }
public static void dummyData()
{
    Student[] sl=new Student[3];
    sl[0]=new Student(1,"Sarthak",100);
    sl[1]=new Student(2,"Dhiraj",99);
    sl[2]=new Student(3,"Darshan",101);
    list.add(sl[0]);
    list.add(sl[1]);
    list.add(sl[2]);
}
public static int menueList()
{
    int choice ;
    System.out.println("*******************************************************************");
    System.out.println("0.Exit");
    System.out.println("1.Add Student info ");
    System.out.println("2.Search Student on roll No");
    System.out.println("3.Sort By roll no");
    System.out.println("4.Sort By the Name");
    System.out.println("5.Sort By the Marks");
    choice=sc.nextInt();
    System.out.println("*******************************************************************");
    return choice;
}
    public static void main(String[] args) {
        dummyData();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Added dummy data for the students is --> ");
        sortByRollNo();
        System.out.println("----------------------------------------------------------------------");

        int choice;
        while((choice=menueList())!=0)
        {
            switch (choice) {
                case 1:
                {
                    addStudent();
                    break;
                }
                case 2:
                {
                    searchStudentOnRollNo();
                    break;
                }
                case 3:
                {
                    sortByRollNo();
                    break;
                }
                case 4:
                {
                    sortByName();
                    break;
                }
                case 5:
                {
                    sortByMarks();
                    break;
                }
                default:
                System.out.println("----------Invalide Input given --------");
                    break;
            }
        }
    }
}
