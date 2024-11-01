import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        Map<Integer, String> M = new HashMap<>();

//        M.put("", 1);
//        M.put("ABC", 2);
//        M.put("DEF", 3);
//        M.put("GHI", 4);
//        M.put("JKL", 5);
//        M.put("MNO", 6);
//        M.put("PQRS", 7);
//        M.put("TUV", 8);
//        M.put("WXYZ", 9);

        M.put(1, "");
        M.put(2, "ABC");
        M.put(3, "DEF");
        M.put(4, "GHI");
        M.put(5, "JKL");
        M.put(6, "MNO");
        M.put(7, "PQRS");
        M.put(8, "TUV");
        M.put(9, "WXYZ");

        int num = 0;

        // WA가 들어온다고 가정
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j <= M.size(); j++) {
                String ch = String.valueOf(str.charAt(i)); // W
                String keyValue = M.get(j);
                for (int x = 0; x < keyValue.length(); x++) {
                    if (String.valueOf(keyValue.charAt(x)).equals(ch)) {
                        num += j+1;
                    }
                }
            }
        }

        bw.write(String.valueOf(num));



        bw.close();
        br.close();
    }
}