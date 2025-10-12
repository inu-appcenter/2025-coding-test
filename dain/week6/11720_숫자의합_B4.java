import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 11720_숫자의합_B4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        String[] str = br.readLine().split("");

        for(int i=0; i<N; i++) {
            sum += Integer.parseInt(str[i]);
        }

        System.out.println(sum);
        br.close();
    }
}