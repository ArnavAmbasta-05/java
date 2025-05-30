package arrays;
import java.util.*;
public class SortedORnot {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        int [] array = new int[5];
        for (int i =0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        boolean isSorted= true;
        for (int i = 0; i<array.length-1; i++) {
            if(array[i]>array[i+1]) {
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("It is a sorted array");
        }else{
            System.out.println("It is not a sorted array");
        }
    }
}
