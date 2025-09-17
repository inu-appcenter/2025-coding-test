package week3;

import java.io.*;
import java.util.StringTokenizer;

public class 14888_연산자 끼워넣기_S1 {
    public static int max = Integer.MIN_VALUE;
    public static int min = Integer.MAX_VALUE;
    public static int N;
    public static int[] num;
    public static int[] operatorArr = new int[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        num = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++){
            operatorArr[i] = Integer.parseInt(st1.nextToken());
        }

        DFS(1, num[0]);

        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }


    public static void DFS(int depth, int result){
        // 수식 완성한 경우
        if(depth == N){
            if(result > max) max = result;
            if(result < min) min = result;
            return;
        }

        //각 연산자마다 DFS 실행
        for(int i = 0; i < 4; i++){
            //남은 연산자 개수가 0보다 큰 경우 DFS 실행
            if (operatorArr[i] > 0) {
                operatorArr[i]--;
                switch(i){
                    case 0: DFS(depth+1, result + num[depth]); break;
                    case 1: DFS(depth+1, result - num[depth]); break;
                    case 2: DFS(depth+1, result * num[depth]); break;
                    case 3: DFS(depth+1, result / num[depth]); break;
                }
                //같은 depth의 다른 연산들을 위해 연산자 개수 복구
                operatorArr[i]++;
            }
        }
    }
}
