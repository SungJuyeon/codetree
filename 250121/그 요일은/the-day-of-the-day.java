import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days_eng = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int day_a = 0;
        String a = sc.next();

        //a 와 days_eng 일치하는 i
        for(int i=0; i<days_eng.length; i++){
            if(a.equals(days_eng[i])== true){
                day_a = i;
            }
        }
        int one = cal_day(m1, d1, days);
        int two = cal_day(m2, d2, days);
        int num = 0;
        if ((two - one) % 7 / day_a > 0)
            num = 1;
        int result = ((two - one) / 7) + num;

        System.out.println(result);
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
