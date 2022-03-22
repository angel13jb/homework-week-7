package week7;

import java.util.Scanner;

public class Program04 {
    //create method with return type parameters
    public static boolean isLeapYear(int year) {
        boolean a =false;
        if (year >= 1 && year <= 9999) {
            a=true;
            if (year % 4 == 0 || year % 400 == 0&& year!=100) {//leap year calculation
                System.out.println("This year is leap year:" + year);// enter correct value
            } else {
                System.out.println("This year is not leap year");//
            }
        } else {
            System.out.println("Parameters not in the range");//not in range between 1to 9999
            System.out.println("-1");//output -1 for invalid value
        }
        return a;

    }
    //method with int type &parameters
    public static int getDaysInMonth(int month, int year) {

        //using switch method
        int day = 0;
        switch (month){
            case 1:
                day = 31;break;
            case 2:
                boolean x=isLeapYear(year);
                if(x==true){
                day = 29;break;}
                else{day=28;break;}
            case 3:
                day = 31;break;
            case 4:
                day = 30;break;
            case 5:
                day = 31;break;
            case 6:
                day = 30;break;
            case 7:
                day = 31;break;
            case 8:
                day = 31;break;
            case 9:
                day = 30;break;
            case 10:
                day = 31;break;
            case 11:
                day = 30;break;
            case 12:
                day = 31;break;
            default:
                System.out.println("-1");//output -1 for invalid value

        }
        return day;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");//2020
        int a=sc.nextInt();
        System.out.println(isLeapYear(a));//calling method in main method
        System.out.println("Enter the month:");//2
        int b=sc.nextInt();
        System.out.println("It has days"+getDaysInMonth(b,a));//its leap year and has 29 days

    }

}
