import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int offset= 1000;
        int[][] grid = new int[offset*2+1][offset*2+1];
        int cnt = 0;

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            int x1 = sc.nextInt() + offset;
            int y1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset;
            int y2 = sc.nextInt() + offset;

            for(int j=x1; j<x2; j++){
                for(int k=y1; k<y2; k++){
                    if(i==2){
                        if(grid[j][k] != 0)
                            cnt--;
                    }
                    else{
                        grid[j][k] = 1;
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);


    }
}