package loops;
import java.util.*;
public class sumofeven_numbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers of even numbers required:");
        int n = sc.nextInt();
        int sum=0;
        int i=1;
        int c=1;
        while(c<=n){
            if(i%2==0){
                sum = sum + i;
                c++;
            }
            i++;
        }
        System.out.printf("The sum of %d even numbers is %d",n,sum);
    }
}
