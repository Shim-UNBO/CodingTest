import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] chess = new String[8];
            int result =0;
            for (int i = 0; i<chess.length; i++){
                chess[i] = br.readLine();
            }
            for (int j = 0; j<chess.length; j++){
                //하얀칸 시작 검사
                if(j%2==0){
                    //0 2 4 6
                    for (int i=0;i<8;i+=2){
                        if(chess[j].charAt(i)=='F'){
                            result++;
                        };
                    }
                }else {
                    //1 3 5 7
                    for(int i=1;i<8;i+=2){
                        if(chess[j].charAt(i)=='F'){
                            result++;
                        };
                    }
                }
            }
            System.out.println(result);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
