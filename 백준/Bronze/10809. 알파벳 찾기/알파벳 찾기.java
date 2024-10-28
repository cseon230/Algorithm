import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();

        int[] arr = new int[26];
        Arrays.fill(arr, -1); // arr 배열 -1로 초기화

        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                        'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        ArrayList<Character> alphaList = new ArrayList<>();

        for (char a : alpha) {
            alphaList.add(a);
        }

        for (int i=0; i<S.length(); i++) {
            char ch = S.charAt(i);
            int idx = alphaList.indexOf(ch);
            arr[idx] = S.indexOf(ch);
        }
        String result = Arrays.toString(arr).replace(",", "").replace("[", "").replace("]", "");

        bw.write(result);

        bw.close();
        br.close();
    }
}