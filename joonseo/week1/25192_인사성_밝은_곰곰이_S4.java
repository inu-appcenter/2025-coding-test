import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class 25192_인사성_밝은_곰곰이 {

    private static final String ENTER = "ENTER";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        int result = 0;
        boolean isEmoticon = false;

        for(int i = 0; i < n; i++){

            String s = br.readLine();

            if(s.equals(ENTER) && !isEmoticon){
                // 이 이후에 각 사용자가 처음 보내는 채팅은 이모티콘임
                isEmoticon = true;
            }else if(!s.equals(ENTER) && isEmoticon){
                // 사용자의 닉네임을 중복되지 않게 추가
                set.add(s);
            }else if(!s.equals(ENTER) && !isEmoticon){
                // 일반 채팅인 경우
                continue;
            }else{
                // 새로운 사람이 들어온 경우
                result += set.size();
                set.clear();
            }

            if(i+1 == n)
                result += set.size();
        }

        System.out.print(result);
    }
}
