package gettingStarted;


import java.util.Scanner;
class EXTRICHK {
    public static void main(String[] args) {
        long ab,bc,ca;
        Scanner sc = new Scanner(System.in);
        ab=sc.nextLong();
        bc=sc.nextLong();
        ca=sc.nextLong();
        sc.close();
        if(ab+bc>ca && ab+ca>bc && bc+ca>ab){
        if(ab==bc &&  bc == ca) {
            System.out.println(1);
        }
        else if( ab == bc|| bc == ca || ca == ab){
            System.out.println(2);
        }
        else{
            System.out.println(3);
        }
       
    }
    else{
        System.out.println(-1);
    }
        
    
    }
}
