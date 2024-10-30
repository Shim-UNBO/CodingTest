import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int target = Integer.parseInt(br.readLine());  // 원하는 순서의 숫자
            int count = 0;
            int number = 666;

            while (true) {
                // 숫자에 "666"이 포함되어 있는지 확인
                if (String.valueOf(number).contains("666")) {
                    count++;  // "666"을 포함하는 숫자 발견 시 카운트 증가
                    if (count == target) {
                        System.out.print(number);  // 목표 순서에 도달하면 출력
                        break;
                    }
                }
                number++;  // 다음 숫자로 이동
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
