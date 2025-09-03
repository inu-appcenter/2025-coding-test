import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 10872_팩토리얼_B4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.print(factorial(n));
    }

    public static int factorial(int n){
        if(n == 0 || n == 1)
            return 1;

        int result = n;

        while(n > 1){
            n = n -1;
            result = result * n;
        }

        return result;
    }
}
