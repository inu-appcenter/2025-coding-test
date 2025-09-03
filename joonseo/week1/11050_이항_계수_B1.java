import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 11050_이항_계수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.print(combination(n, k));
    }

    public static int factorial(int n){
        if(n == 0 || n == 1)
            return 1;

        int result = n;

        while(n>1){
            n = n -1;
            result *= n;
        }

        return result;
    }

    public static int combination(int n, int k){
        return factorial(n)/(factorial(n-k)*factorial(k));
    }
}
