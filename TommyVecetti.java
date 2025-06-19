package oops_class;

public class TommyVecetti {
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing the enemy");
    }
    public static void main(String[]args){
        TommyVecetti game = new TommyVecetti();
        game.hit();
        game.run();
        game.fire();
    }
}
