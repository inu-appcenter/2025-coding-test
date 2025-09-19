import java.io.*;
import java.util.StringTokenizer;

public class 14889_스타트와 링크_S1 {
    public static int N;
    public static int[][] abilities;
    public static int min = Integer.MAX_VALUE;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        abilities = new int[N][N];
        visited = new boolean[N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                abilities[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        DFS(0,0);
        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();

    }

    public static void DFS(int depth, int index){
        // 팀이 정해지면 최솟값 계산
        if(depth == N/2){
            compareMin();
            return;
        }

        for(int i = index; i < N; i++){
            visited[index] = true;
            DFS(depth+1, i+1);
            visited[index] = false;
        }
    }

    public static void compareMin(){
        int visitedTeamScore = 0;
        int nonVisitedTeamScore = 0;

        // 방문된 노드들의 합, 방문 안된 노드들의 합을 빼서 최솟값 갱신
        for(int i = 0; i < N - 1; i++){
            for (int j = i + 1; j < N; j++){
                if(visited[i] == true && visited[j] == true){
                    visitedTeamScore = visitedTeamScore + abilities[i][j] + abilities[j][i];
                }
                else if(visited[i] == false && visited[j] == false){
                    nonVisitedTeamScore = nonVisitedTeamScore + abilities[i][j] + abilities[j][i];
                }
            }
        }
        int result = Math.abs(visitedTeamScore - nonVisitedTeamScore);
        if (result < min){
            min = result;
        }
    }
}
