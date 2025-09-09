import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        int[][] arrSum = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        arrSum[0][0] = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                arrSum[i][j] = arrSum[i-1][j] + arrSum[i][j-1] - arrSum[i-1][j-1] + arr[i][j];
            }
        }
        
        int maxN = 0;
        for(int i = 1; i <= n-k+1; i++) {
            for(int j = 1; j <= n-k+1; j++) {
                int s = arrSum[i+k-1][j+k-1] -arrSum[i-1][j+k-1] - arrSum[i+k-1][j-1] + arrSum[i-1][j-1];
                maxN = Math.max(maxN, s);
            }
        }

        System.out.println(maxN);

    }
}