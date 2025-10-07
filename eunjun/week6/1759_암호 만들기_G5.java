import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 1759_암호 만들기_ G5 {
    static int L, C;
    static char[] alphabet;
    static char[] result;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        alphabet = new char[C];
        result = new char[L];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++){
            alphabet[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(alphabet);
        DFS(0, 0);

        bw.flush();
        bw.close();
    }

    static void DFS(int depth, int start) throws IOException {
        if (depth == L){
            // 모음이 하나라도 포함돼있는지, 자음이 2개 이상인지 확인
            int count_m = 0;
            int count_j = 0;
            for (int i = 0; i < L; i++){
                if (result[i] == 'a' || result[i] == 'e' || result[i] == 'i' || result[i] == 'o' || result[i] == 'u'){
                    count_m++;
                }
                else count_j++;
            }
            if (count_m != 0 && count_j >= 2){
                for (int i = 0; i < L; i++){
                    bw.write(result[i]);
                }
                bw.newLine();
            }
            return;
        }

        for (int i = start; i < C; i++){
            result[depth] = alphabet[i];
            DFS(depth + 1, i + 1);
        }
    }
}
