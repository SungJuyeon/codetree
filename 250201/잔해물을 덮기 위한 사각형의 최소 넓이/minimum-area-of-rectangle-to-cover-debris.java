import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int offset = 1000;
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[offset*2+1][offset*2+1];
        int x1, x2, y1, y2;
        int x3, x4, y3, y4;
        x1 = sc.nextInt() + offset;
        y1 = sc.nextInt() + offset;
        x2 = sc.nextInt() + offset;
        y2 = sc.nextInt() + offset;

        x3 = sc.nextInt() + offset;
        y3 = sc.nextInt() + offset;
        x4 = sc.nextInt() + offset;
        y4 = sc.nextInt() + offset;
        for(int j = x1; j < x2; j++ ){
            for(int k = y1; k < y2; k++){
                grid[j][k] = 1;
            }
        }
        for(int j = x3; j < x4; j++ ){
            for(int k = y3; k < y4; k++){
                if(grid[j][k] == 1)
                    grid[j][k] = 0;
            }
        }
        int minX = offset*2+1, maxX = offset, minY = offset*2+1, maxY= offset;

        boolean hasRemaining = false;
        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                if(grid[i][j] == 1){
                    hasRemaining = true;
                    if(grid[i-1][j] == 0) { if(i < minX) minX = i;}
                    else if (grid[i-1][j] == 1) { if(i > maxX) maxX = i;}
                    if(grid[i][j-1] == 0) { if( j < minY) minY = j;}
                    else if (grid[i][j-1] == 1) { if(j > maxY) maxY = j;}
                }
            }
        }
        int result = 0;
        
        if(hasRemaining == false) result = 0; 
        else { result = (maxX - minX +1) * (maxY - minY +1); }

        System.out.println(result);
        sc.close();
    }
}