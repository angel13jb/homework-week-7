package week7;

import java.util.Scanner;

public class Program09 {
    public static void main(String[] args) {
        //enter alphabet to get city name
        Scanner sc = new Scanner(System.in);//import scanner
        System.out.println("Enter alphabet between A to F: ");//enter B
        String city = sc.next();//output is bristol
        switch (city) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Bristol");
                break;
            case "C":
                System.out.println("Cornwall");
                break;
            case "D":
                System.out.println("Dundee");
                break;
            case "E":
                System.out.println("Edinbrugh");
                break;
            case "F":
                System.out.println("Farbrough");
                break;
            default:
                System.out.println("Invalid Entry");//for invalid entry
        }









    }
}
