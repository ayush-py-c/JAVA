import java.util.Scanner;

class Practice2class{
    public static void main(String[] args) {
        // Question 1
        // int a =10;
        // if (a=11) {
        //     System.out.println("I am 11");
        // }
        // else{
        //     System.out.println("I am not 11");
        // }
        
        // Question 2 - Find wheather a student is pass or fail
        // 33% atleast for pass in each subj in total 40%
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Maths marks : ");
        // float a = sc.nextByte();
        // System.out.print("Enter Physics marks : ");
        // float b = sc.nextByte();
        // System.out.print("Enter Chemistry marks :");
        // float c = sc.nextByte();
        // float minmarks = (a+b+c)/3.0f;
        // System.out.println("Overall percentage is " + minmarks);
        // System.err.println(minmarks);
        // // %ge of each subject
        // if (minmarks>=40 && a>=33 && b>=33 && c>=33) {
        // // else if (a==33&b==33 &c==33) {
        //     System.out.println("PASSED");    
        //     // }
        // }
        // else{
        //     System.out.println("Failed");
        // }

        // Question 3 - Income tax calculator 
        Scanner sc = new Scanner(System.in);
        // float tax = 0;
        //  float income  = sc.nextInt();
        //  if (income<2.5f){
        //     tax = tax+ 0;
        // }
        // else if (income>2.5f && income < 5f) {
        //     tax = tax + 0.05f * (income - 2.5f);
        // } 
        // else if (income>5f && income < 10.0f) {
        //     tax = tax + 0.05f * (5.0f - 2.5f);
        //     tax = tax + 0.2f * (income - 5f);
        // }
        // else if (income > 10.0f) {
        //     tax = tax + 0.05f * (5.0f - 2.5f);
        //     tax = tax + 0.2f * (10.0f - 5f);
        //     tax = tax + 0.2f * (income - 10.0f);
        // }
        // System.out.println(tax);

        // int op = sc.nextInt();
        // switch (op) {
        //     case 1:
        //         System.out.println("MOnday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thrusday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("INVALID INPUT!");
        //         break;
        // }
        
        // WEATHER A YEAR IS LEAP YEAR OR NOT 
        // System.out.print("Enter the in the format(YYYY) : ");
        // int YY = sc.nextInt();
        // if (YY%4==0 && YY%100!=0 || YY%400==0) {
        //     System.out.println(+YY+" is a leap year");
        // }
        // else{
        //     System.out.println(+YY+" is not a leap year");
        // }

        // website name check
        System.out.print("Enter website URL : ");
        String web = sc.nextLine();
        if (web.endsWith(".com") ) {
            System.out.println("Commercial website!");
        }
        else if (web.endsWith(".org")) {
            System.out.println("Organization website!");
        }
        else if (web.endsWith(".in")) {
            System.out.println("Indian website");
        }
        
    }

}