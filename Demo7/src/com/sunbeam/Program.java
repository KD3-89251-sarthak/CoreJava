package com.sunbeam;



import java.util.Arrays;

public class Program {
    public static void main(String []args)
    {
        Student [] arr=new Student[4];
        arr[0]=new Student(1,"kedar","Ichalkaranji",30.20);
        arr[1]=new Student();
        arr[2]=new Student(3,"Shubham","Kolhapur",30);
        arr[3]=new Student(4,"South","Ichalkaranji",40);
        Arrays.sort(arr,new SortLevel());
        for(Student i : arr)
        {
            System.out.println(i.toString());
        }
    }
    
}
