import java.util.*;
public class pract1 {
    public static void main(String args[]){
        int a,b,c;
        float avg;
        System.out.println("Enter a:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter b:");
        b = sc.nextInt();
        System.out.println("Enter c:");
        c = sc.nextInt();
        avg=((a+b+c)/3);
        System.out.println("Average is:"+ avg);
        
    }
    
}
