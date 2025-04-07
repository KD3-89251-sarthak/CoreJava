package com.sunbeam;
/*Write a generic static method to find minimum from an array of Number */


import java.util.Scanner;

public class Question1 {
    public static <T extends Number> void minimumNumberFromArray(T [] arr)
    {
        T minimum = arr[0];
        System.out.println("Your entered values in the array --> \t ");
        for(T i : arr)
        {
            System.out.print("\t"+i.doubleValue());
            
            if(minimum.doubleValue() >i.doubleValue())
            {
                 minimum =i;
            }
        }
        //Arrays.sort(arr);
        System.out.println();
        System.out.println("Smallest number from given array is -->"+"( "+ minimum.doubleValue()+" )");
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size=0;
        System.out.print("Enter the size of an array --> ");
        size = sc.nextInt();
        Number[]arr= new Number[size];
        System.out.println("Enter the numbers in the array -->");
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextDouble();
        }
        minimumNumberFromArray(arr);

    }
}
