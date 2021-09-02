package gettingStarted;

// ODD numbers between two numbers.

import java.util.Scanner;

public class RNGEODD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int L,R;
        L = scn.nextInt();
        R = scn.nextInt();
        scn.close();
        for(int i=L;i<=R;i++){
            if(i%2 != 0){
                System.out.println(" "+i);
            }
        }

    }
}
