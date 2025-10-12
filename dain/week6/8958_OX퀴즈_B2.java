import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 8958_OX퀴즈_B2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;
        int score;
        int sum;
        int testN = Integer.parseInt(br.readLine());

        for (int i = 0; i < testN; i++) {
            sum = 0;
            score = 0;
            str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    score++;
                    sum += score;
                } else {
                    score = 0;
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}