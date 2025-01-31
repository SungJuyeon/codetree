import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int offset = 1000;
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[offset * 2 + 1][offset * 2 + 1];
        int x1, x2, y1, y2;
        int x3, x4, y3, y4;

        // 입력받은 좌표들
        x1 = sc.nextInt() + offset;
        y1 = sc.nextInt() + offset;
        x2 = sc.nextInt() + offset;
        y2 = sc.nextInt() + offset;

        x3 = sc.nextInt() + offset;
        y3 = sc.nextInt() + offset;
        x4 = sc.nextInt() + offset;
        y4 = sc.nextInt() + offset;

        // 첫 번째 직사각형 그리기
        for (int j = x1; j < x2; j++) {
            for (int k = y1; k < y2; k++) {
                grid[j][k] = 1;
            }
        }

        // 두 번째 직사각형 빼기
        for (int j = x3; j < x4; j++) {
            for (int k = y3; k < y4; k++) {
                if (grid[j][k] == 1)
                    grid[j][k] = 0;
            }
        }

        // 남은 영역의 경계값 계산
        int minX = offset * 2 + 1, maxX = -1, minY = offset * 2 + 1, maxY = -1;

        boolean hasRemaining = false;
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                if (grid[i][j] == 1) {
                    hasRemaining = true;
                    if (i < minX) minX = i;
                    if (i > maxX) maxX = i;
                    if (j < minY) minY = j;
                    if (j > maxY) maxY = j;
                }
            }
        }

        // 남은 영역의 넓이 계산
        int result = 0;
        if (hasRemaining) {
            result = (maxX - minX + 1) * (maxY - minY + 1);
        }

        System.out.println(result);
        sc.close();
    }
}
