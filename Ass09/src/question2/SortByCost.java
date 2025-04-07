package question2;

import java.util.Comparator;

public class SortByCost implements Comparator<Project> {
    public int compare(Project p , Project p1)
    {
        return (int) (p.getProjectCost()-p1.getProjectCost());
    }
}
