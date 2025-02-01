import java.util.Scanner;

public class Main {
    public static final int MAX_T = 1000000;
    public static int[] posA = new int[MAX_T+1];
    public static int[] posB = new int[MAX_T+1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int timeA = input(n, sc, posA);
        int timeB = input(m, sc, posB);
        int time = Math.max(timeA, timeB);

        for(int t = 1; t < time; t++){
            if(posA[t] == posB[t]){
                System.out.print(t);
                return;
            }
        }
        System.out.print(-1);
    }

    private static int input(int moves, Scanner sc, int[] pos){
        int curTime = 1;
        for(int i = 0; i < moves; i++){
            char dir = sc.next().charAt(0);
            int time = sc.nextInt();
            for(int t=curTime; t < curTime + time; t++){
                pos[t] = pos[t - 1] + (dir == 'R' ? 1 : -1);
            }
            curTime+=time;
        }
        return curTime - 1;

    }
}