package week7;


import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        //enter year and find if its leap year or not
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any year");//2007
        int year =sc.nextInt();
        //using ternary operator
        String result =year %4==0 ?"leap year":"not leap year";
        System.out.println(year + " is: "+result);//not leap year
    }
}
