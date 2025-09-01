import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Queustack_24511 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> queueStack = new ArrayDeque<>();

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            if(st1.nextToken().equals("0"))
                queueStack.addLast(Integer.parseInt(st2.nextToken()));
            else{
                st2.nextToken();
            }
        }

        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        if(queueStack.isEmpty()){
            sb.append(br.readLine());
        }else{
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            for(int i = 0; i<m; i++){
                int item = Integer.parseInt(st3.nextToken());
                queueStack.addFirst(item);
                sb.append(queueStack.removeLast()).append(" ");
            }
            sb.setLength(sb.length()-1);
        }
        System.out.print(sb);
    }
}
