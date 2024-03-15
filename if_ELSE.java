import java.util.*;
import java.util.concurrent.locks.Condition;
/**
 * if_ELSE
 */
public class if_ELSE {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        boolean cond = (a==18);
        boolean cond2 = (a>=18);
        // if (cond){
        //     System.out.println("You can drive ");
        // }
        // else{
        //     System.out.println("cannot drive.");

            // Logical operator
        if(cond || cond2){
            System.out.println("Can Drive");;
        } 
        else{
            System.out.println("Cannot drive");;
        }
        }
    }

