import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 2562_최댓값_B3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int order = 1;

        for (int i = 1; i <= 9; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n > max) {
                max = n;
                order = i;
            }
        }
        System.out.print(max + "\n" + order);
        br.close();
    }
}
