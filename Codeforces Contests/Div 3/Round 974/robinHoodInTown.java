// unsolved problem, needs to check the solution

import java.util.Arrays;
import java.util.Scanner;

public class robinHoodInTown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int xx=0; xx<t; xx++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long sum = 0l;
            int multiplier = 2*n;

            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt()*multiplier;
                sum += arr[i];
            }

            if(n<3) {
                System.out.println(-1);
                continue;
            }

            Arrays.sort(arr);
            int avg =(int)sum/n;
            // double avg =((1.0*sum)/n);
            
            if(arr[n/2] < avg/2) {
                System.out.println(0);
                continue;
            }
            else {
                int dif = arr[n/2]-(avg/2);
                // System.out.println(Math.ceil(dif*n*2));
                // System.out.println((int)Math.ceil(dif*n*2)+1);
                System.out.println(dif+1);
            }
            // System.out.println((int)(1.88));
        }

        sc.close();
    }
}
