package arrays;
import java.util.*;
public class sumofArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        float[] array = new float[5];
        for (int i =0;i<array.length;i++){
             array[i]= sc.nextFloat();
        }
        float sum = 0;
        for (float element: array) {
            sum += element;
        }
        System.out.println("Sum of the elements: "+sum);
    }
}
