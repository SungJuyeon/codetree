import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dx = new int[]{0,  1, 0, -1}; //북 동 남 서
        int[] dy = new int[]{1, 0,  -1, 0};
        int[] move = new int[] {0, 0};

        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int dirNum = 0; //0: 북쪽 1: 동 2: 남 3: 서

        for(int i = 0; i < n.length(); i++){
            if(n.charAt(i) =='L'){
                dirNum = (dirNum -1 + 4) % 4;
            } else if(n.charAt(i) == 'R') {
                dirNum = (dirNum + 1) % 4;
            } else {    // F
                move[0] += dx[dirNum];
                move[1] += dy[dirNum];
            }
        }

        System.out.println(move[0]+ " " + move[1]);
        sc.close();
    }
}