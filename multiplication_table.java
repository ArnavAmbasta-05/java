package loops;
import java.util.*;
public class multiplication_table {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose multiplication you want:");
        int n = sc.nextInt();
        System.out.println("Enter the number up-to which multiplication required:");
        int i = sc.nextInt();
        int mul=1,c=1;
        while (c<=i){
            mul = n * c;
            System.out.printf("%d * %d = %d\n",n,c,mul);
            c++;
        }
    }
}
