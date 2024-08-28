import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] str = br.readLine().split(" ");
            String n1 = str[0];
            String n2 = str[1];
            int n = n1.length() >= n2.length() ? n1.length() : n2.length();
            String formatString = String.format("%%0%dd", n);
            String formattedN1 = String.format(formatString, Integer.parseInt(n1));
            String formattedN2 = String.format(formatString, Integer.parseInt(n2));

            char[] arrayN1 = formattedN1.toCharArray();
            char[] arrayN2 = formattedN2.toCharArray();

            //123 2495
            //25118
            for (int i =0;i<n;i++){
                bw.write(Integer.parseInt(String.valueOf(arrayN1[i]))+Integer.parseInt(String.valueOf(arrayN2[i]))+"");
            }
//            for (char c : arrayN1) {
//                System.out.print(c);  // 00123
//            }
            bw.flush();
            bw.close();
            br.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
