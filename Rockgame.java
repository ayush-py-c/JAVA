import java.util.random.*;
import java.util.Random;
import java.util.Scanner;
/**
 * Rockgame
 */
public class Rockgame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: For Rock");
        System.out.println("2: For Paper");
        System.out.println("3: Scissor");
        System.out.print("CHOOSE : ");
        int op = sc.nextInt();
        if (op==1) {
            System.out.println("You Have choosen Rock");
        }
        if (op==2) {
            System.out.println("You have choosen Paper");
        }
        if (op==3) {
            System.out.println("You have choosen Scissor");
        }
        Random pc = new Random();
        int b = pc.nextInt(1, 4);
        if (b==1) {
            System.out.println("pc Has choosen Rock");
        }
        if (b==2) {
            System.out.println("pc Has choosen Paper");
        }
        if (b==3) {
            System.out.println("pc Has choosen Scissor");
        }
        else if (op==1 & b==1) {
            System.out.println("Match Draw");
        }
        else if (op==2 & b==2) {
            System.out.println("Match Draw");
        }
        else if (op==3 & b==3) {
            System.out.println("Match Draw");
        }
        else if (op==1 & b==2) {
            System.out.println("pc won");
        }
        else if (op==1 & b==3) {
            System.out.println("You won");
        }
        else if (op==2 & b==1) {
            System.out.println("You won");
        }
        else if (op==2 & b==3) {
            System.out.println("PC won");
        }
        else if (op==3 & b==1) {
            System.out.println("PC won");
        }
        else if (op==3 & b==2) {
            System.out.println("You won");
        }
    }

}