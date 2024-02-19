import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    static void find(char trump, String[] str) {
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        List<Integer> h = new ArrayList<>();
        List<Integer> s = new ArrayList<>();
        List<Integer> trmp = new ArrayList<>();
        int tmpVal = 0, cval = 0, dval = 0, hval = 0, sval = 0;

        for(int i=0; i<str.length; i++) {
            String st = str[i];
            if(st.charAt(1) == 'C') {
                c.add((int)(st.charAt(0)-'0'));
                cval++;
            }
            else if(st.charAt(1) == 'D') {
                d.add((int)(st.charAt(0) - '0'));
                dval++;
            }
            else if(st.charAt(1) == 'H') {
                h.add((int)(st.charAt(0) - '0'));
                hval++;
            }
            else if(st.charAt(1) == 'S') {
                s.add((int)(st.charAt(0) - '0'));
                sval++;
            }
            if(st.charAt(1) == trump) {
                trmp.add((int)(st.charAt(0) - '0'));
                tmpVal++;
            }
        }

        if(trump == 'C') {
            c.clear();
            cval = 0;
        }
        else if(trump == 'D') {
            d.clear();
            dval = 0;
        }
        else if(trump == 'H') {
            h.clear();
            hval = 0;}
        else {
            s.clear();
            sval = 0;
        }

        if(cval%2 != 0) {
            if (tmpVal == 0) {
                System.out.println("IMPOSSIBLE");
                return;
            }
            tmpVal--;
        }

        if(dval%2 != 0) {
            if (tmpVal == 0) {
                System.out.println("IMPOSSIBLE");
                return;
            }
            tmpVal--;
        }

        if(hval%2 != 0) {
            if (tmpVal == 0) {
                System.out.println("IMPOSSIBLE");
                return;
            }
            tmpVal--;
        }

        if(sval%2 != 0) {
            if (tmpVal == 0) {
                System.out.println("IMPOSSIBLE");
                return;
            }
            tmpVal--;
        }

        if(tmpVal%2 != 0) {
            System.out.println("IMPOSSIBLE");
            return;
        }

        int tmpPtr = 0;

        Collections.sort(c);
        Collections.sort(d);
        Collections.sort(h);
        Collections.sort(s);
        Collections.sort(trmp);

        for (int i = 0; i < c.size(); i+=2) {
            if(i+1 == c.size()) {
                System.out.println(c.get(i) + "C" + " " + trmp.get(tmpPtr++) + trump);
            }
            else {
                System.out.println(c.get(i) + "C" + " " + c.get(i+1) + "C");
            }
        }

        for (int i = 0; i < d.size(); i+=2) {
            if(i+1 == d.size()) {
                System.out.println(d.get(i) + "D" + " " + trmp.get(tmpPtr++) + trump);
            }
            else {
                System.out.println(d.get(i) + "D" + " " + d.get(i+1) + "D");
            }
        }

        for (int i = 0; i < h.size(); i+=2) {
            if(i+1 == h.size()) {
                System.out.println(h.get(i) + "H" + " " + trmp.get(tmpPtr++) + trump);
            }
            else {
                System.out.println(h.get(i) + "H" + " " + h.get(i+1) + "H");
            }
        }

        for (int i = 0; i < s.size(); i+=2) {
            if(i+1 == s.size()) {
                System.out.println(s.get(i) + "S" + " " + trmp.get(tmpPtr++) + trump);
            }
            else {
                System.out.println(s.get(i) + "S" + " " + s.get(i+1) + "S");
            }
        }

        while(tmpPtr < trmp.size()) {
            String st = String.valueOf(trump);
            System.out.println(trmp.get(tmpPtr) + st + " " + trmp.get(tmpPtr+1) + st);
            tmpPtr += 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            char trump = sc.next().charAt(0);

            String[] str = new String[2*n];

            for(int i=0; i<str.length; i++) {
                str[i] = sc.next();
            }

            find(trump, str);
        }

        sc.close();
    }
}
