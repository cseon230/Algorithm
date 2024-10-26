import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine(); // 더할 숫자의 개수
        String A = br.readLine();
        int sum = 0;

        if (Integer.parseInt(N) < A.length()) {
            return;
        } else {
            for (int i = 0; i < Integer.parseInt(N); i++) {
                int j = A.charAt(i) - '0';
                sum += j;
            }
        }

        bw.write(String.valueOf(sum));

        bw.close();
        br.close();
    }
}