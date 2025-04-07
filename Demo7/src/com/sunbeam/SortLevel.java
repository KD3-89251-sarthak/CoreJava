package com.sunbeam;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortLevel implements Comparator<Student> {
    @Override
    public int compare(Stream.Student o1, sunbeam.Student o2) {
        int diff = o1.getCity().compareTo(o2.getCity());
        if(diff==0)
        diff=Double.compare(o1.getMarks(), o2.getMarks());
        if(diff==0)
        diff = o1.getName().compareTo(o2.getName());
        return diff;
    }

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
