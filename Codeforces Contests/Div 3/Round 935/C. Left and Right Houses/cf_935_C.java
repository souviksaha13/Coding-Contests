import java.util.*;

public class cf_935_C {

    static int souvik(int n, int[] arr) {
        double middle = Integer.MAX_VALUE;
        int ans = -1;
        int leftZero = 0, rightOne = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] != 0) rightOne++;
        }

        for(int i=0; i<=n; i++) {
            int leftCit = i;
            int rightCit = n-i;
            int leftMaj = leftCit/2;
            int rightMaj = rightCit/2;
            if(leftCit%2 != 0) leftMaj++;
            if(rightCit%2 != 0) rightMaj++;

            if(leftZero >= leftMaj && rightOne >= rightMaj) {
                if(middle > Math.abs((1.0 * n)/2 - i)) {
                    middle = Math.abs((1.0 * n)/2 - i);
                    ans = i;
                }
            }

            if(i==n) break;

            if(arr[i] == 0) leftZero++;
            else rightOne--;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            String str = sc.next();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = (int)(str.charAt(i)-'0');
            }

            System.out.println(souvik(n, arr));
        }

        sc.close();
    }
}
