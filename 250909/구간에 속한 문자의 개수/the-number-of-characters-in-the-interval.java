// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         int k = sc.nextInt();
//         char[][] grid = new char[n+1][m+1];
//         for (int i = 0; i < n; i++) {
//             String s = sc.next();
//             for(int j = 0; j < s.length(); j++) {
//                 grid[i][j] = s.charAt(j);
//             }
//         }

//         int[] r1 = new int[k+1];
//         int[] c1 = new int[k+1];
//         int[] r2 = new int[k+1];
//         int[] c2 = new int[k+1];
//         for (int i = 0; i < k; i++) {
//             r1[i] = sc.nextInt();
//             c1[i] = sc.nextInt();
//             r2[i] = sc.nextInt();
//             c2[i] = sc.nextInt();
//         }
        
//         for(int i = 0; i < k; i++) {
//             int[] abc = new int[3];
//             for(int j = r1[i]-1; j < r2[i]; j++) {
//                 for(int jk = c1[i]-1; jk < c2[i]; jk++) {
//                     if(grid[j][jk] =='a') {
//                         abc[0]++;
//                     } else if(grid[j][jk] == 'b') {
//                         abc[1]++;
//                     } else {
//                         abc[2]++;
//                     }
//                 }
//             }
//             for(int x = 0; x < abc.length; x++) {
//                 System.out.print(abc[x]+ " ");
//             }
//             System.out.println();
//         }

//     }
// }


// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         int k = sc.nextInt();
//         char[][] grid = new char[n+1][m+1];
//         for (int i = 0; i < n; i++) {
//             String s = sc.next();
//             for(int j = 0; j < s.length(); j++) {
//                 grid[i][j] = s.charAt(j);
//             }
//         }

//         int[][] pa = new int[n+1][m+1];
//         int[][] pb = new int[n+1][m+1];
//         int[][] pc = new int[n+1][m+1];
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= m; j++) {
//                 char ch = grid[i-1][j-1];
//                 int sumA = (ch == 'a' ? 1 : 0);
//                 int sumB = (ch == 'b' ? 1 : 0);
//                 int sumC = (ch == 'c' ? 1 : 0);

//                 pa[i][j] = pa[i-1][j] + pa[i][j-1] - pa[i-1][j-1] + sumA;
//                 pb[i][j] = pb[i-1][j] + pb[i][j-1] - pb[i-1][j-1] + sumB;
//                 pc[i][j] = pc[i-1][j] + pc[i][j-1] - pc[i-1][j-1] + sumC;
//             }
//         }

//         for (int i = 0; i < k; i++) {
//             int r1 = sc.nextInt();
//             int c1 = sc.nextInt();
//             int r2 = sc.nextInt();
//             int c2 = sc.nextInt();

//             int[] abc = new int[3];
            
//             abc[0] = pa[r2][c2] - pa[r1-1][c2] - pa[r2][c1-1] + pa[r1-1][c1-1];
//             abc[1] = pb[r2][c2] - pb[r1-1][c2] - pb[r2][c1-1] + pb[r1-1][c1-1];
//             abc[2] = pc[r2][c2] - pc[r1-1][c2] - pc[r2][c1-1] + pc[r1-1][c1-1];

//             for(int x = 0; x < abc.length; x++) {
//                 System.out.print(abc[x]+ " ");
//             }
//             System.out.println();
//         }

//     }
// }

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                grid[i][j] = s.charAt(j);
            }
        }

        // 누적합
        int[][] pa = new int[n+1][m+1];
        int[][] pb = new int[n+1][m+1];
        int[][] pc = new int[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                char ch = grid[i-1][j-1];
                int a = (ch == 'a' ? 1 : 0);
                int b = (ch == 'b' ? 1 : 0);
                int c = (ch == 'c' ? 1 : 0);

                pa[i][j] = pa[i-1][j] + pa[i][j-1] - pa[i-1][j-1] + a;
                pb[i][j] = pb[i-1][j] + pb[i][j-1] - pb[i-1][j-1] + b;
                pc[i][j] = pc[i-1][j] + pc[i][j-1] - pc[i-1][j-1] + c;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int q = 0; q < k; q++) {
            st = new StringTokenizer(br.readLine());
            int r1 = Integer.parseInt(st.nextToken());
            int c1 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());

            int aCount = pa[r2][c2] - pa[r1-1][c2] - pa[r2][c1-1] + pa[r1-1][c1-1];
            int bCount = pb[r2][c2] - pb[r1-1][c2] - pb[r2][c1-1] + pb[r1-1][c1-1];
            int cCount = pc[r2][c2] - pc[r1-1][c2] - pc[r2][c1-1] + pc[r1-1][c1-1];

            sb.append(aCount).append(" ").append(bCount).append(" ").append(cCount).append("\n");
        }

        System.out.print(sb);
    }
}