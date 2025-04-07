package question1;
import java.util.Comparator;

public class SortByName implements Comparator<Student>{
    public int compare(Student s , Student s1)
    {
        return s.getName().compareTo(s1.getName());
    }
}
