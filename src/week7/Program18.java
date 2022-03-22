package week7;


public class Program18 {

    // method for sum of elements in an array
    static int arr[] = {24, 63, 4, 55};//declare array value

    //return type static method
    static int sum() {
        int sum=0; // initialize sum
        int i;
    //using for loop statment
        for (i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;

    }

    public static void main(String[] args) {
        System.out.println("Sum of given array is " + sum());
    }

}

