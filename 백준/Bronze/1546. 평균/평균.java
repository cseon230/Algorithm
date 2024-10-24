import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int highGrade = 0;
        double sum = 0;
        for (int i = 0; i < N; i++) {
            int grade = sc.nextInt();
            arr[i] = grade;
            if (highGrade <= grade) {
                highGrade = grade;
            }
        }
        for (int i = 0; i < N; i++) {
            sum += (arr[i] / (double) highGrade * 100);
        }
        System.out.println(sum/N);
    }
}