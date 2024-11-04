import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            printLine(N - i, 2 * i - 1);
        }

        for (int i = 1; i < N; i++) {
            printLine(i, 2 * (N - i) - 1);
        }
    }

    public static void printLine(int spaceCount, int starCount) {
        System.out.print(" ".repeat(spaceCount));
        System.out.print("*".repeat(starCount));
        System.out.print("\n");
    }
}