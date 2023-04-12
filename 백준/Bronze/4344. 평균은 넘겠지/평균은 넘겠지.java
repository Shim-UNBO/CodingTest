import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
average();
    }
    public static void average(){
        Scanner sc = new Scanner(System.in);
        //그룹 갯수 설정
//        System.out.println("그룹갯수를 입력 해 주세요.");
        int group =sc.nextInt();
        int[] student = new int[group];
        int sum = 0;
        int count =0;
        ArrayList<Integer>[] score = new ArrayList[group];
        double[] aver = new double[group];
        double[] result = new double[group];
        DecimalFormat df = new DecimalFormat("0.000");

        //학생 수,학생 별 점수 설정
        for (int i=0;i<group;i++){
//            System.out.println((i+1)+"번째 그룹에 학생수를 입력 해 주세요.");
            if (sc.hasNextInt()) {
                student[i] = sc.nextInt();
                if (1 > student[i] || student[i] > 1000) {
//                    System.out.println("학생수는 1명 이상 1000명 이하의 정수로 입력해주세요");
                    break;
                }
            }
            score[i] = new ArrayList<Integer>();
            for(int j=0;j<student[i];j++){
//                System.out.println("학생수 : "+student[i] +" 명의 점수를 입력 해 주세요.");
                score[i].add(sc.nextInt());
            }
        }
        //평균 값 구하기
        for(int k=0;k<group;k++){
            for (int n=0;n<student[k];n++){
                sum += score[k].get(n);
            }
            aver[k] = sum / student[k];
//            System.out.println(df.format(aver));
            sum = 0;
        }
        //평균값을 넘는 학생들의 비율 구하기
        for(int j=0;j<group;j++) {
            for (int k = 0; k < student[j]; k++) {
                if (aver[j] < score[j].get(k)) {
                    count++;
                }
            }
            result[j] = (double) count / student[j] * 100;
            System.out.println(df.format(result[j])+"%");
            count = 0;
        }
    }
}

