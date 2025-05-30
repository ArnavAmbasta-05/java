package arrays;
import java.util.*;
public class minimum_ARRAY {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        int [] array = new int[5];
        for (int i =0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        int min=array[0];
        for (int i =1;i<5;i++){
            if(min>array[i]) min=array[i];
        }
        System.out.println("The maximum element is "+min);
    }
}
