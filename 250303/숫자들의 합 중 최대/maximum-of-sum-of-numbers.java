import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int max = 0;

        for (int j = x; j <= y; j++) {
            int num = 0;
            int temp = j;

            while (temp > 0) {
                int dx = temp % 10;
                temp /= 10;
                num += dx;
            }
            max = Math.max(max, num);
        }
        System.out.println(max);
        sc.close();
    }
}
