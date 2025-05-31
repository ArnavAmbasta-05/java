package methods;
import java.util.*;
public class multiplication_table_methods {
static int multi(int n,int x){
    int mul=1;
    for (int i=1;i<=x;i++){
        mul=n*i;
        System.out.printf("%d * %d = %d\n",n,i,mul);
    }
    return 0;
}
public static void main(String[]args){
    multiplication_table_methods obj = new multiplication_table_methods();
    System.out.println("Enter the value for multiplication:");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println("Enter how long table is:");
    int b = sc.nextInt();
    obj.multi(a,b);
}
}
