import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 10808_알파벳개수_B4 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String str = br.readLine();

        for (int i=0; i<str.length();i++) {
        	char ch = str.charAt(i);
        	arr[ch-97]++;
        }
        for (int i=0; i<26; i++) {
        	System.out.print(arr[i]+ " ");
        }
        br.close();
    }
}
