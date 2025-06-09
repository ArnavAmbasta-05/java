package methods;
import java.util.*;
public class inverted_right_handed_star_methods {
    static void pattern(int n){
        for(int i = n;i>=0;i--){
            for (int j = 0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[]args){
        System.out.println("Enter the no. of the rows:");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        pattern(n);
    }
}

