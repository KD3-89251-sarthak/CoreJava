package com.app.fruits;


import java.util.Scanner;

public class Basket {

    static int menue() {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("0.Exit");
        System.out.println("1.Add mangno");
        System.out.println("2.Add Orange");
        System.out.println("3.Add Apple");
        System.out.println("4.Display names of all fruits");
        System.out.println("5.Dsiplay name , colour , weight for all fresh fruits");
        System.out.println("6.Dsiplay test of all stale fruits");
        System.out.println("7.Mark fruit as stale by index");
        //System.out.println("8.Mark fruit as stale or not ");
        System.out.println("8.Mark Sour fruits as stale");
        System.out.print("Enter your choice - ");
        choice = sc.nextInt();
        return choice;
    }

    public static void displayFreshFruits(Fruits[] arr, int index) {
        
        for(Fruits i : arr)
        {
            if(i!=null){
                if (i.isFresh) {
                    System.out.println(i.getName() + "\t");
                }
            }
            
        }

    }

    public static void displayDetailsOfFruits(Fruits[] arr) {
        int l = 1;
        for (Fruits i : arr) {
            if(i!=null)
            {
                System.out.println(l +" -> "+ i.toString() + "\n");
            l++;
            }
            
        }

    }

    public static void displayAllStealFruits(Fruits[] arr) {
        int o = 0;
        for (Fruits i : arr) {
            if (i != null) {
                if (false == i.isFresh()) {
                    System.out.println(i.toString() + "\n");
                    o++;
                }
            }
        }
        if (o == 0) {
            System.out.println("There is no any Steal fruit in the basket");
        }
    }

    public static void markFruitAsSteal(Fruits[] arr, int index) {
        int k = 0;
        if (index == 0) {
            System.out.println("Basket is empty (:)");
        }
        displayDetailsOfFruits(arr);
        System.out.println("Provide index for which You want to add as an steal fruit");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        if (k > index) {
            System.out.println("Entered index excedded than present no of fruits (: )");
        }
        for (int i = 0; i < index; i++) {
            if (k == 0) {
                arr[i].setFresh(false);
            }
            k--;
        }
    }

    public static void markSourFruitsAsSteal(Fruits[] arr) {
        int l = 0;
        for (Fruits i : arr) {
            if (i != null) {
                if (i instanceof Orange || i instanceof Apple) {
                    i.setFresh(false);
                    l++;
                }
            }
        }
        if(l>0)
        {
            System.out.println("Markes sour fruits to steal");
        }
        System.out.println("No sour fruits are present");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of fruits do u want to add - ");
        int size =sc.nextInt();
        Fruits[] arr = new Fruits[size];    //Declaration of array
        int choice;
        int index = 0;
        if (index < 5) {
            while ((choice = menue()) != 0) {

                switch (choice) {
                    case 1: {
                        arr[index] = new Apple();
                        arr[index].accepect();
                        index++;
                        break;
                    }
                    case 2: {
                        arr[index] = new Mango();
                        arr[index].accepect();
                        index++;
                        break;
                    }
                    case 3: {
                        arr[index] = new Orange();
                        arr[index].accepect();
                        index++;
                        break;
                    }
                    case 4: {
                        displayFreshFruits(arr, index);

                        break;
                    }
                    case 5: {
                        displayDetailsOfFruits(arr);
                        break;
                    }
                    case 6: {

                        displayAllStealFruits(arr);
                        break;
                    }
                    case 7: {
                        markFruitAsSteal(arr, index);
                        break;
                    }
                    case 8 :
                    {
                        markSourFruitsAsSteal(arr);
                        break;
                    }

                    default:
                        break;
                }
            }
        }
    }

}
