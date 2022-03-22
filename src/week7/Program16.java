package week7;

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input any number and get output entered number is positive,negative or zero
        System.out.println("Enter any number ");
        int a=sc.nextInt();
        if(a>0){
            System.out.println("Number is Positive");// 4,positive
        }else if(a<0){
            System.out.println("Number is Negative");//-6,negative
        }else if(a==0){
            System.out.println("Number is Zero");//0,zero
        }








    }
}