import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String A = br.readLine();
        StringBuilder sb = new StringBuilder(A); // StringBuilder는 reverse() 메서드를 제공한다.
        String[] strArr = sb.reverse().toString().split(" ");

        int[] intArr = new int[strArr.length];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        if (intArr[0] > intArr[1]) {
            bw.write(String.valueOf(intArr[0]));
        } else {
            bw.write(String.valueOf(intArr[1]));
        }

        bw.close();
        br.close();
    }
}