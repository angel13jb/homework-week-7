package week7;

public class Program19 {
    public static void main(String[] args) {
        //average of array value
        //average =sum of value/length of number
        double[]arr={10,45,34,4,60};
        double total=0;
        for(int i=0;i< arr.length;i++){
            total=total+arr[i];
        }
        double average =total/arr.length;
        System.out.println("The average is:"+average);//30.6 average
    }
}
