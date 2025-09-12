import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 하노이_탑_이동_순서_11729 {

    static StringBuilder sb = new StringBuilder();
    static int move = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        hanoi(n, 1, 2, 3);

        System.out.println(move);
        sb.setLength(sb.length()-1);
        System.out.print(sb.toString());
    }

    public static void hanoi(int size, int from, int via, int to){
        if(size == 1) {
            sb.append(from + " " + to + "\n");
            move++;
            return;
        }

        hanoi(size -1, from, to, via);

        sb.append(from + " " + to + "\n");
        move++;

        hanoi(size - 1, via, from, to);
    }
}
