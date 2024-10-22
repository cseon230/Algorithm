import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = "Hello World!";
        bw.write(str);
        bw.flush();
        bw.close();
    }
}