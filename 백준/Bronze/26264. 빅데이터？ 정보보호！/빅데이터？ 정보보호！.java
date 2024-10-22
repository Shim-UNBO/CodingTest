import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String secu = "security";
            String bigD = "bigdata";
            int sCnt = str.split(secu, -1).length - 1;
            int dCnt = str.split(bigD, -1).length - 1;
            if (sCnt == dCnt){
                System.out.println("bigdata? security!");
            }
            else {
                System.out.println(sCnt > dCnt ? "security!" : "bigdata?");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
