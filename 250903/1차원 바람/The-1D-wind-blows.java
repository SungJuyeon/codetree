import java.util.*;

public class Main {
    public static int n,m,q;
    public static int[][] a;



    public static class Node {
        int row;
        char dir;
        int ud;
        Node(int row, char dir, int ud) {
            this.row = row;
            this.dir = dir;
            this.ud = ud;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();   //행
        m = sc.nextInt();   //열
        q = sc.nextInt();   //바람 수
        a = new int[n][m];
        int[] r = new int[q+1];
        char[] d = new char[q+1];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt(); //배열
        for (int i = 0; i < q; i++) {
            r[i] = sc.nextInt() - 1;
            d[i] = sc.next().charAt(0);
        }
        
        for(int i = 0; i < q; i++) {
            rotate(a, r[i], d[i]);
        }
        print_a(a);
    }

    public static void rotate(int[][] a, int r, char d) {
        Queue<Node> qn = new LinkedList<>();
        boolean[] visited = new boolean[101];
        qn.add(new Node(r,d,0));
        visited[r] = true;

        while(!qn.isEmpty()) {
            Node cur = qn.poll();
            int row = cur.row;
            char dir = cur.dir;
            int ud = cur.ud;

            // 현재 행 회전
            if(dir == 'L') {
                int temp = a[row][m-1];
                for(int j = m-1; j >= 1; j--) {
                    a[row][j] = a[row][j-1];
                }
                a[row][0] = temp;

            } else if(dir == 'R') {
                int temp = a[row][0];
                for(int j = 0; j < m-1; j++) {
                    a[row][j] = a[row][j+1];
                }
                a[row][m-1] = temp;
            }

            // 회전 후 전파 조건 확인
            // ud = 0 이면 up,down 방향
            // ud = 1 이면 up 방향 -> up 만 진행
            // ud = 2 이면 down 방향 -> down 만 진행
            if(row > 0 && !visited[row-1]) {
                if(ud == 0 || ud == 1) {
                    if(existed(a[row], a[row-1])) {
                        qn.add(new Node(row-1, LR(dir), 1));
                        visited[row-1] = true;
                    }
                }
            }
            if(row < n-1 && !visited[row+1]) {
                if(ud == 0 || ud == 2) {
                    if(existed(a[row],a[row+1])) {
                        qn.add(new Node(row+1, LR(dir), 2));
                        visited[row+1] = true;
                    }
                }
            }
        }
    }

    public static boolean existed(int[] r1, int[] r2) {
        for(int j = 0; j < m; j++) {
            if(r1[j] == r2[j]) return true;
        }
        return false;
    }

    public static char LR(char d) {
        if(d == 'L') return 'R';
        else return 'L';
    }

    public static void print_a(int[][] a) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}