package basics01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// Q1 : Addition of number

        /*System.out.println("enter first number:");
        int num1 = sc.nextInt();

        System.out.println("enter second number:");
        int num2 = sc.nextInt();

        int sum = num1 +num2;

        System.out.println("addition is "+sum);*/

// Q2: Simple Interest
      /*  System.out.println("Enter principal amt:");
        float a = sc.nextFloat();

        System.out.println("enter interest:");
        float b = sc.nextFloat();

        System.out.println("enter time duration:");
        float c = sc.nextFloat();

        float si = (a * b * c)/100;

        System.out.println("Principal: " +a);
        System.out.println("interest: " +b);
        System.out.println("duration: " +c);

        System.out.println("Simple interest :"+si);*/

// Q3: read Character
        /*System.out.println("enter a string :");
        char ch = sc.next().charAt(0);
        System.out.println("character is :"+ch);
       char ch2 = sc.next().charAt(3);
       System.out.println("character is :"+ch2);

        char ch3 = sc.next().charAt(4);
        System.out.println("character is :"+ch3);*/

/*
       print name, roll-no

       String first_name = sc.next();
       String last_name = sc.next();
       int roll_num = sc.nextInt();
        System.out.println("Name:"+ first_name+" "+last_name);
        System.out.println("Roll_num:" + roll_num )*/

/*      swap

        System.out.println("enter first no");
        int x = sc.nextInt();
        System.out.println("enter second no");
        int y = sc.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x);
        System.out.println(y);
*/

     /*  sum of digit  */

      System.out.println("enter no");
        int x = sc.nextInt();
        int sum = 0;
        while(x > 0){
            sum = sum + x % 10;
            x = x / 10;
        }
         System.out.print("sum is "+ sum);
       
    }
}