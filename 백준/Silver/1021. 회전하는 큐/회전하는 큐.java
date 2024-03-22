import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input;
            int cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            ArrayList<Integer> arrayList = new ArrayList<>();
            int arraySize = Integer.parseInt(st.nextToken());
            int size = Integer.parseInt(st.nextToken());
            int[] pickNum = new int[size];
            for (int j=0; j < arraySize; j++){
                arrayList.add(j+1);
            }
            while ((input = br.readLine()) != null && !input.isEmpty()) {
                st = new StringTokenizer(input);
                for (int i = 0; i < pickNum.length; i++) {
                    pickNum[i] = Integer.parseInt(st.nextToken());
                }
            }
            
            for (int i = 0; i < pickNum.length; i++) {
                int n = pickNum[i];
                int index = arrayList.indexOf(n);
                int leftRotation = index;
                int rightRotation = arrayList.size() - index;
                if (index == 0){
                    arrayList.remove(index);
                }else {
                    if (leftRotation <= rightRotation) {
                        // 왼쪽으로 회전
                        cnt += leftRotation;
                        for (int j = 0; j < leftRotation; j++) {
                            Integer first = arrayList.remove(0);
                            arrayList.add(first);
                        }
                    } else {
                        //오른쪽으로 회전 
                        cnt += rightRotation;
                        for (int j = 0; j < rightRotation; j++) {
                            Integer last = arrayList.remove(arrayList.size() - 1);
                            arrayList.add(0, last);
                        }
                    }
                    arrayList.remove(0);
                }

            }
            System.out.println(cnt);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
