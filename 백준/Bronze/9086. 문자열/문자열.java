import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            String str = br.readLine();
            char firstCh = str.charAt(0);
            char lastCh = str.charAt(str.length()-1);
            bw.write(firstCh);
            bw.write(lastCh);
            bw.newLine();
        }

        // BufferedReader와 Scanner를 혼용해서 사용하면 안된다

        bw.close();
        br.close();
    }
}