import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 24723_녹색거탑_B4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.print(greenTop(n));
    }

    public static int greenTop(int n){
        if(n == 1)
            return 2;

        return greenTop(n-1) * 2;
    }
}
