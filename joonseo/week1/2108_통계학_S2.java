import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 2108_통계학_S2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
            list.add(Integer.parseInt(br.readLine()));
        list.sort(null);

        // 산술 평균
        int sum = 0;
        for(int x : list)
            sum += x;

        int mean = (int)Math.round((double)sum / list.size());

        System.out.println(mean);

        // 중앙값
        int median = list.get((list.size() - 1)/2);
        System.out.println(median);

        // 최빈값
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer x : list){
            if(!map.containsKey(x)){
                map.put(x, 1);
            }else{
                map.put(x, map.get(x) + 1);
            }
        }

        int frequency = 0;
        for(Integer x : map.values()){
            if(x>= frequency){
                frequency = x;
            }
        }

        List<Integer> keysWithMostFrequency = new ArrayList<>();
        for(Map.Entry<Integer, Integer> x : map.entrySet()){
            if(x.getValue() == frequency){
                keysWithMostFrequency.add(x.getKey());
            }
        }

        keysWithMostFrequency.sort(null);
        System.out.println(keysWithMostFrequency.size() == 1 ? keysWithMostFrequency.get(0) : keysWithMostFrequency.get(1));

        // 범위
        int range = list.get(list.size() - 1) - list.get(0);
        System.out.print(range);
    }
}
