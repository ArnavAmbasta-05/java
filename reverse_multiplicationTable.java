package loops;
import java.util.*;
public class reverse_multiplicationTable {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose multiplication you want:");
        int n = sc.nextInt();
        System.out.println("Enter the number up-to which multiplication required:");
        int i = sc.nextInt();
        int mul=1;
        while (i>0) {
            mul = n * i;
            System.out.printf("%d * %d = %d\n",n,i,mul);
            i--;
        }
    }
}
