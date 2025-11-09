import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 2010_플러그_B3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += Integer.parseInt(br.readLine());
        }

        br.close();

        total -= (n-1);
        System.out.print(total);
    }
}