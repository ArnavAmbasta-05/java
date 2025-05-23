package Operators_expressions;
import java.util.*;

public class kinematices_1d_eqn {
    public static void main(String[]args){
        System.out.println("Enter the initial velocity:");
        Scanner sc= new Scanner(System.in);
        int u= sc.nextInt();
        System.out.println("Enter the final velocity:");
        int v= sc.nextInt();
        System.out.println("Enter the displacement:");
        int s= sc.nextInt();
        System.out.println("Enter the acceleration:");
        int a= sc.nextInt();
        int res=(v*v-u*u)/(2*a*s);
        System.out.println("The result of this expression is: "+res);
    }
}
