import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 1009_분산처리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(getOrder(a,b)).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.print(sb);
    }

    public static int getOrder(int a, int b){
        if (b == 0) return 1;

        int lastDigit = a % 10;
        if (lastDigit == 0) return 10;

        List<Integer> cycle = new ArrayList<>();
        int current = lastDigit;

        do {
            cycle.add(current);
            current = (current * lastDigit) % 10;
        } while (!cycle.contains(current));

        int result = cycle.get((b - 1) % cycle.size());
        return result == 0 ? 10 : result;
    }
}
