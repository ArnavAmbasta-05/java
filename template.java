package strings;
import java.util.*;
public class template {
    public static void main(String[]args){
        System.out.println("Enter the receiver's name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.printf("Dear %s, thanks a lot",name);
    }
}