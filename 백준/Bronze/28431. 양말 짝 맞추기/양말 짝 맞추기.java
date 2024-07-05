import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        try {

            List<Integer> socksNum = new ArrayList<>();
            String line;

            while ((line = br.readLine()) != null && !line.isEmpty()) {
                socksNum.add(Integer.parseInt(line));
            }
            checkSocks(socksNum);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void checkSocks(List<Integer> list) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : list) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = countMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() % 2 == 0) { 
                iterator.remove(); 
            }
        }
        for (int num : countMap.keySet()) {
            System.out.println(num);
        }
    }
}

