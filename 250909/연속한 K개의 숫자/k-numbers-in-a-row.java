import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int b = sc.nextInt();
        int[] bm = new int[n+1];
        for (int i = 0; i < b; i++) {
            int x = sc.nextInt();
            bm[x] = 1;
        }
        
        int[] arrSum = new int[n+1];
        arrSum[0] = 0;
        for(int i = 1; i <= n; i++) {
            arrSum[i] = arrSum[i-1] + bm[i];
        }
        
        int ans = Integer.MAX_VALUE;
        for(int i = k; i <= n; i++) {
            int find = arrSum[i] - arrSum[i-k];
                ans = Math.min(ans, find);
        }
        System.out.println(ans);

    }
}