import java.util.*;

public class Solution {
    static boolean isSashaWinner(int n, int[] arr, int m) {
        List<Integer> zeros = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            int el = arr[i];
            int zero = 0, dig = 0;

            while(el%10 == 0) {
                zero++;
                el /= 10;
            }

            while(el != 0) {
                dig++;
                el /= 10;
            }

            m -= dig;
            if(zero != 0) zeros.add(zero);
        }

        Collections.sort(zeros, (a,b) -> b-a);

        for (int i = 1; i < zeros.size(); i+=2) {
            m -= zeros.get(i);
        }

        return m < 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            if(isSashaWinner(n, arr, m)) System.out.println("Sasha");
            else System.out.println("Anna");
        }

        sc.close();
    }
}
