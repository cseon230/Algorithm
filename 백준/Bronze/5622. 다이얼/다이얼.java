import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // 각 알파벳을 다이얼 숫자로 매핑
            if (ch >= 'A' && ch <= 'C') num += 3;
            else if (ch >= 'D' && ch <= 'F') num += 4;
            else if (ch >= 'G' && ch <= 'I') num += 5;
            else if (ch >= 'J' && ch <= 'L') num += 6;
            else if (ch >= 'M' && ch <= 'O') num += 7;
            else if (ch >= 'P' && ch <= 'S') num += 8;
            else if (ch >= 'T' && ch <= 'V') num += 9;
            else if (ch >= 'W' && ch <= 'Z') num += 10;
        }

        bw.write(String.valueOf(num));
        bw.flush();
        br.close();
        bw.close();
    }
}