import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String star = "*";

        for (int i = 1; i <= N; i++) {
            String starRepeat = star.repeat((i*2)-1);
            for (int j = 0; j < N-i; j++) {
                System.out.print(" ");
            }
            System.out.print(starRepeat);
            System.out.print("\n");
        }

        for (int i = 1; i < N; i++) {
            String starRepeat = star.repeat((N*2)-(i*2)-1);
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print(starRepeat);
            System.out.print("\n");
        }

    }
}