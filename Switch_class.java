import java.util.*;
class Switch_class{
    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);
       int a;
       
       System.out.print("Enter the age : ");
       a= sc.nextInt(); 
    //    if (a>56) {
    //         System.out.println("You are experienced.");
    //    } 
    //    else if (a>46) {
    //         System.out.println("Semi-experienced");
    //    }
    //    else if (a>36) {
    //         System.out.println("not experienced ");
    //    }
    //    else{
    //         System.out.println("Get lost");
    //    }

    switch (a) {
        case 18 -> System.out.println("Adult");
            
        case 21 -> System.out.println("job");
        case 60 -> System.out.println("Retire");
        default-> System.out.println("Enjoy");
            
        }

    


    }

}