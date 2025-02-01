import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int offset = 1000;
        int n = sc.nextInt();

        int[] list = new int[n];
        int cnt = 0, result = 1;

        for(int i = 0; i < n; i++){
            list[i] = sc.nextInt() + offset;   // input: 0 -> 1000 save, input: -1 -> 999 save
            if(list[i] < offset) {
                list[i] = 1;   //음수
            } else list[i] = 2; //양수

            if(i==0 || list[i] == list[i-1]){
                cnt++;
            } else {
                result = Math.max(result, cnt);
                cnt = 1;
            }
            result = Math.max(result, cnt);
        }
        
        System.out.print(result);
        sc.close();
    }
}