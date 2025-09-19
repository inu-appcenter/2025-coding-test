import java.io.*;

public class 9663_N-Queen_G4 {
    // 배열 인덱스는 행, 배열 요소값은 열
    public static int[] arr;
    public static int N;
    public static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());

        arr = new int[N];

        nQueen(0);
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

    // DFS, 조건에 안맞는 부분은 가지치기 -> 백트래킹
    public static void nQueen(int depth){
        // n-Queen 조건 충족
        if (depth == N){
            count++;
            return;
        }

        // 해당 위치가 조건에 맞다면 다음 행 탐색
        for(int i = 0; i < N; i++){
            arr[depth] = i;
            if(validateLocation(depth)){
                nQueen(depth + 1);
            }
        }
    }

    public static boolean validateLocation(int row){
        for(int i = 0; i < row; i++){
            // 같은 열에 놓인 경우
            if(arr[row] == arr[i]){
                return false;
            }

            // 대각선 상에 놓인 경우
            else if(Math.abs(row - i) == Math.abs(arr[row] - arr[i])){
                return false;
            }
        }
        return true;
    }
}
