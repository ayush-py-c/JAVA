import java.util.Scanner;
import java.util.jar.Attributes.Name;
class Practiceclass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = "New bie";
        
        // To convert it into lower case
        // System.out.println(str.toLowerCase());
        
        // To replace spaces with underscore
        // System.out.println(str.replaceAll(" ", "_")); 
        
        // to replce name with some name 
        String name = sc.nextLine();
        String letter = "Dear |name, Thanks a lot";
        letter = letter.replace("|name", name);
        System.out.println(letter);

        // To detect double and triple spaces in a string 
        int D = name.indexOf("  ");
        int T = name.indexOf("   ");
        System.out.println("No. of double spaces"+D+"No. of triple spaces "+T);
        
        // print letter using proper escape sequence 
        String l2 = "HI.\nMy Name is Ayush Raj.\nUndergraduated from KIIT UNIVERSITY.";
        System.out.println(l2);
    
    }
}