package project;
import java.util.*;
public class rock_scissor_paper_game {
    public static void main(String[]args) {
        System.out.println("0:Rock\n1:Scissors\n2:Paper");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int i = 0;
        int user_score = 0;
        int comp_score = 0;
        while (i <= 4){
            System.out.println("Enter the number for your weapon:");
            int user_turn = sc.nextInt();
            int comp_turn = r.nextInt(3);
            System.out.println("Your weapon is:");
            switch (user_turn) {
                case 0:
                    System.out.println("Rock");
                    break;
                case 1:
                    System.out.println("Scissors");
                    break;
                case 2:
                    System.out.println("Paper");
                    break;
            }
            System.out.println("Computer's weapon is:");
            switch (comp_turn) {
                case 0:
                    System.out.println("Rock");
                    break;
                case 1:
                    System.out.println("Scissors");
                    break;
                case 2:
                    System.out.println("Paper");
                    break;
            }
            if (user_turn == 0 && comp_turn == 1) {
                System.out.println("YAHOO!!! YOU WON THIS ROUND");
                user_score++;
            } else if (user_turn == 0 && comp_turn == 2) {
                System.out.println("OH NO!!! YOU LOSE THIS ROUND");
                comp_score++;
            } else if (user_turn == 1 && comp_turn == 0) {
                System.out.println("OH NO!!! YOU LOSE THIS ROUND");
                comp_score++;
            } else if (user_turn == 1 && comp_turn == 2) {
                System.out.println("YAHOO!!! YOU WON THIS ROUND");
                user_score++;
            } else if (user_turn == 2 && comp_turn == 0) {
                System.out.println("YAHOO!!! YOU WON THIS ROUND");
                user_score++;
            } else if (user_turn == 2 && comp_turn == 1) {
                System.out.println("OH NO!!! YOU LOSE THIS ROUND");
                comp_score++;
            } else if (user_turn == 0 && comp_turn==0 || user_turn == 1 && comp_turn==1 || user_turn == 2 && comp_turn==2) {
                System.out.println("NO RESULT IN THIS ROUND");
                comp_score++;
                user_score++;
            }i++;
        }
        if (comp_score < user_score) {
            System.out.println("YOU HAVE WON THE ULTIMATE GAME OF ROCK-PAPER-SCISSORS GAME");
        } else if (comp_score > user_score) {
            System.out.println("THE COMPUTER HAS GOT THE BETTER OF YOU!!");
        } else {
            System.out.println("MEXICAN STANDOFF");
        }
    }
}
