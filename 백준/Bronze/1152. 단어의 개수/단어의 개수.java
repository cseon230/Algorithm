import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();

        StringTokenizer st = new StringTokenizer(S);

        int n = 0;

        while (st.hasMoreTokens()) {
            st.nextToken();
            n += 1;
        }

        bw.write(String.valueOf(n));


        bw.close();
        br.close();
    }
}