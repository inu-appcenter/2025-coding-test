import java.io.*;
import java.util.StringTokenizer;

public class 2961_도영이가 만든 맛있는 음식_S2 {
    static int N;
    static int[] sour;
    static int[] bitter;
    static int result = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        sour = new int[N];
        bitter = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sour[i] = Integer.parseInt(st.nextToken());
            bitter[i] = Integer.parseInt(st.nextToken());
        }

        // 각 재료를 시작점으로 DFS 탐색
        dfs(0, 1, 0);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    static void dfs(int start, int sourProd, int bitterSum) {
        if (bitterSum != 0) {
            result = Math.min(result, Math.abs(sourProd - bitterSum));
        }

        for (int i = start; i < N; i++) {
            dfs(i + 1, sourProd * sour[i], bitterSum + bitter[i]);
        }
    }
}
