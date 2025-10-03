import java.io.*;
import java.util.StringTokenizer;

public class 15651_N과 M(3)_S3 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];

        DFS(0);
        bw.flush();
        bw.close();
    }

    static void DFS(int depth) throws IOException {
        if (depth == M){
            for (int i = 0; i < M; i++){
                bw.write(arr[i] + " ");
            }
            bw.newLine();
            return;
        }
        for (int i = 1; i <= N; i++){
            arr[depth] = i;
            DFS(depth+1);
        }
    }

}
