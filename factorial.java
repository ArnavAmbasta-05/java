package loops;
import java.util.*;
public class factorial {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for the factorial:");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1;i<=n;i++){
            fact *= i;
        }
        System.out.printf("The factorial of %d is %d",n,fact);
    }
}
