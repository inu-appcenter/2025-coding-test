import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 1011_Fly_Me_To_The_Alpha_Centauri {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int distance = y - x;

            sb.append(findMinimumMovingCount(distance)).append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }

    public static int findMinimumMovingCount(int distance){
        int sqrt = (int) Math.sqrt(distance);

        if (distance == sqrt * sqrt){
            return 2 * sqrt - 1;
        } else if(distance <= sqrt * sqrt + sqrt){
            return 2 * sqrt;
        } else{
            return 2 * sqrt + 1;
        }
    }
}
