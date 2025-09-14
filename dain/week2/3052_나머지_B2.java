import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class 3052_나머지_B2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i<10; i++) {
            h.add(Integer.parseInt(br.readLine())%42);
        }
        br.close();

        System.out.print(h.size());
    }
}