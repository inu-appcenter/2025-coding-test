import java.io.*;
import java.util.StringTokenizer;

public class 15649_N과 M(1)_S3 {
    static int N, M;
    static boolean[] visited;
    static int[] arr;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N];
        arr = new int[M];

        DFS(0);
        bw.flush();
        bw.close();
    }

    static void DFS(int depth) throws IOException {
        if (depth == M) { //
            for (int i = 0; i < M; i++) {
                bw.write(arr[i] + " ");
            }
            bw.newLine();
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                DFS(depth + 1);
                visited[i] = false;
            }
        }
    }
}
