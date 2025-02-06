import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dx = new int[]{1,  0, -1, 0}; //E, S, W, N
        int[] dy = new int[]{0, -1,  0, 1};
        int x = 0, y = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =0; i < n; i++){
            char pos = sc.next().charAt(0);
            int move = sc.nextInt();

            if(pos == 'E'){
                x += (move*dx[0]); y+=(move*dy[0]);
            } else if(pos == 'S'){
                x += (move*dx[1]); y+=(move*dy[1]);
            } else if(pos == 'W') {
                x += (move*dx[2]); y+=(move*dy[2]);
            }else {
                x += (move*dx[3]); y+=(move*dy[3]);
            }
        }
        System.out.print(x + " " + y);
    }
}