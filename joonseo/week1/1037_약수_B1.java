import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 1037_약수_B1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int s = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < s; i++)
            list.add(Integer.parseInt(st.nextToken()));

        list.sort(null);

        int size = list.size();
        int result;
        if(size % 2 == 0){
            //짝수개면
            result = list.get(0) * list.get(size - 1);
        }else{
            //홀수개면
            result = (int) Math.pow(list.get((size - 1) / 2), 2);
        }

        System.out.print(result);
    }
}
