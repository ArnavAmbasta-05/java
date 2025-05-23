package Variables_datatypes;
import java.util.*;
public class calculatecgpa {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Semester(1/2):");
        int sem= sc.nextInt();
        System.out.println("Enter the Subjects of this semester with credits:");
        String sub1= sc.next();
        int s1= sc.nextInt();
        String sub2= sc.next();
        int s2= sc.nextInt();
        String sub3= sc.next();
        int s3= sc.nextInt();
        String sub4= sc.next();
        int s4= sc.nextInt();
        String sub5= sc.next();
        int s5= sc.nextInt();
        int totalcredit= s1+s2+s3+s4+s5;
        float cgpa=totalcredit/13;
        System.out.println("The CGPA is:" +cgpa);
    }
}
