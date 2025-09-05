import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 20920_영단어_암기는_괴로워_S3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String word =  br.readLine();

            if(word.length() < m)
                continue;

            if(map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            }else{
                map.put(word, 1);
            }
        }

        Set<Integer> set = new HashSet<>(map.values());
        List<Integer> frequencies = new ArrayList<>(set);

        frequencies.sort(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(int frequency : frequencies){
            List<String> words = new ArrayList<>();
            for(Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == frequency) {
                    words.add(entry.getKey());
                }
            }

            words.sort(Comparator.comparing(String::length).reversed()
                    .thenComparing(String::compareTo));

            for(String word : words){
                sb.append(word).append("\n");
            }
        }

        sb.setLength(sb.length() - 1);
        System.out.print(sb);
    }
}
