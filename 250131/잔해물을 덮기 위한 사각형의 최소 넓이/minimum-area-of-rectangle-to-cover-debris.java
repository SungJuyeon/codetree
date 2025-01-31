import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int offset = 1000;
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[offset*2+1][offset*2+1];
        int x1, x2, y1, y2;
        int minX=0 , maxX=0 , minY=0 , maxY=0;
        for(int i = 0; i < 2; i++){
            x1 = sc.nextInt() + 1000;
            y1 = sc.nextInt() + 1000;
            x2 = sc.nextInt() + 1000;
            y2 = sc.nextInt() + 1000;
            if(i == 0){
                minX = x1;
                maxX = x2;
                minY = y1;
                maxY = y2;
            }
            for(int j = x1; j < x2; j++ ){
                for(int k = y1; k < y2; k++){
                    if(i == 0){
                        grid[j][k] = 1;
                        
                    } else {
                        grid[j][k] = 0;
                    }
                }
            }
        }
        boolean emp = false;
        for(int i = minX; i < maxX; i++){
            for(int j = minY; j < maxY; j++){
                if(grid[i][j] == 1){
                    emp = true;
                    break;
                }
            }
            if(emp == false){
                maxX=i;
                break;
            }
        }
        int result = (maxX - minX) * (maxY - minY);
        System.out.println(result);
        sc.close();
    }
}