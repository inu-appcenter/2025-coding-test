import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 2744_대소문자_바꾸기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = bufferedReader.readLine();
        for(char c : input.toCharArray()){
            if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            } else if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        System.out.print(sb);
    }
}
