package gettingStarted;

import java.util.Scanner;

public class ANGTRICH {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long x,y,z;
        String str1 = "YES";
        String str2 = "NO";
        x = scn.nextLong();
        y = scn.nextLong();
        z = scn.nextLong();
        scn.close();
        if(x+y+z == 180 && x != 0 && y != 0 && z != 0){
            System.out.println(str1);
        }
        else{
            System.out.println(str2);
        }


    }
}
