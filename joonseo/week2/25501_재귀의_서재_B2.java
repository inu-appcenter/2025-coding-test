import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 25501_재귀의_서재_B2 {

    private static int called;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            called = 0;
            String input = br.readLine();
            sb.append(isPalindrome(input)).append(" ").append(called).append("\n");
        }

        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }

    public static int recursion(String s, int l, int r){
        called++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}
