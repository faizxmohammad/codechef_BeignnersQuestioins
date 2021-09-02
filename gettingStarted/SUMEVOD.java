package gettingStarted;
import java.util.Scanner;


class SUMEVOD {
    public static void main(String[] args) {
        long n,currEven=2,currOdd=1,EvenSum=0,OddSum=0;
        Scanner scn = new Scanner(System.in);
        n = scn.nextLong();
        scn.close();
        for( int i = 1; i <= n; i++){
         EvenSum += currEven;
         currEven+=2;
         OddSum+=currOdd;
         currOdd+=2;
        }
        







        System.out.println(OddSum);


        System.out.println(EvenSum);
     

      
    }
}
