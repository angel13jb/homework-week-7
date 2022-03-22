package week7;

import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input employee id,name and salary
        System.out.print("Enter the Employee ID:");
        int eid= sc.nextInt();
        System.out.print("Enter the Employee Name:");
        String name = sc.next();
        System.out.print("Enter the Basic Salary:");
        int salary= sc.nextInt();
        float hra=salary*0.1f;//hra is 10% of salary
        float da=salary*0.08f;//da is 8%of salary
        float ta=salary*0.09f;//ta is 9% of salary
        float pf=salary*0.2f;//pf is 2% of salary
        float gr=salary+hra+da+ta+pf;//gross salary

        //payslip print in below format
        System.out.println("|------------------------------------------|");
        System.out.println("|              Salary Slip                 |");
        System.out.println("|__________________________________________|");
        System.out.println("|    Employee ID   : "+eid+"               |");
        System.out.println("|    Employee Name : "+name+"              |");
        System.out.println("|__________________________________________|");
        System.out.println("|    Basic Salary  : "+salary+"            |");
        System.out.println("|    HRA 10%       : "+hra+"               |");
        System.out.println("|    TA 8%         : "+ta+"                |");
        System.out.println("|    DA 9%         : "+da+"                |");
        System.out.println("|    PF-20%        : "+pf+"                |");
        System.out.println("|__________________________________________|");
        System.out.println("|    Gross Salary  : "+gr+"                |");
        System.out.println("|__________________________________________|");




    }

}
