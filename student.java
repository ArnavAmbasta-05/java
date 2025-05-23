package Conditions;
import java.util.*;
public class student {
    public static void main(String[]args){
        System.out.println("Enter the marks of the given subjects out of 100:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Subject1:");
        int m1 = sc.nextInt();
        System.out.println("Subject2:");
        int m2 = sc.nextInt();
        System.out.println("Subject3:");
        int m3 = sc.nextInt();
        double avg = (m1 + m2 + m3)*100/300;
        if (m1>33){
            System.out.println("Student pass in Subject1");
        }else{
            System.out.println("Student fail in Subject1");
        }
        if (m2>33){
            System.out.println("Student pass in Subject2");
        }else{
            System.out.println("Student fail in Subject2");
        }
        if (m3>33){
            System.out.println("Student pass in Subject3");
        }else{
            System.out.println("Student fail in Subject3");
        }
        if (avg>=40.0){
            System.out.println("Student Pass");
        }else{
            System.out.println("Student Fail");
        }
    }
}
