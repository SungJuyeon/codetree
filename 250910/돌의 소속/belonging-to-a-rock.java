import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] stones = new int[n + 1];
        int[][] preSum = new int[4][n+1];
        for (int i = 1; i <= n; i++) {
            stones[i] = sc.nextInt();
            preSum[stones[i]][i] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int g = 1; g <= 3; g++) {
                preSum[g][i] = preSum[g][i-1]; 
            }
            preSum[stones[i]][i]++; 
        }

        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int one = preSum[1][b] - preSum[1][a-1];
            int two  = preSum[2][b] - preSum[2][a-1];
            int thr = preSum[3][b] - preSum[3][a-1];

            System.out.println(one + " " + two + " " + thr);
        }
        

    }
}