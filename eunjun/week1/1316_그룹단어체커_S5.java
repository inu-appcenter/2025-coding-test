import java.io.*;

public class 1316_그룹단어체커_S5{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        String[] str = new String[N];

        // 입력
        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        // 연산
        for (int i = 0; i < N; i++) { // 단어의 개수
            int groupWord = 1;
            for (int j = 0; j < str[i].length() - 1; j++) { //단어의 길이만큼 반복
                for (int k = j + 1; k < str[i].length(); k++) {
                    // j번째 문자와 k번째 문자가 같고, k번째 문자와 k - 1번째 문자가 다르다면 그룹 단어 X
                    // (xyyxx -> 0번째 문자 x, 3번째 문자 x, 2번째 문자 y
                    if (str[i].charAt(j) == str[i].charAt(k) && str[i].charAt(k) != str[i].charAt(k - 1) ) {
                        groupWord = 0;
                        break;
                    }
                }
                if (groupWord == 0){
                    break;
                }
            }
            result += groupWord;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
