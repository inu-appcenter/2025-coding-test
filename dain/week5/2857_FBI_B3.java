import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 2857_FBI_B3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        for(int i=0; i<5; i++) {
            String name = br.readLine();

            if(name.contains("FBI")) {
                System.out.print(i+1 + " ");
                count += 1;
            }
        }

        if(count ==0) {
            System.out.println("HE GOT AWAY!");
        }
        br.close();
    }

}
