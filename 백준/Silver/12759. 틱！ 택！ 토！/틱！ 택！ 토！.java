import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    private static char[][] board = new char[3][3];
    private static char currentPlayer; // 현재 플레이어 ('X' or 'O')

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


            Scanner scanner = new Scanner(System.in);

            // 보드 초기화
            initializeBoard();
//        2
//        1 3
//        1 1
//        3 1
//        2 2
//        3 3
//        2 3
//        3 2
//        1 2
//        2 1
            // 첫 번째 플레이어 선택
//            System.out.println("먼저 플레이할 플레이어 번호를 입력하세요 (1 또는 2):");
            int firstPlayer = scanner.nextInt();
            currentPlayer = (firstPlayer == 1) ? 'X' : 'O';

            // 9번의 턴 동안 플레이 진행
            for (int i = 0; i < 9; i++) {
//                System.out.println("플레이어 " + (currentPlayer == 'X' ? "1" : "2") + "의 차례입니다.");
//                printBoard();

                // 좌표 입력
                int row = scanner.nextInt() - 1;
                int col = scanner.nextInt() - 1;

                // 유효한 위치인지 확인하고, 말을 놓음
                if (isValidMove(row, col)) {
                    board[row][col] = currentPlayer;

                    // 승리 여부 확인
                    if (isWinner()) {
//                        printBoard();
                        bw.write(currentPlayer == 'X' ? "1"+"" : "2"+"");
//                        System.out.println("플레이어 " + (currentPlayer == 'X' ? "1" : "2") + "가 승리했습니다!");
                        bw.flush();
                        return;
                    }

                    // 플레이어 교체
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                } else {
//                    System.out.println("잘못된 위치입니다. 다시 입력해주세요.");
                    i--; // 잘못된 입력이면 턴을 다시 실행
                }
            }

            // 모든 턴이 끝났는데도 승자가 없으면 무승부
//            printBoard();
//        System.out.println("무승부입니다!");
            bw.write(0 + "");
            bw.flush();
            bw.close();
            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    // 보드 초기화
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // 보드 출력
    private static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 유효한 움직임인지 확인
    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    // 승리 조건 확인
    private static boolean isWinner() {
        // 가로, 세로, 대각선 확인
        return (checkRowCol(board[0][0], board[0][1], board[0][2]) ||  // 1행
                checkRowCol(board[1][0], board[1][1], board[1][2]) ||  // 2행
                checkRowCol(board[2][0], board[2][1], board[2][2]) ||  // 3행
                checkRowCol(board[0][0], board[1][0], board[2][0]) ||  // 1열
                checkRowCol(board[0][1], board[1][1], board[2][1]) ||  // 2열
                checkRowCol(board[0][2], board[1][2], board[2][2]) ||  // 3열
                checkRowCol(board[0][0], board[1][1], board[2][2]) ||  // 대각선 1
                checkRowCol(board[0][2], board[1][1], board[2][0]));   // 대각선 2
    }

    // 특정 행, 열, 대각선의 값이 모두 같고 빈 칸이 아닌지 확인
    private static boolean checkRowCol(char c1, char c2, char c3) {
        return (c1 != '-' && c1 == c2 && c2 == c3);
    }
}
