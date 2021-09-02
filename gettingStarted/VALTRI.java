package gettingStarted;
import java.util.Scanner;

//Raju and his trip

public class VALTRI {
    public static void main(String[] args) {
        int N;
        Scanner scn = new Scanner(System.in);
        N= scn.nextInt();
        scn.close();
        if(N%5 ==0 || N%6 ==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
