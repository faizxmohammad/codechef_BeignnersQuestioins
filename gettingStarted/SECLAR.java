
// Second Largest number between 3
package gettingStarted;

import java.util.Scanner;
class SECLAR {
    public static void main(String[] args) {
        int A,B,C;
        Scanner scn=new Scanner(System.in);
        A=scn.nextInt();
        B=scn.nextInt();
        C=scn.nextInt();
        scn.close();
        if(A>B && A<C || A>C && A<B){
            System.out.println(A);
        }
        else if(B>A && B<C || B<A && B>C){
                System.out.println(B);
            }
        
        else {
                System.out.println(C);
            }
        
      
        }
            
        
    }

