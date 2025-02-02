import java.util.Scanner;

public class Main {
    public static int MAT_T = 1000000;
    public static int[] posA = new int[MAT_T + 1];
    public static int[] posB = new int[MAT_T + 1];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int curTimeA = 1;
        int curTimeB = 1;

        for(int i = 0; i < n; i++){
            char c = sc.next().charAt(0);
            int time = sc.nextInt();

            for(int t = curTimeA; t < curTimeA + time; t++){
                posA[t] = posA[t-1] + (c=='L' ? -1 : 1);
            }
            curTimeA += time;
        }

        for(int i = 0; i < m; i++){
            char c = sc.next().charAt(0);
            int time = sc.nextInt();

            for(int t = curTimeB; t < curTimeB + time; t++){
                posB[t] = posB[t-1] + (c=='L' ? -1 : 1);
            }
            curTimeB += time;
        }
        int minTime = Math.min(curTimeA, curTimeB);
        for(int t = 1; t < minTime; t++){
            if(posA[t] == posB[t]){
                System.out.print(t);
                return;
            }
        }
        System.out.print(-1);
    }
}

