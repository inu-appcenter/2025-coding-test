import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 붙임성_좋은_총총이_26069 {

    private static final String MASTER = "ChongChong";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashSet<String> dancingMachine = new HashSet<>();

        dancingMachine.add(MASTER);

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name1 = st.nextToken();
            String name2 = st.nextToken();

            if(name1.equals(MASTER)){
                dancingMachine.add(name2);
            }

            if(name2.equals(MASTER)){
                dancingMachine.add(name1);
            }

            if(dancingMachine.contains(name1)){
                dancingMachine.add(name2);
            }else if(dancingMachine.contains(name2)){
                dancingMachine.add(name1);
            }
        }

        System.out.print(dancingMachine.size());
    }
}
