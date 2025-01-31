import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 사각형 좌표
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // 두 번째 사각형 좌표
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        // 첫 번째 사각형에서 두 번째 사각형을 뺀 후 남은 조각들의 최소 감싸는 사각형 찾기
        int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;

        // 사각형을 4개의 부분으로 나눠서 검사
        // 1. 왼쪽 조각
        if (x1 < x3) {
            minX = Math.min(minX, x1);
            maxX = Math.max(maxX, x3);
            minY = Math.min(minY, y1);
            maxY = Math.max(maxY, y2);
        }
        // 2. 오른쪽 조각
        if (x2 > x4) {
            minX = Math.min(minX, x4);
            maxX = Math.max(maxX, x2);
            minY = Math.min(minY, y1);
            maxY = Math.max(maxY, y2);
        }
        // 3. 아래쪽 조각
        if (y1 < y3) {
            minX = Math.min(minX, x1);
            maxX = Math.max(maxX, x2);
            minY = Math.min(minY, y1);
            maxY = Math.max(maxY, y3);
        }
        // 4. 위쪽 조각
        if (y2 > y4) {
            minX = Math.min(minX, x1);
            maxX = Math.max(maxX, x2);
            minY = Math.min(minY, y4);
            maxY = Math.max(maxY, y2);
        }

        // 남은 영역이 없으면 넓이 0
        int result = 0;
        if (minX < maxX && minY < maxY) {
            result = (maxX - minX) * (maxY - minY);
        }

        System.out.println(result);
        sc.close();
    }
}
