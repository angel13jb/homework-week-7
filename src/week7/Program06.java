package week7;

import java.util.Scanner;

public class Program06 {
    public static void main(String[] args) {
        //input any number and find its odd or even
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number:");//enter 8
        int num = sc.nextInt();

        if (num%2==0) {
            System.out.print(num +" is Even Number");//result is even number
        } else {
            System.out.print(num +" is Odd Number");
        }


    }
}
