import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 1931_회의실배정_G5 {
    public static void main(String[] args) throws IOException {
        // 종료시간 가장 낮은거부터 채우고, 종료시간 낮은 거 중에서 시작시간 제일 빠른거로 끝까지 채우면 됨

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] discussion = new int[N][2];

        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            discussion[i][0] = Integer.parseInt(st.nextToken());
            discussion[i][1] = Integer.parseInt(st.nextToken());
        }

        // 종료시간 기준 정렬
        Arrays.sort(discussion,
                Comparator.comparingInt((int[] o) -> o[1])   // 두 번째 값 기준
                        .thenComparingInt(o -> o[0])       // 두 번째 값이 같으면 첫 번째 값 기준
        );

        int result = 0;
        int endTime = 0;
        for(int i = 0; i < N; i++){
            if (endTime <= discussion[i][0]){
                result++;
                endTime = discussion[i][1];
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }
}
