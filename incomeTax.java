package Conditions;
import java.util.*;
public class incomeTax {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income in Lakhs of the Employee:");
        float inc = sc.nextFloat();
        float tax=0;
        if(inc<2.5) {
            System.out.println("No tax to be paid");
        } else if (inc>=2.5 && inc<5.0) {
             tax = tax + 0.05f * (inc-2.5f);
            System.out.println("Tax to be paid: " + tax);
        }else if(inc>=5.0 && inc<10.0) {
            tax = tax + 0.05f * (5.0f-2.5f);
            tax =tax + 0.2f * (inc-5.0f);
            System.out.println("Tax to be paid: " + tax);
        }else{
            tax = tax + 0.05f * (5.0f-2.5f);
            tax =tax + 0.2f * (10.0f-5.0f);
            tax = 0.3f * (inc-10.0f);
            System.out.println("Tax to be paid: " + tax);
        }
    }
}
