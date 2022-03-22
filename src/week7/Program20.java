package week7;

public class Program20 {
    public static void main(String[] args) {
        //check specific value show in array
        //with linear search
        int a[]={10,20,30,40,50,60};//6
        int specific_v=60;
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(specific_v==a[i]){
                System.out.println("Specific value found at:"+i);//value showing at index number
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Specific value not found");
        }


    }
}
