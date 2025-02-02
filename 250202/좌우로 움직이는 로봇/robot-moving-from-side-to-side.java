import java.util.Scanner;

public class Main {
    public static int MAX_T = 1000000;
    public static int[] posA = new int[MAX_T+1];
    public static int[] posB = new int[MAX_T+1];

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int curA = 1; int curB = 1;

        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            for(int time = curA; time < curA + t; time++){
                posA[time] = posA[time-1] + (d=='L' ? -1 : 1);
            }
            curA += t;
        }
        for(int i = 0; i < m; i++){
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            for(int time = curB; time < curB + t; time++){
                posB[time] = posB[time-1] + (d=='L' ? -1 : 1);
            }
            curB += t;
        }
        int cnt = 0;
        int maxTime =0;
        if(curA > curB){
            maxTime = curA;
            for(int c = curB+1; c <= maxTime; c++){
                posB[c] = posB[c-1];
            }
        } else if(curA < curB){
            maxTime = curB;
            for(int c = curA+1; c <= maxTime; c++){
                posA[c] = posA[c-1];
            }
        }
        for(int i = 1; i<=maxTime; i++){

            if(posA[i] == posB[i] && posA[i-1] != posB[i-1]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}