import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] arr = new int[n][k];
        int [] num = new int[n];

        //n 만큼의 x축, k만큼의 y축
        for(int i = 0; i < k; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = x; j <= y; j++){
                arr[j][i] = 1;
            }

        }

        //arr[n][k]
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < k; j++){
                if(arr[i][j] == 1){
                    num[i]++;
                }
            }
        }

        int max = Arrays.stream(num).max().getAsInt();
        System.out.print(max);
    }
}