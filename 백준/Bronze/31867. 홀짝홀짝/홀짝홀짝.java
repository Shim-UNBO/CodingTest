import java.io.*;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            bw.write(solve(n, str));
            bw.flush();
            bw.close();
            br.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static String solve(int n, String str) throws IOException {
        int odd = 0;
        int even = 0;
        for (int i = 0; i< n; i++){
            int j = Integer.parseInt(String.valueOf(str.charAt(i)));
            if ( j == 0 ){
                even++;
            }else if(j%2==0){
                even++;
            }else{
                odd++;
            }
        }
        if (odd == even){
            return ("-1");
        }else{
            return (odd > even ? "1" : "0");
        }
    }
}
