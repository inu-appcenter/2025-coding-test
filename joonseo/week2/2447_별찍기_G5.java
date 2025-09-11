import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 2447_별찍기_G5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            Arrays.fill(arr[i], 1);
        }

        recursiveStar(arr, n, 0, 0);

        printStar(arr, n);
    }

    private static void recursiveStar(int[][] arr, int n, int start, int end){

        // 종료 조건
        if (n == 1)
            return;

        // 가운데에 해당하는 부분 0으로 초기화 하기
        for(int i = 0; i < n/3; i++){
            for(int j = 0; j < n/3; j++){
                arr[start + n/3 + i][end + n/3 + j] = 0;
            }
        }

        // 열, 행 각각 3등분 해서 recursiveStar 호출하기
        recursiveStar(arr, n / 3, start, end);
        recursiveStar(arr, n / 3, start + (n / 3) * 1, end);
        recursiveStar(arr, n / 3, start + (n / 3) * 2, end);

        recursiveStar(arr, n/3, start , end + (n/3) * 1);
        // 가운데 생략(이미 0으로 설정)
        recursiveStar(arr, n/3, start + (n/3) * 2, end + (n/3) * 1);

        recursiveStar(arr, n/3, start, end + (n/3) * 2);
        recursiveStar(arr, n/3, start + (n/3) * 1, end + (n/3) * 2);
        recursiveStar(arr, n/3, start + (n/3) * 2, end + (n/3) * 2);
    }

    private static void printStar(int[][] arr, int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(arr[i][j] == 0){
                    sb.append(" ");
                }else{
                    sb.append("*");
                }
            }
            sb.append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}
