package week7;

import java.util.Arrays;

public class Program17 {
    public static void main(String[] args) {
        //sort numberic and string array
        int[] data1={56,34,97,23,49,23,10,90};
        String[]data2={"sparrow","dog","cat","mouse","zebra","peacock"};
        //numberic value
        System.out.println("Original value:"+ Arrays.toString(data1));
        Arrays.sort(data1);
        System.out.println("Sorted value:"  +Arrays.toString(data1));//sorted in ascending order
        //sring value
        System.out.println("Original value:" + Arrays.toString(data2));
        Arrays.sort(data2);
        System.out.println("Sorted value:"  + Arrays.toString(data2));//sorted in ascending order





    }

}
