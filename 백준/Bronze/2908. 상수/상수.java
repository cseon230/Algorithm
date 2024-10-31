import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numbers = br.readLine().split(" "); // 한 줄 문자열을 공백으로 구분해서 리스트로 담기
        int A = Integer.parseInt(new StringBuilder(numbers[0]).reverse().toString()); // StringBuilder는 .reverse() 메서드를 제공함
        int B = Integer.parseInt(new StringBuilder(numbers[1]).reverse().toString());

        bw.write(String.valueOf(Math.max(A, B))); // 더 큰 수를 찾아서 출력하는 Math.max( ) 메서드 사용
        // Math.max() 메서드는 두 개의 값 비교만 지원하므로 2개 이상의 값을 비교하려면 Math.max() 메서드를 중첩해서 사용해야 한다.

        bw.close();
        br.close();
    }
}