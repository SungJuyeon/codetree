import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> arr= new ArrayList<> ();
    public static int n = 0, sum = 0;

    public static boolean isPretty(){
        for(int i =0; i<n; i+=arr.get(i)){
            //연속하여 같은 숫자가 나오는 시작 위치
            if(i + arr.get(i) - 1 >= n) return false;
            //연속하여 해당 숫자만큼 연속하여 같은 숫자가 나오는지 확인
            for(int j = i; j < i+arr.get(i); j++){
                if(arr.get(j) != arr.get(i)) return false;
            }
        }
        return true;
    }

    public static void PrettyNum(int num) {
        if(num == n) {
            if(isPretty()) sum++;
            return;
        }
        for(int i = 1; i <= 4; i++){    //1 ~ 4 까지 arr에 넣음
            arr.add(i);
            PrettyNum(num+1);
            arr.remove(arr.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        PrettyNum(0);
        System.out.print(sum);
    }
}