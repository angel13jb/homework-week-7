package week7;

import java.util.Scanner;

public class Program08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //enter char between AtoF and output is city name
        System.out.print("Enter the alphabet from A to F:");
        char city = sc.next().charAt(0);//using char variable
        if (city=='A') {
            System.out.println("Ahmedabad");
        } else if (city=='B') {
            System.out.println("Bombay");
        } else if (city=='C') {
            System.out.println("Calcatta");
        } else if (city=='D') {
            System.out.println("Delhi");
        } else if (city =='E') {
            System.out.println("England");
        } else if (city=='F') {
            System.out.println("Finland");
        } else {
            System.out.println("Invalid Entry");
        }
    }
}


