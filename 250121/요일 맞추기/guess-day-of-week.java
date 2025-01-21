import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days_eng = new String[] {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int days_of_seven = 1;

        int one = cal_day(m1, d1, days);
        int two = cal_day(m2, d2, days);

        int result = (two - one) % 7;
        System.out.println(days_eng[result+1]);

        // 시간 초과
        // while(true){
        //     if(m1 == m2 && d1 == d2){
        //         System.out.println(days_eng[days_of_seven]);
        //         break;
        //     }

        //     if(m1 <= m2 && d1 < d2) {
        //         d1--;
        //         days_of_seven--;
        //         if(days_of_seven < 0)
        //             days_of_seven = 6;
        //         if(d1 == 0){
        //             m1 --;
        //             if(m1 == 1)
        //                 m1 = 12;
        //             d1 = days[m1];
        //         }
        //     } else {
        //         d1++;
        //         days_of_seven++;
        //         if(days_of_seven > 6)
        //             days_of_seven = 0;

        //         if(d1 > days[m1]){
        //             m1++;
        //             if(m1 == 12)
        //                 m1 = 1;
        //             d1=1;
        //         }
        //     }
        // }
    }

    private static int cal_day(int m, int d, int[] days){
        int total = 0;
        for(int i = 1; i < m; i++){
                total += days[i];
        }
        total += d;
        return total;
    }
}
