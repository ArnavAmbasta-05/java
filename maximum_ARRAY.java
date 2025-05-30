package arrays;
import java.util.*;
public class maximum_ARRAY {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        int [] array = new int[5];
        for (int i =0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        int max=0;
        for (int i =0;i<5;i++){
            if(max<array[i]) max=array[i];
        }
        System.out.println("The maximum element is "+max);
    }
}
