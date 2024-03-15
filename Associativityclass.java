import java.util.*;
class Associativity{
    public static void main(String[] args) {
        // int a = 6*5-34/2;
        // int b = 45*4-45/9;
        // /*Highest precedence goes to * and / */
        // System.out.println(a);
        // System.out.println(b);
        // // Quick Quiz 
        // int x = 20;
        // int y = 4;
        // int res = (x-y)/2;
        // System.out.println(res);
        // // int root  = (x*x-4*x*y);


        // // Resulting data type 
        // int d = 654+6;
        // byte z = 5;
        // short l = 6;
        // float o = 6.54f+z;
        // System.out.println(z+l);
        // // increment and decrement operators
        // int i = 56;
        // System.out.println(i++);
        // System.out.println(i);
        // System.out.println(++i);
        // // QUIZ 2 
        // int k = 7;
        // int m = ++k +8 ;
        // System.out.println(m);

        
        // Practice set
        // char grade = 'B';
        // grade = (char)(grade + 8);
        
        // System.out.println(grade);

        // Q2
        Scanner sc = new Scanner(System.in);
        // int b = 45;
        // int a = sc.nextInt();

        // System.out.println(b>a);
        // Q3
        int v = sc .nextInt();
        int u = sc.nextInt();
        int a = sc.nextInt();
        int s = sc.nextInt();
        int res = (v*v - u*u)/2*a*s;
        System.out.println(res);


    }
}