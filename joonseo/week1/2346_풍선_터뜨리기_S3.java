import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 2346_풍선_터뜨리기_S3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<Element> deque = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 1; i <= n; i++){
            int value = Integer.parseInt(st.nextToken());
            deque.addLast(new Element(i, value));
        }

        StringBuilder sb = new StringBuilder();
        
        Element e = deque.removeFirst();
        for(int i = 0; i < n; i++){

            if (deque.isEmpty()){
                sb.append(e.index.toString()).append(" ");
                break;
            }

            sb.append(e.index.toString()).append(" ");

            if(e.value > 0){
                for(int j = 0; j < e.value-1; j++){
                    deque.addLast(deque.removeFirst());
                }
                e = deque.removeFirst();
            }else{
                for(int j = 0; j < (e.value * -1)-1; j++){
                    deque.addFirst(deque.removeLast());
                }
                e = deque.removeLast();
            }
        }

        sb.setLength(sb.length()-1);

        System.out.print(sb);
    }

    public static class Element{
        Integer index;
        Integer value;

        public Element(Integer index, Integer value){
            this.index = index;
            this.value = value;
        }
    }
}
