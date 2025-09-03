import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class 3986_좋은단어_S4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String [] str = new String[N];
        int result = 0;

        // 입력
        for(int i = 0; i < N; i++){
            str[i] = br.readLine();
        }

        // 연산
        for (int i = 0; i < N; i++){ // 단어의 개수

            Deque<Character> stack = new ArrayDeque<>();
            for (int j = 0; j < str[i].length(); j++){
                // 스택의 top 요소와 문자가 같으면 pop, 다르면 push
                if (stack.isEmpty() || (stack.peek() != str[i].charAt(j))){
                    stack.push(str[i].charAt(j));
                }
                else{
                    stack.pop();
                }
            }
            // 연산이 끝난 후 스택이 비어있으면 바른단어
            if (stack.isEmpty()){
                result++;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
