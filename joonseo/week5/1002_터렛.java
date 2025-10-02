import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 1002_터렛 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(findPossiblePointCount(x1, y1, r1, x2, y2, r2)).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.print(sb);
    }

    private static int findPossiblePointCount(int x1, int y1, int r1, int x2, int y2, int r2) {
        double distSquared = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double dist = Math.sqrt(distSquared);

        // 1. 두 원이 동일한 경우 (중심이 같고 반지름이 같음)
        if (dist == 0 && r1 == r2) {
            return -1;
        }

        // 2. 두 원이 떨어져 있는 경우
        if (dist > r1 + r2) {
            return 0;
        }

        // 3. 한 원이 다른 원을 내포하는 경우 (내부에서 만나지 않음)
        if (dist < Math.abs(r1 - r2)) {
            return 0;
        }

        // 4. 외접하는 경우
        if (dist == r1 + r2) {
            return 1;
        }

        // 5. 내접하는 경우
        if (dist == Math.abs(r1 - r2)) {
            return 1;
        }

        // 6. 두 점에서 만나는 경우
        return 2;
    }
}
