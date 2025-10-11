import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 15651_N과_M_3 {

    public static boolean[] visited;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // max num
        int m = Integer.parseInt(st.nextToken()); // depth

        visited = new boolean[n];
        arr = new int[m];

        backTracking(m, 0);
        sb.setLength(sb.length() - 1);
        System.out.print(sb);
    }

    public static void backTracking(int targetDepth, int currentDepth){
        if(currentDepth == targetDepth){
            for(int a : arr)
                sb.append(a).append(" ");
            sb.setLength(sb.length()-1);
            sb.append("\n");
            return;
        }

        for(int i = 0; i < visited.length; i++){
            visited[i] = true;
            arr[currentDepth] = i+1;
            backTracking(targetDepth, currentDepth + 1);
            visited[i] = false;
        }
    }
}
