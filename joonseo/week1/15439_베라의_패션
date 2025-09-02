import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 15439_베라의_패션 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        System.out.println(getPermutation(n));
    }

    public static long getPermutation(long n){
        if(n == 1) return 0;
        if(n == 2) return 2;
        
        return n * (n-1);
    }
}
