import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //bw.write(str.length()); // 이건 틀린 표현이다. BufferedWriter 는 문자열이나 문자를 출력하기 위한 메소드이기 때문에 정수형을 반환하는 .length()는 출력되지 않는다.
        bw.write(Integer.toString(str.length())); // 문자를 정수형으로 변환하여 출력하면 정상적으로 출력된다.

        bw.close();
        br.close();
    }
}