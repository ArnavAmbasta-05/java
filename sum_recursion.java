package methods;
import java.util.*;
public class sum_recursion {
    static int sum(int n){
        if(n==1) return 1;
        else return n + sum(n-1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of integers:");
        int n = sc.nextInt();
        System.out.printf("The sum of %d integers is: %d ",n,sum(n));
    }
}
