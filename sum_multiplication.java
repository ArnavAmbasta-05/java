package loops;
import java.util.*;
public class sum_multiplication {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose multiplication you want:");
        int n = sc.nextInt();
        System.out.println("Enter the number up-to which multiplication required:");
        int i = sc.nextInt();
        int mul=1,c=1,sum=0;
        while (c<=i){
            mul = n * c;
            sum+=mul;
            System.out.printf("%d * %d = %d\n",n,c,mul);
            c++;
        }
        System.out.printf("The Sum of the numbers occurring in the multiplication of %d is %d",n,sum);
    }
}
