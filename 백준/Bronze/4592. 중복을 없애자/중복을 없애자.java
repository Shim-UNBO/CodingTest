import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<int[]> allData = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line);
                int[] intArray = new int[st.countTokens()];
                int i = 0;
                while (st.hasMoreTokens()) {
                    int number = Integer.parseInt(st.nextToken());
                    if (number == 0) {
                        culcuData(allData);
                        return;
                    }
                    intArray[i++] = number;
                }
                allData.add(intArray);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void culcuData(ArrayList<int[]> allData) {
        for (int i = 0; i < allData.size(); i++) {
            int[] array = allData.get(i);
            for (int j = 1; j < array.length; j++) {
                if (j == 1 || array[j] != array[j - 1]) {
                    int num = array[j];
                    System.out.print(num + " ");
                }

            }
            System.out.print("$");
            System.out.println();
        }
    }
}
