/*Book details: isbn(string), price(double), authorName(string), quantity(int)
 Write a menu driven program to
 1. Add new book in list
 2. Display all books in forward order
 3. Display all books in reverse order
 4. Delete a book at given index. */
package domain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Program {
    private static List<Library> booklist=new ArrayList<Library>();
    public static Scanner sc = new Scanner(System.in);
    public static Library[] getBooks()
    {
        Library[] l=new Library[5];
        l[0]=new Library(1,"Wings of fire ",100.30,"Kedar1",2);
        l[1]=new Library(2,"Ikigai",101,"Sanket",3);
        l[2]=new Library(3,"The Crash",102,"Shubham",4);
        l[3]=new Library(4,"Harry Potter",103,"Aditya",6);
        l[4]=new Library(5,"Atomic",104,"Vaibhav",8);
        return l;
    }
    public static void addBooks(Library []arr)
    {
        for(Library i : arr)
        {
            booklist.add(i);
        }
        System.out.println("Books added in Library sucessfully");
    }
    public static void displayBooks()
    {
        for(Library i : booklist)
        {
            System.out.println(i.toString());
        }
    }
    public static void displayInforwardOrder()
    {
        Iterator<Library>i=booklist.iterator();
        while(i.hasNext())
        {
            //Library l=i.next();
            System.out.println(i.next());
        }
    }
    public static void displayInBackwordOrder()
    {
        ListIterator<Library>i=booklist.listIterator(booklist.size());
        while(i.hasPrevious())
        {
            //Library l=i.next();
            System.out.println(i.previous());
        }
    }
    public static Library removeBookByIndex(int id)
    {
        Library li=new Library();
        li.setIndex(id);
        if(booklist.contains(li))
        {
            booklist.remove(li);
            System.out.println("Book removed from Library");
        }
        return li;
    }
    public static int menuList()
    {
        int choice;
        System.out.println("0.Exit");
        System.out.println("1.Add a new books in the list");
        System.out.println("2.Display all books");
        System.out.println("3.Display all books in forward order");
        System.out.println("4.Display all books in reverse order");
        System.out.println("5.Delete a book at given index");
        System.out.print("Enter Your choice - ");
        choice=sc.nextInt();
        return choice;

    }
    public static void main(String[] args) {
        int choice;
        int [] index=new int[1];
        while((choice=menuList())!=0)
        {
            switch (choice) {
                case 1:
                    {
                        booklist.clear();
                        Library [] arr=getBooks();
                        addBooks(arr);
                        break;
                    }
                case 2 :
                {
                    displayBooks();
                    break;
                }
                case 3:
                {
                    displayInforwardOrder();
                    break;
                }
                case 4:
                {
                    displayInBackwordOrder();
                    break;
                }
                case 5 :
                {
                    System.out.println("Enter the index for u want to remove the book");
                    index[0]=sc.nextInt();
                    removeBookByIndex(index[0]);
                    break;
                }
                default:
                System.out.println("You have entered wrong choice ");
                    break;
            }
        }
    }
}
