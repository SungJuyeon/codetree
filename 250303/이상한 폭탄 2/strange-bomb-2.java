import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bombs = new int[n];
        for (int i = 0; i < n; i++) {
            bombs[i] = sc.nextInt();
        }
        int max = -1;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j <= i+k; j++){
                if(j >= n) break;
                if(bombs[i] == bombs[j])
                    max = Math.max(max, bombs[i]);
            }
        }
        System.out.println(max);
        sc.close();
    }
}