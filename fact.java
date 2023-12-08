import java.util.*;
public class fact {
    public static void main(String[] args) {
        int num;
        int fact=1;
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(int i=1;i<=num;i++){
            fact=fact*i;//  fact*=i

        }
        System.out.println("Factorial is:" + fact);
    }


}
