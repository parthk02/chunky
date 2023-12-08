public class reverse {
    public static void main(String[] args) {
        int lastDigit;
        int n=6090;
        int rev=0;
        // while (n>0){
        //     lastDigit= n%10;
        //     System.out.print(lastDigit);
        //     // n=n/10;
        //     n/=10;
        // }
            while(n>0){
                lastDigit=n%10;
                rev = (rev*10)+lastDigit;
                n/=10;
            }
         System.out.print(rev);
            
    }
}
// if you have to revese any number than this is the logic which is firstly divide the first no.
//print its remainder than again divide until counter is less than 0 that is n>0;