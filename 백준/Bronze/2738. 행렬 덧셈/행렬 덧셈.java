import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try {
            rowColCnt();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void rowColCnt() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(stringTokenizer.nextToken());
        int col = Integer.parseInt(stringTokenizer.nextToken());

        int[][] array = readArray(br, row, col);
        int[][] array2 = readArray(br, row, col);
        int[][] result = addArrays(array, array2, row, col);

        printArray(result, row, col);
    }

    private static int[][] readArray(BufferedReader br, int row, int col) throws IOException {
        int[][] array = new int[row][col];
        StringTokenizer stringTokenizer;
        for (int i = 0; i < row; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; j++) {
                if (stringTokenizer.hasMoreTokens()) {
                    array[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                }
            }
        }
        return array;
    }

    private static int[][] addArrays(int[][] array1, int[][] array2, int row, int col) {
        int[][] result = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return result;
    }

    private static void printArray(int[][] array, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}