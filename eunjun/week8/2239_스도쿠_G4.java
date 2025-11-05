import java.io.*;

public class 2239_스도쿠_G4 {
    static int[][] board = new int[9][9];
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean solved = false; // 정답을 찾으면 탐색 중단용

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받기
        for (int i = 0; i < 9; i++) {
            String line = br.readLine();
            for (int j = 0; j < 9; j++) {
                board[i][j] = line.charAt(j) - '0';
            }
        }

        solve(0, 0); // (0,0)부터 시작

        bw.flush();
        bw.close();
        br.close();
    }

    // 스도쿠 백트래킹
    static void solve(int row, int col) throws IOException {
        if (row == 9) { // 9행까지 다 채우면 종료
            printBoard();
            solved = true;
            return;
        }

        // 다음 위치 계산
        int nextRow = (col == 8) ? row + 1 : row;
        int nextCol = (col + 1) % 9;

        if (board[row][col] != 0) {
            // 이미 채워진 칸이면 다음 칸으로
            solve(nextRow, nextCol);
        } else {
            for (int num = 1; num <= 9; num++) {
                if (isValid(row, col, num)) {
                    board[row][col] = num;
                    solve(nextRow, nextCol);
                    if (solved) return; // 정답 찾았으면 더 이상 탐색하지 않음
                    board[row][col] = 0; // 되돌리기
                }
            }
        }
    }

    // 현재 (row, col)에 num을 넣어도 되는지 검사
    static boolean isValid(int row, int col, int num) {
        // 같은 행 검사
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) return false;
        }

        // 같은 열 검사
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) return false;
        }

        // 3x3 박스 검사
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }

        return true;
    }

    // 완성된 보드 출력
    static void printBoard() throws IOException {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                bw.write(String.valueOf(board[i][j]));
            }
            bw.newLine();
        }
    }
}
