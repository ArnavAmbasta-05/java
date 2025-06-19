package oops_class;
import java.util.*;
public class cellphone {
    public void callingfriend(String person){
        System.out.println("Calling "+person);
    }
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        cellphone call = new cellphone();
        System.out.print("Whom to call:");
        String person = sc.next();
        call.callingfriend(person);
        call.ring();
        call.vibrating();
    }
}
