import java.io.*;
import java.util.StringTokenizer;

public class 1987_알파벳_G4 {
    static int R, C;
    static boolean[] visited = new boolean[26];
    static char[][]board;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new char[R][C];

        for (int i = 0; i < R; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for (int j = 0; j < C; j++){
                board[i][j] = s.charAt(j);
            }
        }

        DFS(1, 0, 0);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }

    static void DFS(int depth, int x, int y){
        if (result < depth) result = depth;
        visited[board[y][x] - 65] = true;

        if (x > 0)
            if (!visited[board[y][x-1] - 65]) DFS(depth + 1, x - 1, y);

        if (x < C - 1)
            if (!visited[board[y][x+1] - 65]) DFS(depth + 1, x + 1, y);

        if (y > 0)
            if (!visited[board[y-1][x] - 65]) DFS(depth + 1, x, y - 1);

        if (y < R - 1)
            if (!visited[board[y+1][x] - 65]) DFS(depth + 1, x, y + 1);

        visited[board[y][x] - 65] = false;
    }
}
