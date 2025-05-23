package Operators_expressions;

public class encrypt_decrypt {
    public static void main(String[]args){
        char grade = 'A';
        grade =(char)(grade + 8);
        System.out.println(grade);
        //decrypt
        grade=(char)(grade-8);
        System.out.println(grade);
    }
}
