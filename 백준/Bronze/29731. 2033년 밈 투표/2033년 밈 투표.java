import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] memm = {"Never gonna give you up","Never gonna let you down","Never gonna run around and desert you","Never gonna make you cry","Never gonna say goodbye"
                    ,"Never gonna tell a lie and hurt you","Never gonna stop"};
            int n = Integer.parseInt(br.readLine());
            String[] str = new String[n];
            boolean check = false;
            for (int i=0; i<n; i++){
                str[i] = br.readLine();
            }
            for (int i=0; i< str.length; i++){
                check = true;
                for (int j=0; j<memm.length; j++){
                    if(str[i].equals(memm[j])){
                        check = false;
                    }
                }
                if (check){
                    System.out.print("Yes");
                    break;
                }
            }
            if (!check){
                System.out.print("No");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
