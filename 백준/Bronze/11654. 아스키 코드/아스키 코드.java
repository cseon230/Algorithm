import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = br.readLine().charAt(0); // char 타입로 문자를 받아서 int 형 자료형에 넣으면 자동형변환이 된다.
        // 자동형변환은 작은 자료형에서 큰 자료형으로 변환될 떄 자동으로 변환되고
        // 큰 자료형에서 작은 자료형으로 바꿀 땐 강제형변환을 시켜줘야 한다. 즉, char형이 int형 보다 더 작은 자료형이라는 말이 된다

        bw.write(String.valueOf(num));

        bw.close();
        br.close();
    }
}