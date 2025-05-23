package Variables_datatypes;
import java.util.*;

public class km_miles {
    public static void main(String[]args){
        System.out.println("Enter the distance in kilometer:");
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        double miles= 0.621371*km;
        System.out.println("The distance in miles is: "+miles);
    }
}
