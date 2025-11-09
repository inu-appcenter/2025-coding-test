import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int length = 1;  
        int start = 1;   
        int result = 0;   

        while (start * 10 <= N) {
            result += (start * 9) * length; 
            start *= 10;  
            length++;
        }

        result += (N - start + 1) * length;

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
