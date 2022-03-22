package week7;

import java.util.Scanner;

public class Program07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input sales id,name,amount and salary
        System.out.print("Enter the Sales ID:");
        int sid = sc.nextInt();
        System.out.print("Enter the seller's Name:");
        String name = sc.next();
        System.out.print("Enter the Sales Amount:");
        int amt = sc.nextInt();
        System.out.print("Enter the Basic Salary:");
        int salary = sc.nextInt();
        double com = 0;

        if (amt >= 50000) {
            com = salary * 0.35;//commision is 35% of salary amount
        } else if (amt >= 30000) {
            com = salary * 0.20;//commision is 20% of salary amount
        } else if (amt >= 20000) {
            com = salary * 0.1;//commision is 10%of salary amount
        } else if (amt >= 10000) {
            com = salary * 0.05;//commision is 5% of salary amount
        } else {
            com = salary * 0.02;//commision is 2% of salary amount
        }
        System.out.println("Your Commision is: "+com);
    }
}
