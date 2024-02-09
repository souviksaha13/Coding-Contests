import java.util.Scanner;

class Solution {

    static int find(String str, int n) {
        int st = -1;
        int end = -1;

        for(int i=0; i<n; i++) {
            if(st == -1 && str.charAt(i) == 'B') st = i;
            if(str.charAt(i) == 'B') end = i;
        }

        return end-st+1;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            String str = sc.next();

            System.out.println(find(str, n));
        }

        sc.close();
    }
}