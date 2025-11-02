import java.io.*;
import java.util.StringTokenizer;

public class 7568_덩치_S5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] height = new int[N];
        int[] weight = new int[N];
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            height[i] = Integer.parseInt(st.nextToken());
            weight[i] = Integer.parseInt(st.nextToken());
            result[i] = 1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (height[i] < height[j] && weight[i] < weight[j]) {
                    result[i]++;
                }
            }
        }
        
        for (int i = 0; i < N; i++) {
            bw.write(result[i] + " ");
        }
        
        bw.flush();
        bw.close();
    }
}
