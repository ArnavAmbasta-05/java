package arrays;
import java.util.*;
public class reverseARRAY {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        int [] array = new int[5];
        for (int i =0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Reverse of Array:");
        for (int i=4;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}
