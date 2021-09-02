package gettingStarted;
import java.util.*;

class FINDMELI {
    public static void main(String[] args)
    {
    Scanner scn = new Scanner(System.in);
    int n,k;
    int Contains,notContains;
    Contains=1;
    notContains=-1;
   
    n = scn.nextInt();
    k = scn.nextInt();
  
   ArrayList<Integer> list =new ArrayList<Integer>();


    for(int i = 0;i<=n;i++){
        list.add(scn.nextInt());
    }
   boolean ans = list.contains(k);
    if(ans){
        System.out.println(Contains);
    }
    else{
        System.out.println(notContains);
    }



    
    scn.close();
    }
}

