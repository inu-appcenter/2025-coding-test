import java.io.*;

public class 14196_거스름돈_S5{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        // 5원 동전 개수를 최대로 하고, 5원 동전 하나씩을 빼면서 처음 2원 동전과 함께 합이 N이 될 때를 구하면 됨.
        int coinFive = n / 5;
        int remain = n - 5 * coinFive;
        
        while(remain % 2 != 0 && coinFive > 0){
            coinFive--;
            remain += 5;
        }

        // 반복문을 끝까지 했음에도 5원과 2원 동전의 합이 N이 되지 않을 때 -1 출력
        if (remain % 2 != 0) {
            bw.write(String.valueOf(-1));
        } else {
            int coinTwo = remain / 2;
            int result = coinFive + coinTwo;

            bw.write(String.valueOf(result));
        }
        bw.flush();
        bw.close();
    }
}
