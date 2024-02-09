import java.util.Scanner;

public class Solution {

    static String find(int[] arr, int n) {
        int[] freq = new int[26];
        char[] ans = new char[n];

        for(int i=0; i<ans.length; i++) {
            int val = arr[i];
            for(int j=0; j<26; j++) {
                if(freq[j] == val) {
                    ans[i] = (char)(j + 97);
                    freq[j]++;
                    break;
                }
            }
        }
        String word = new String(ans);
        return word;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int j=0; j<n; j++) {
                arr[j] = sc.nextInt();
            }

            System.out.println(find(arr, n));
        }

        sc.close();
    }    
}
