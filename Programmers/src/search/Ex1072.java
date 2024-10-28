package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1072 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());

        int z = (int) ((y * 100) / x);  // ÇöÀç ½Â·ü
        int result = -1;

        if (z >= 99) {  // ½Â·üÀÌ 99% ÀÌ»óÀÌ¸é º¯È­ ¾øÀ½
            result = -1;
        } else {
            long low = 0, high = x;
            while (low <= high) {
                long mid = (low + high) / 2;
                int newZ = (int) (((y + mid) * 100) / (x + mid));

                if (newZ > z) {
                    result = (int) mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        System.out.println(result);
    }
}