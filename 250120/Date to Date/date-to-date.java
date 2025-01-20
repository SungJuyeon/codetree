import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt(); // 시작 월
        int d1 = sc.nextInt(); // 시작 일
        int m2 = sc.nextInt(); // 종료 월
        int d2 = sc.nextInt(); // 종료 일

        int sumDay = 0;

        while (true) {
            if (m1 == m2 && d1 == d2) {
                sumDay++;
                break;
            }

            sumDay++;
            d1++;

            if (d1 > num_of_days[m1]) {
                d1 = 1; 
                m1++; 

                if (m1 > 12) {
                    m1 = 1;
                }
            }
        }

        System.out.print(sumDay);
        sc.close();
    }
}
