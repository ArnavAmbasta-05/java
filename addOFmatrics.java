package arrays;
import java.util.*;
public class addOFmatrics {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the Matrics A:");
        int [][] a = new int[2][3];
        int [][]b= new int[2][3];
        for (int i =0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("The Matrics A is:");
        for (int i =0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.println(" ");
        }
        System.out.println("Enter the elements of the Matrics A:");
        for (int i =0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                b[i][j]= sc.nextInt();
            }
        }
        System.out.println("The Matrics B is:");
        for (int i =0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]);
                System.out.print("\t");
            }
            System.out.println(" ");
        }
        int [][]c= new int[2][3];
        for (int i =0;i<c.length;i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("The Summation of both the Matrics A and B are:");
        for (int i =0;i<c.length;i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j]);
                System.out.print("\t");
            }
            System.out.println(" ");
        }
    }
}
