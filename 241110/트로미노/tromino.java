import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {
    public static int n, m;
    public static int[][] grid;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);
        grid = new int[n][m];

        // 입력 받기
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                grid[i][j] = Integer.parseInt(line[j]);
            }
        }

        int answer = 0;
        for(int i=0; i<=n-2; i++){
            for(int j=0; j<=m-2; j++){
                answer = Math.max(answer, tromino(i,j));
            }
        }

        for(int i=0; i<n-2; i++){
            for(int j=0; j<m; j++){
                int answer_l = grid[i][j] + grid[i+1][j] + grid[i+2][j];
                answer = Math.max(answer, answer_l);
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m-2; j++){
                int answer_l = grid[i][j] + grid[i][j+1] + grid[i][j+2];
                answer = Math.max(answer, answer_l);
            }
        }
        bw.write(String.valueOf(answer));
        bw.newLine();
        bw.flush();
        bw.close();
    }

    public static int tromino(int i, int j){
        int a= grid[i][j];
        int b = grid[i+1][j];
        int c = grid[i][j+1];
        int d = grid[i+1][j+1];
        
        int sum1 = a + b + c;  // a + b + c
        int sum2 = a + b + d;  // a + b + d
        int sum3 = a + c + d;  // a + c + d
        int sum4 = b + c + d;  // b + c + d
    
        return Math.max(Math.max(sum1, sum2), Math.max(sum3, sum4));
    }
}