import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 1026_보물 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        b.sort(Integer::compareTo);

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            a.add(Integer.parseInt(st1.nextToken()));
            b.add(Integer.parseInt(st2.nextToken()));
        }

        int sum = 0;
        for(int i = 0; i<n; i++){
            // a 배열에서 최소값과 그 인덱스를 찾아냄
            int min = Collections.min(a);
            int minIndex = a.indexOf(min);

            // 내림차순으로 정렬된 b 배열에서 하나(가장 큰거)를 꺼냄
            int max = Collections.max(b);
            int maxIndex = b.indexOf(max);

            sum += min * max;

            a.remove(minIndex);
            b.remove(maxIndex);
        }

        System.out.print(sum);

    }
}
