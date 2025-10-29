import java.io.*;
import java.util.StringTokenizer;


public class 10971_외판원 순회 2_S2 {
    static int N;
    static int[][] array;
    static boolean[] visited;
    static int result = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        array = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        TSP();
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }


    private static void TSP() {
        for (int start = 0; start < N; start++) {
            visited[start] = true;
            dfs(start, start, 0, 1);
            visited[start] = false;
        }
    }


    private static void dfs(int start, int current, int cost, int depth) {
        // 갈 수 없는 경우 제외, 순회했을 때 최솟값 갱신
        if (depth == N) {
            if (array[current][start] != 0) {
                result = Math.min(result, cost + array[current][start]);
            }
            return;
        }

        // 갈 수 없는 경우 제외, 방문했던 곳 제외를 만족하며 순회
        for (int next = 0; next < N; next++) {
            if (!visited[next] && array[current][next] != 0) {
                visited[next] = true;
                dfs(start, next, cost + array[current][next], depth + 1);
                visited[next] = false;
            }
        }
    }
}
