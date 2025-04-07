package question1;
import java.util.Comparator;

public class SortByMarks implements Comparator <Student>{
    public int compare(Student s , Student s1)
    {
        return  (int) (s.getMarks()-s1.getMarks());
    }   
}
