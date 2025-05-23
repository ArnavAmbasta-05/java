package Conditions;

import java.util.Scanner;

public class typeofWebsite {
    public static void main(String[]args){
        System.out.println("Enter the website name:");
        Scanner sc = new Scanner(System.in);
        String website= sc.nextLine();
        if(website.endsWith(".com")) {
            System.out.println("It is a commercial website");
        }else if (website.endsWith(".org")){
                System.out.println("It is an organisational website");
        }else if(website.endsWith(".in")){
            System.out.println("It is an Indian Website");
        }
    }
}
