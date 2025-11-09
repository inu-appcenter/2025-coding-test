import java.util.Scanner;

public class 26068_치킨댄스를추는곰곰이를본임스2_B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++) {
            String a = sc.next();
            String[] b = a.split("D-");
            if(Integer.parseInt(b[1]) <= 90) {
                count++;
            }
        }

        sc.close();
        System.out.println(count);
    }
}