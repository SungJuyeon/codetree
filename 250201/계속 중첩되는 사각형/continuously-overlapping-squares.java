import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int offset = 100;
        int[][] grid = new int[offset*2+1][offset*2+1];

        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt() + offset;
            int y1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset;
            int y2 = sc.nextInt() + offset;

            for(int j = x1; j < x2; j++){
                for(int k = y1; k < y2; k++){
                    if(i % 2 == 0) {    //빨간색
                        grid[j][k] = 1;
                    } else grid[j][k] = 2;
                }
            }
        }
        int cnt = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                if(grid[i][j] == 2){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}