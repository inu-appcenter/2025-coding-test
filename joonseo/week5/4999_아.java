import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 4999_아 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String jaeHwan = br.readLine();
        String doctor = br.readLine();

        if(jaeHwan.length() >= doctor.length()){
            System.out.print("go");
            return;
        }

        System.out.print("no");
    }
}
