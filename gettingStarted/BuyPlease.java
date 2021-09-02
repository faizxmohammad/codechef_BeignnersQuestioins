
package gettingStarted;
import java.util.*;


public class BuyPlease{
    public static void main(String[] args) {
       int x,y,a,b,res;
     Scanner scn=new Scanner(System.in);
     a=scn.nextInt();
     b=scn.nextInt();
     x=scn.nextInt();
     y=scn.nextInt();
    x=x*a;
    y=y*b;
    res=x+y;
    System.out.println("The total amount is:"+res);
    scn.close();

    }
}