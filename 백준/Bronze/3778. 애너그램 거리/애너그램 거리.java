import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());
            String[] inputStrings = new String[n * 2];

            for (int i = 0; i < n * 2; i++) {
                inputStrings[i] = br.readLine();
            }

            int line = 0;
            for (int i = 1; i < inputStrings.length; i += 2) {
                String str1 = inputStrings[i - 1];
                String str2 = inputStrings[i];
                int diffCount = calculateDifference(str1, str2);

                line++;
                bw.write("Case #" + line + ": " + diffCount);
                bw.newLine();
            }
            bw.flush();
            bw.close();
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int calculateDifference(String str1, String str2) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count characters in str1
        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Subtract counts based on characters in str2
        for (char c : str2.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) - 1);
        }

        // Calculate the total number of unmatched characters
        int difference = 0;
        for (int count : charCountMap.values()) {
            difference += Math.abs(count);
        }

        return difference;
    }
}
