import java.io.*;
import java.util.*;

public class 15686_치킨배달_G5 {
    static int N, M;
    static int[][] city;
    static List<int[]> houses = new ArrayList<>();
    static List<int[]> chickens = new ArrayList<>();
    static int minCityChickenDist = Integer.MAX_VALUE;
    static boolean[] selected;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        city = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                city[i][j] = Integer.parseInt(st.nextToken());
                if (city[i][j] == 1) { // 집
                    houses.add(new int[]{i, j});
                } else if (city[i][j] == 2) { // 치킨집
                    chickens.add(new int[]{i, j});
                }
            }
        }

        // 치킨집 선택 상태
        selected = new boolean[chickens.size()];

        // 치킨집 조합 고르기
        combination(0, 0);

        bw.write(String.valueOf(minCityChickenDist));
        bw.flush();
        bw.close();
    }

    // 조합: 치킨집 중 M개 선택
    static void combination(int start, int depth) {
        if (depth == M) {
            // 선택된 치킨집으로 도시 치킨 거리 계산
            minCityChickenDist = Math.min(minCityChickenDist, getCityChickenDist());
            return;
        }

        for (int i = start; i < chickens.size(); i++) {
            selected[i] = true;
            combination(i + 1, depth + 1);
            selected[i] = false;
        }
    }

    // 현재 선택된 치킨집 조합에서 도시 치킨 거리 계산
    static int getCityChickenDist() {
        int total = 0;
        for (int i = 0; i < houses.size(); i++) {
            int [] house = houses.get(i);
            int hx = house[0];
            int hy = house[1];
            int minDist = Integer.MAX_VALUE;

            // 치킨집 리스트 순회, 조합에 해당되면 거리 계산 -> 더 가까운 치킨집은 minDist에 더함
            for (int j = 0; j < chickens.size(); j++) {
                if (selected[j]) {
                    int[] chick = chickens.get(j);
                    int dist = Math.abs(hx - chick[0]) + Math.abs(hy - chick[1]);
                    minDist = Math.min(minDist, dist);
                }
            }
            total += minDist;
        }
        return total;
    }
}
