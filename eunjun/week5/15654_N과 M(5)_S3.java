import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 15653_N과 M(5)_S3 {
    static int N, M;
    static int[] arr;
    static boolean[] visited;
    static int[] result;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        visited = new boolean[N];
        result = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        DFS(0);
        bw.flush();
        bw.close();
    }

    static void DFS(int depth) throws IOException{
        if (depth == M){
            for (int i = 0; i < M; i++){
                bw.write(result[i] + " ");
            }
            bw.newLine();
            return;
        }

        for (int i = 0; i < N; i++){
            if (!visited[i]) {
                result[depth] = arr[i];
                visited[i] = true;
                DFS(depth + 1);
                visited[i] = false;
            }
        }
    }
}
