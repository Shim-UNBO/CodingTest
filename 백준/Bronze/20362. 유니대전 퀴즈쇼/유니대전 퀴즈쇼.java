import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] winner = br.readLine().split(" ");
            String winnerStr = winner[1];
            int n = Integer.parseInt(winner[0]);
            int peopleCnt = 0;
            int answerCnt = 0;
            String[][] coll = new String[n][2];
            for (int i = 0;i<n;i++){
                coll[i] = br.readLine().split(" ");
            }
            for (int i = 0; i< coll.length; i++){
                for (int j = 0; j<2; j++){
                    if (winnerStr.equals(coll[i][0])){
                        peopleCnt = i;
                    }
                }
            }
            if(peopleCnt != 0){
                String answer = coll[peopleCnt][1];
                for (int i = 0; i<peopleCnt; i++){
                    if (!answer.equals(coll[i][1])){
                        answerCnt++;
                    }
                }
                System.out.println(peopleCnt-answerCnt);
            }else{
                System.out.println(peopleCnt);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
