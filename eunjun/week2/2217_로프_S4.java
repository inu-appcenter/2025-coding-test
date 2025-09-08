import java.io.*;
import java.util.Arrays;

public class 2217_로프_S4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] ropes = new int[N];

        for(int i = 0; i < N; i++){
            ropes[i] = Integer.parseInt(br.readLine());
        }

        // 로프 길이 정렬
        Arrays.sort(ropes);
        int max = 0;
        int length = ropes.length;

        // 정렬 후 길이가 가장 짧은 로프들을 하나하나 빼면서, 최대 중량 갱신
        for (int rope : ropes) {
            // 가장 짧은 로프 * 로프 개수 = 최대 중량
            if (rope * length > max) {
                max = rope * length;
            }
            length--;
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();

    }
}
