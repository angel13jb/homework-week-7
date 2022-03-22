package week7;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        //find enter number is even or odd
        Scanner sc=new Scanner(System.in);//import scanner
        System.out.println("Enter number");
        int number =sc.nextInt();
        //using ternary operator
        String result =number % 2==0? "Even" : "Odd";
        System.out.println(number +" is :" +result);//odd or even





    }


}
