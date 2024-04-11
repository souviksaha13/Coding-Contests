import java.util.Scanner;

public class cf_937_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            int n = sc.nextInt();
            char[][] arr = new char[2*n][2*n];
            boolean hash = true;
            boolean hs = true;

            for (int i = 0; i < arr.length; i+=2) {
                if(hash) hs = true;
                else hs = false;
                for (int j = 0; j < arr.length; j+=2) {
                    if(hs) arr[i][j] = arr[i+1][j] = arr[i][j+1] = arr[i+1][j+1] = '#';
                    else arr[i][j] = arr[i+1][j] = arr[i][j+1] = arr[i+1][j+1] = '.';
                    hs = !hs;
                }
                hash = !hash;
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
