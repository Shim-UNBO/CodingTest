import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] reader = br.readLine().split(" ");
        int cnt = Integer.parseInt(reader[0]);
        if(cnt < 1 || cnt > 100000){
            return;
        }
        int leng = Integer.parseInt(reader[1]);
        if(leng < 1 || leng > 10){
            return;
        }
        String[] words = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            words[i] = br.readLine();
        }
        sortWords(words);
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));
        for (String word : uniqueWords) {
            if(word.length()>=leng){
                bw.write(word);
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        }
         private static void sortWords(String[] words) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
//            System.out.println(word+" -- "+frequencyMap.get(word));

        }
        Arrays.sort(words, (a, b) -> {
            int freqCompare = Integer.compare(frequencyMap.get(b), frequencyMap.get(a));
            if (freqCompare != 0) {
//                System.out.println("freqCompare: " + freqCompare);
//                System.out.println("a: " + a + ", b: " + b);
                return freqCompare;
            }

            int lengthCompare = Integer.compare(b.length(), a.length());
//            System.out.println("lengthCompare: " + lengthCompare);
//            System.out.println("a: " + a + ", b: " + b);
            if (lengthCompare != 0) {
                return lengthCompare;
            }
            return a.compareTo(b);
        });
    }
}

