package oops_class;
import java.util.*;
public class square {
    public int area(int a){
        return a*a;
    }
    public int perimeter(int a){
        return 4*a;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        square sq = new square();
        System.out.print("Enter the side:");
        int a = sc.nextInt();
        System.out.print("Area:");
        System.out.println(sq.area(a));
        System.out.print("Perimeter:");
        System.out.println(sq.perimeter(a));
    }
}
