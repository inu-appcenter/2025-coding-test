import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 4779_칸토어_집합_S3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while((input = br.readLine()) != null && !input.trim().isEmpty()){

            int n = (int) Math.pow(3, Integer.parseInt(input.trim()));

            int[] arr = new int[n];
            Arrays.fill(arr, 1);

            cantor(arr, 0, n-1);
            System.out.println(getCantor(arr));
        }
    }

    public static void cantor(int[] arr, int start, int end){

        if(start == end)
            return;

        int firstCut = start + (end - start + 1) / 3;
        int secondCut = start + (end - start + 1) * 2 / 3 - 1;

        // 가운데 범위를 0으로 설정
        for(int i = firstCut; i <= secondCut; i++)
            arr[i] = 0;

        cantor(arr, start, firstCut - 1); // 왼쪽 조각
        cantor(arr, secondCut + 1, end); // 오른쪽 조각
    }

    public static String getCantor(int[] arr){
        StringBuilder sb = new StringBuilder();
        for (int j : arr) {
            if (j == 1)
                sb.append("-");
            else
                sb.append(" ");
        }
        return sb.toString();
    }
}
