import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = 11;
        int hour = 11;
        int day = 11;
        int sumMin = 0;

        if(a < day || (a == day && b < hour) || (a == day && b == hour && c < min)){
            System.out.print("-1");
            return;
        }

        // while(a != day || b != hour || c != min) {
            
        //     //++분
        //     min++;
        //     sumMin++;
        //     if(min == 60){
        //         min = 0;
        //         hour++;
                
        //     }
        //     if(hour == 24) {
        //         hour = 0;
        //         day++;
        //     }
        // }

        while(true) {
            if(a == day && b == hour && c == min)
                break;
            //++분
            min++;
            sumMin++;
            if(min == 60){
                min = 0;
                hour++;
                
            }
            if(hour == 24) {
                hour = 0;
                day++;
            }
        }

        
        //분이 60 넘으면 +시
        //시가 24 넘으면 +일
        System.out.print(sumMin);
        sc.close();

    }
}