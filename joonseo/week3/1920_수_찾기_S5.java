import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 1920_수_찾기_S5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> set = new HashSet<>();

        int n  = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            set.add(Integer.parseInt(st1.nextToken()));
        }

        int m =  Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<m; i++){
            sb.append(set.contains(Integer.parseInt(st2.nextToken()))?1:0).append("\n");
        }

        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}
