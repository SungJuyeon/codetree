import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int offset = 200;
        int x1, y1, x2, y2;

        int[][] grid = new int[offset*2][offset*2];
        for(int p = 0; p < n; p++){
            x1 = sc.nextInt() + offset;
            y1 = sc.nextInt() + offset;
            x2 = sc.nextInt() + offset;
            y2 = sc.nextInt() + offset;

            for(int i=x1; i<x2; i++){
                for(int j=y1; j<y2; j++){
                    grid[i][j] = 1;
                }
            }
        }
        
        int result = 0;

        for(int i=0; i<offset*2; i++){
            for(int j=0; j<offset*2; j++){
                if(grid[i][j] == 1){
                    result++;
                }
            }
        }

        System.out.print(result);
        sc.close();
    }
}