package gettingStarted;

import java.util.Scanner;

 class ADDNATRL {
    public static void main(String[] args) {
        long N,SUM = 0;
        
        Scanner scn = new Scanner(System.in);
        N = scn.nextLong();
        for( int i = 1; i <= N ; i++){
            SUM += i;
        
        }
        System.out.println(SUM);
        scn.close();
    }
}
