package arrays;
import java.util.*;
public class averagePHYSICSmarks {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float [] marks = new float[40];
        System.out.println("Enter the marks of all the student in the PHYSICS:");
        for (int i =0;i< marks.length;i++){
            marks[i]= sc.nextFloat();
        }
        float sum=0,avg;
        for (float element:marks){
            sum+=element;
        }
        avg=sum/40;
        System.out.println("The Average Physics of the class is:"+avg);
    }
}
