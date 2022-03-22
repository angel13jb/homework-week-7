package week7;

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        //enter any character and out put is alphabet,digit or symbol
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value is:");
        char ch=sc.next().charAt(0);//need input in char
        if((ch>= 'a'&& ch<='z')||(ch>='A'&& ch<='Z')){
            System.out.println(ch +"is a Alphabet");//result is alphabet
        }else if(ch>='0' && ch<='9'){
            System.out.println(ch +"is a Digit");//digit
        }else{
            System.out.println(ch +"is a Symbol");//special charactor
        }
    }
}
