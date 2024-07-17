import java.util.Scanner;

public class Main {
    private static long swapCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // 병합 정렬과 Swap 횟수 계산
        mergeSort(array, 0, n - 1);

        // Swap 횟수 출력
        System.out.println(swapCount);

        scanner.close();
    }

    // 병합 정렬 함수
    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    // 병합 함수
    private static void merge(int[] array, int left, int mid, int right) {
        int[] leftArray = new int[mid - left + 1];
        int[] rightArray = new int[right - mid];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[left + i];
        }
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[mid + 1 + i];
        }

        int i = 0, j = 0, k = left;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
                swapCount += (mid + 1) - (left + i);
            }
        }

        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
    }
}