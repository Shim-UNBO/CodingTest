import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            int n = Integer.parseInt(br.readLine());
//            List<String> arrayList = new ArrayList<>();
            Set<String> distinctSet = new HashSet<>();
            int cnt = 0;
            for (int i=0; i<n; i++){
                String str = br.readLine();
                if (str.equals("ENTER")){
                    cnt += distinctSet.size();
                    distinctSet.clear();
                }else {
                    distinctSet.add(str);
//                    arrayList.add(str);
                }
            }
            cnt+=distinctSet.size();
//            List<String> distinctList = arrayList.stream()
//                    .distinct()
//                    .collect(Collectors.toList());

            bw.write(cnt+"");
            bw.flush();
            bw.close();
            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}