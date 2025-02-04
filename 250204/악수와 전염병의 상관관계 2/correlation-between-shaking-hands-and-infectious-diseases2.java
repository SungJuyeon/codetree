import java.util.*;

public class Main {
    public static int MAX_T = 250;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();
        int t = sc.nextInt();

        int[] result = new int[n+1];
        result[p] = 1;
        int[] k_cnt = new int[n+1];
        int[] xTime = new int[MAX_T+1];
        int[] yTime = new int[MAX_T+1];

        for(int i = 0; i < t; i++){
            int time = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            xTime[time] = x;
            yTime[time] = y;
        }

        for(int j = 1; j < MAX_T+1; j++){
            if(result[xTime[j]] == 1 && result[yTime[j]] == 0 && k_cnt[xTime[j]] < k) {
                result[yTime[j]] = 1;
                k_cnt[xTime[j]]++;
            } else if(result[xTime[j]] == 0 && result[yTime[j]] == 1 && k_cnt[yTime[j]] < k){
                result[xTime[j]] = 1;
                k_cnt[yTime[j]]++;
            } else if(result[xTime[j]] == 1 && result[yTime[j]] == 1){
                k_cnt[yTime[j]]++;
                k_cnt[xTime[j]]++;
                
            }
            
        }
        
        for(int i = 1; i < n+1; i++){
            System.out.print(result[i]);
        }
        sc.close();
    }
}