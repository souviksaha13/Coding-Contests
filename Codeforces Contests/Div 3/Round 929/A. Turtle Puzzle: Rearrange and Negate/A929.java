import java.util.Scanner;

public class A929 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int sum = 0;

            for(int i=0; i<n; i++) {
                int val = sc.nextInt();
                sum += Math.abs(val);
            }

            System.out.println(sum);
        }

        sc.close();
    }
}