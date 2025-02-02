import java.util.Scanner;

public class Main {
    public static int MAX_M = 1000000;
    public static int[] movA = new int[MAX_M];
    public static int[] movB = new int[MAX_M];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v, t;
        int curTimeA = 0; int curTimeB=0;
        for(int i = 0; i < n; i++){
            v = sc.nextInt();
            t = sc.nextInt();

            for(int time = curTimeA; time < curTimeA+t; time++){
                movA[time+1] = movA[time] + v;
            }
            curTimeA += t;
        }

        for(int i = 0; i < m; i++){
            v = sc.nextInt();
            t = sc.nextInt();

            for(int time = curTimeB; time < curTimeB+t; time++){
                movB[time+1] = movB[time] + v;
            }
            curTimeB += t;
        }
        int maxTime = Math.max(curTimeA, curTimeB);
        int cnt = 0;
        for(int j = 1; j <= maxTime; j++){
            if(movA[j] > movB[j] && !(movA[j-1] > movB[j-1]) ) cnt++;
            else if(movA[j] < movB[j] && !(movA[j-1] < movB[j-1])) cnt++;
        }
        System.out.print(cnt-1);

    }
}