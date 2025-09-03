import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 1010_다리_놓기_S4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] dp = initDP(m,n);

            if(t-1 == i){
                sb.append(dp[m][n]);
            }else{
                sb.append(dp[m][n]).append("\n");
            }
        }
        System.out.print(sb);
    }

    public static int[][] initDP(int x, int y){
        int[][] dp = new int[x +1][y +1];

        for(int i = 0; i <= x; i++){
            for(int j = 0; j <= y; j++) {
                if (i < j){
                    dp[i][j] = 0;
                    continue;
               }
                if(j == 0) {
                    dp[i][j] = 1;
                    continue;
                }
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        return dp;
    }
}
