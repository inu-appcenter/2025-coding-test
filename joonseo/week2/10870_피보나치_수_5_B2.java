import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 10870_피보나치_수_5_B2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.print(fibonacci(n));
    }

    public static int fibonacci(int n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;

        return  fibonacci(n-1)+fibonacci(n-2);
    }
}
