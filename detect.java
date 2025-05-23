package strings;
import java.util.*;
public class detect {
    public static void main(String[]args){
        System.out.println("Enter a string:");
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        //double spaces
        System.out.println(str.indexOf("  "));
        //triple spaces
        System.out.println(str.indexOf("   "));
    }
}
