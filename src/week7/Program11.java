package week7;

public class Program11 {
    public static void main(String[] args) {
        //enter number between 1to100
        int i;
        System.out.println("Number divide by 3:");//if enter 9 result its divide by 3
        for (i=1;i<=100;i++){//using for loop
            if(i%3==0){
                System.out.println(i);
            }
        }
        System.out.println("Number divide by 5:");//if enter 10 result is divide by 5
        for(i=1;i<=100;i++) {//using for loop
            if (i % 5 == 0) {
                System.out.println(i);

            }
        }


    }
}
