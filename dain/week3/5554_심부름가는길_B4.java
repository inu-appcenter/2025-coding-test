import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 5554_심부름가는길_B4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        br.close();

        int total = a+b+c+d;

        System.out.println(total/60);
        System.out.println(total%60);
    }
}