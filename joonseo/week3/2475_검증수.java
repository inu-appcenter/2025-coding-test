import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 2475_검증수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        for(int i = 0; i < 5; i++){
            int n = Integer.parseInt(st.nextToken());
            sum += n * n;
        }

        System.out.print(sum%10);
    }
}
