import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 6810_ISBN_B4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] coef = {1,3};
        int[] isbn = {9,7,8,0,9,2,1,4,1,8,0,0,0};

        for (int i=0; i<3; i++) {
            isbn[i+10] = Integer.parseInt(br.readLine());
        }

        int sum = 0;

        for (int i=0; i< 13; i++) {
            sum += coef[i%2] * isbn[i];
        }

        System.out.println("The 1-3-sum is " + sum);
    }

}
