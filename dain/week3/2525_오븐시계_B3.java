import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 2525_오븐시계_B3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int C = Integer.parseInt(br.readLine());
        br.close();

        A += C/60;
        B += C%60;

        if (B>=60) {
            A += 1;
            B -= 60;
        } if (A>=24) {
            A -= 24;
        }

        System.out.print(A + " " + B);
    }
}