package Variables_datatypes;
import java.util.*;

public class integer_check {
    public static void main(String[]args){
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        boolean a= sc.hasNextInt();
        System.out.println(a);
    }
}
