import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 24060_알고리즘_수업_병합_정렬_1_S3 {

    static int time = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(arr, 0, n-1, k);

        if(time < k)
            System.out.print(-1);
    }

    public static void merge_sort(int[] a, int p, int r, int k){
        if(p < r){
            int q = (p+r)/2;
            merge_sort(a, p, q, k);
            merge_sort(a, q+1, r, k);
            merge(a, p, q, r, k);
        }
    }

    public static void merge(int[] a, int p, int q, int r, int k){
        int i = p;
        int j = q+1;
        int t = 0;

        int[] temp = new int[r-p+1];

        while(i <= q && j <= r){
            if(a[i] <= a[j]){
                temp[t++] = a[i++];
            }else{
                temp[t++] = a[j++];
            }
        }

        while(i<=q){
            temp[t++] = a[i++];
        }

        while(j<=r){
            temp[t++] = a[j++];
        }

        i = p;
        t = 0;

        while(i<=r){
            a[i++] = temp[t++];

            time += 1;

            if(k == time){
                System.out.print(a[i-1]);
            }
        }
    }
}
