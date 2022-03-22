package week7;

import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {
        //input student name,roll no,marks
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Student Name:");
        String name = sc.next();

        System.out.print("Enter the Roll No :");
        int roll = sc.nextInt();

        System.out.print("        Math : ");
        int math = sc.nextInt();
        if (math < 0 || math > 100) {
            System.out.println("Invalid Marks");//marks between 0to 100 else its invalid
        }

        System.out.print("        Science : ");
        int science = sc.nextInt();
        if (science < 0 || science > 100) {
            System.out.println("Invalid Marks");//mark should be between 0 to 100 or its invalid
        }

        System.out.print("        English  : ");
        int english = sc.nextInt();
        if (english < 0 || english > 100) {
            System.out.println("Invalid Marks");//marks should be betwwen 0 to 100
        }

        int total = math + science + english;//get total of marks
        double percentage = total * 100 / 300;//get percentage

        String result = "";
        String grade = "";

        if (percentage >= 35) {
            result = result + "pass";//percentage must be above 35 for pass
        } else {
            result = result + "fail";//if percentage below 35 than fail
        }

        if (percentage >= 80) {

            grade = grade + "Grade A+";
        } else if (percentage >= 60) {
            grade = grade + "Grade A";
        } else if (percentage >= 50) {
            grade = grade + "Grade B";
        } else if (percentage >= 35) {
            grade = grade + "Grade C";
        }
        //whole mark sheet display as below
        System.out.println("|------------------------------------------|");
        System.out.println("|              Mark Sheet                  |");
        System.out.println("|__________________________________________|");
        System.out.println("|    Name   : " + name + "                        |");
        System.out.println("|    Roll No: " + roll + "                            |");
        System.out.println("|__________________________________________|");
        System.out.println("|    Subject    : Marks                    |");
        System.out.println("|__________________________________________|");
        System.out.println("|    Math       : " + math + "                       |");
        System.out.println("|    Science    : " + science + "                       |");
        System.out.println("|    English    : " + english + "                       |");
        System.out.println("|__________________________________________|");
        System.out.println("|    Total      : " + total + "                      |");
        System.out.println("|__________________________________________|");
        System.out.println("|    Percentage : " + percentage + "%                    |");
        System.out.println("|    Result      : " + result + "                    |");
        System.out.println("|    Grade      : " + grade + "                 |");
        System.out.println("|__________________________________________|");


    }
}
