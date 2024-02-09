import java.util.Scanner;
import java.util.Stack;

public class Solution {

    static void nextDifferentElement(int[] arr, int[] ans) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        ans[n-1] = -1;
        st.push(n-1);

        for(int i=n-2; i>=0; i--) {
            while(!st.isEmpty() && arr[st.peek()] == arr[i])
                st.pop();
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(i);
        }

        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            
            int[] nextDiff = new int[n];
            nextDifferentElement(arr, nextDiff);

            int q = sc.nextInt();

            for (int j = 0; j < q; j++) {
                int l = sc.nextInt();
                int r = sc.nextInt();

                if(nextDiff[l-1] == -1) System.out.println(-1 + " " + -1);
                else if(nextDiff[l-1] < r) System.out.println(l + " " + (nextDiff[l-1]+1));
                else System.out.println(-1 + " " + -1);
            }
            System.out.println();
        }

        sc.close();
    }
}