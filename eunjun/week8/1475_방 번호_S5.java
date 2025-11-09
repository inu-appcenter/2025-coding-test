import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String roomNumber = br.readLine();
        int[] count = new int[10]; 
        
        for (char c : roomNumber.toCharArray()) {
            int num = c - '0';
            count[num]++;
        }

        int sixNineCount = count[6] + count[9];
        count[6] = (sixNineCount + 1) / 2; 
        count[9] = 0; 

        int max = 0;
        for (int i = 0; i < 9; i++) { 
            if (count[i] > max) {
                max = count[i];
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }
}
