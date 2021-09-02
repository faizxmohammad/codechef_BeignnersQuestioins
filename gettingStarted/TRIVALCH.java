package gettingStarted;
import java.util.*;
public class TRIVALCH {
    public static void main(String[] args) {
        int x,y,z;
        String str1="YES";
        String str2="NO";
        Scanner scn = new Scanner(System.in);
        x=scn.nextInt();
        y=scn.nextInt();
        z=scn.nextInt();
        scn.close();
        if(x+y>z && y+x>z && x+z>y){
            System.out.println(str1);
        }
        else{
            System.out.println(str2);
        }


    }
}
