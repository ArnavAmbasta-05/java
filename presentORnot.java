package arrays;
import java.util.*;
public class presentORnot {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        int [] array = new int[5];
        for (int i =0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Enter an integer:");
        int user=sc.nextInt();
        int c=0;
        int index=0;
        for (int i = 0 ;i<array.length;i++){
            if(array[i]==user){
                index=i;
                c=1;
                break;
            }
        }
        if(c==1) System.out.printf("The element %d is present in the array at the index %d", user, index);
        else System.out.printf("The element %d is not present in the array", user);
    }
}
