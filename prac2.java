import java.util.Scanner;

public class prac2 {
    // public static void main(String args[]){   // This is practice question for if else statement
    //     // double temp=103.5;
    //     System.out.println("Enter the temperature:");
    //     Scanner sc = new Scanner(System.in);
    //     int temp = sc.nextInt();
    //     if(temp>100)
    //     {
    //         System.out.println("You have fever");
    //     }
    //     else{
    //         System.out.println("youre healthy");
    //     }
    // }
    public static void main(String[] args) {
            System.out.println("Enter Week day Number(1-7)");
            Scanner sc = new Scanner(System.in);
            int we = sc.nextInt();

            switch(we){
                case 1: 
                  System.out.println("Monday");
                  break;
                case 2: 
                  System.out.println("Tuesday");
                  break;
                case 3: 
                  System.out.println("Wednesday");
                  break;
                case 4: 
                  System.out.println("Thursday");
                  break;
                case 5: 
                  System.out.println("Friday");
                  break;
                case 6: 
                  System.out.println("Saturday");
                  break;
                case 7: 
                  System.out.println("Sunday");
                  break;
                default: 
                  System.out.println("invalid input!!");
                  break;
            }
    }
}
