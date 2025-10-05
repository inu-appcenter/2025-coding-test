import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 1550_16진수_B2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine(), 16);
        System.out.println(num);
        br.close();
    }
}
