import java.util.Scanner;

public class cf_937_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a<b && b<c) System.out.println("STAIR");
            else if(a<b && b>c) System.out.println("PEAK");
            else System.out.println("NONE");
        }

        sc.close();
    }
}
