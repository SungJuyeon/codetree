import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int offset = 100;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int[][] grid = new int[offset*2+1][offset*2+1];
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j = x; j < x+8; j ++){
                for(int k = y; k < y+8; k++){
                    if(grid[j][k] == 0){
                        grid[j][k] = 1;
                        result++;
                    }
                }
            }
        }
        System.out.print(result);
        sc.close();

    }
}