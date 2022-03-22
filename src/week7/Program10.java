package week7;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input two number and find addition,subtrac,division or multiplication by symbol
        System.out.println("Enter the first digit:");//20
        int a=sc.nextInt();
        System.out.println("Enter the second digit:");//10
        int b=sc.nextInt();
        System.out.println("Enter the symbol (+,-,*,/):");
        String c=sc.next();
        if(c.equals("+")){
            System.out.println("Addition:"+(a+b));//30
        }else if (c.equals("-")){
            System.out.println("Substraction:"+(a-b));//10
        }else if(c.equals("*")){
            System.out.println("Multiplication:"+(a*b));//200
        }else if(c.equals("/")){
            System.out.println("Division:"+(a/b));//2
        }



    }
}
