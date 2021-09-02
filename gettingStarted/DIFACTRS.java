
package gettingStarted;
import java.util.Scanner;

public class DIFACTRS {

    public static void main(String[] args) {
        int N, count = 0;
        Scanner scn = new Scanner(System.in);
        N = scn.nextInt();
        scn.close();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
        }
        System.out.println("\n" + count);

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
                System.out.print(" " + i);

            }
        }

    }

}
