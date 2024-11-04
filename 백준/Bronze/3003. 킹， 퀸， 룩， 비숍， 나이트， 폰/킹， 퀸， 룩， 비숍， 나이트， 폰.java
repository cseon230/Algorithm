import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 한 줄로 입력받아 공백으로 나누고 각 요소를 int로 변환하여 리스트에 저장
        List<Integer> intList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        // List<Integer>를 int[]로 변환
        int[] inputArray = intList.stream().mapToInt(Integer::intValue).toArray();

        int[] origin = new int[] {1, 1, 2, 2, 2, 8};

        int[] result = new int[] {0, 0, 0, 0, 0, 0};

        for (int i = 0; i < origin.length; i++) {
            result[i] = origin[i] - inputArray[i];
        }

        for (int i = 0; i < result.length; i++) {
            if (i == result.length - 1) {
                System.out.print(result[i]);
            } else {
                System.out.print(result[i] + " ");
            }
        }

    }
}