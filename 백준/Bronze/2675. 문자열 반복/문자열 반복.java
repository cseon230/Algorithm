import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String A = br.readLine();
            StringTokenizer st = new StringTokenizer(A);
            int R = Integer.parseInt(st.nextToken()); // 반복횟수
            String S = st.nextToken();
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < S.length(); j++) {
                for (int x = 0; x < R; x ++) {
                    stringBuilder.append(S.charAt(j));
                }
            }
            bw.write(String.valueOf(stringBuilder));
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}