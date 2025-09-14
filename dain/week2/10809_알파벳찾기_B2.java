import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 10809_알파벳찾기_B2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String str = br.readLine();
        br.close();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(arr[ch - 'a'] == -1) {	// 처음 위치
                arr[ch - 'a'] = i;
            }
        }

        for(int res : arr) {
            System.out.print(res + " ");
        }
    }
}