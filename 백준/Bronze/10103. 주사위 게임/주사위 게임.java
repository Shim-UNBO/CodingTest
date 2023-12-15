import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        diceGame();
    }
    public static void diceGame(){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int changYoung = 100, sangDuck = 100;
            int round = 0;
            int changDice = 1, sangDice = 1;

//            System.out.print("라운드를 입력해주세요: ");
            String input = reader.readLine();
            round = Integer.parseInt(input);
            if (round < 1 || round > 15) {
//                System.out.println("라운드는 1 이상 15 이하의 값이어야 합니다.");
                return;
            }
            for (int i = 0; i < round; i++) {
//                System.out.println("=== Round " + (i + 1) + " ===");

                // 띄어쓰기로 분리된 두 숫자를 입력 받음
//                System.out.print("창영이와 상덕이 주사위: ");
                String[] diceInputs = reader.readLine().split(" ");

                // 입력이 제대로 이루어졌는지 확인
                if (diceInputs.length != 2) {
//                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                    i--; // 현재 라운드를 다시 실행하기 위해 인덱스를 감소
                    continue;
                }
                // 각 변수에 할당
                changDice = Integer.parseInt(diceInputs[0]);
                sangDice = Integer.parseInt(diceInputs[1]);

                // 범위 체크
                if (changDice < 1 || changDice > 6 || sangDice < 1 || sangDice > 6) {
//                    System.out.println("주사위는 1 이상 6 이하의 값이어야 합니다.");
                    return;
                }

                // 주사위 결과에 따른 상태 업데이트
                if (changDice > sangDice) {
                    sangDuck -= changDice;
                } else if (changDice < sangDice) {
                    changYoung -= sangDice;
                }
                // 무승부일 경우에는 아무 동작도 수행하지 않음
            }
            System.out.println(changYoung + "\n" + sangDuck);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}