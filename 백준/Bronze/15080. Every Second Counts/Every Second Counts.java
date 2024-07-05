import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            // 입력 받기
            String startTimeStr = br.readLine();
            String endTimeStr = br.readLine();

            // 시간 파싱
            String[] startTime = startTimeStr.split(" : ");
            String[] endTime = endTimeStr.split(" : ");

            // 각 시간 값 추출
            int stHh = Integer.parseInt(startTime[0]);
            int stMm = Integer.parseInt(startTime[1]);
            int stSs = Integer.parseInt(startTime[2]);

            int enHh = Integer.parseInt(endTime[0]);
            int enMm = Integer.parseInt(endTime[1]);
            int enSs = Integer.parseInt(endTime[2]);

            // 시작 시간과 종료 시간을 초 단위로 변환
            int startSeconds = stHh * 3600 + stMm * 60 + stSs;
            int endSeconds = enHh * 3600 + enMm * 60 + enSs;

            // 경과 시간 계산 (종료 시간이 시작 시간보다 작을 경우 자정을 넘긴 경우)
            int elapsedSeconds;
            if (endSeconds < startSeconds) {
                elapsedSeconds = (endSeconds + 24 * 3600) - startSeconds;
            } else {
                elapsedSeconds = endSeconds - startSeconds;
            }

            // 결과 출력
            System.out.println(elapsedSeconds);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
