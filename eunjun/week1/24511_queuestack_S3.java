import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 24511_queuestack_S3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] stackOrQueue = new int[N];
        Deque<Integer> queueStack = new ArrayDeque<>();


        //스택, 큐 여부 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            stackOrQueue[i] = Integer.parseInt(st.nextToken());
        }

        // 스택인 경우는 무시해도 됨, 큐인 경우만 고려 -> 큐일 때는 초기값을 push
        st = new StringTokenizer(br.readLine());
        Deque<Integer> forReverse = new ArrayDeque<>();

        // 큐스택에서 큐인 부분들의 요소 순서들을 뒤집기
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            if (stackOrQueue[i] == 0){
                forReverse.push(num);
            }
        }

        int size = forReverse.size();


        // 초기값 밀어넣기
        for(int i = 0; i < size; i++){
            queueStack.offer(forReverse.pop());
        }

        int M = Integer.parseInt(br.readLine());

        // 초기값부터 이후 입력받은 값까지 한칸씩 미뤄서 결과 출력
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            queueStack.offer(Integer.parseInt(st.nextToken()));
            bw.write(String.valueOf(queueStack.poll()));
            bw.write(" ");
        }

        bw.flush();
        bw.close();
    }
}
