package basics01;

import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) {

// Q1 : positive or negative
        //System.out.println("enter number :");
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        if (a > 0)
//            System.out.println("Positive");
//        else if(a < 0)
//            System.out.println("Negative");
//        else
//            System.out.println("zero");


        int  length;
        System.out.println("enter the length:");
        length = sc.nextInt();
        int breadth;
        System.out.println("Enter the breadth:");
        breadth = sc.nextInt();

        if(length == breadth)
            System.out.println("it is rectangle");
        else
            System.out.println("not rectangle");









    }


}
