import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[] nArray = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

            while (!isSorted(nArray)) {
                for (int i = 0; i < nArray.length - 1; i++) {
                    if (nArray[i] > nArray[i + 1]) {
                        // 두 수를 교환
                        int temp = nArray[i];
                        nArray[i] = nArray[i + 1];
                        nArray[i + 1] = temp;
                        // 교환 후 배열 출력
                        print(nArray);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 배열이 1, 2, 3, 4, 5 순서로 정렬되었는지 확인하는 메서드
    public static boolean isSorted(int[] nArray) {
        for (int i = 0; i < nArray.length - 1; i++) {
            if (nArray[i] > nArray[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void print(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }
}
