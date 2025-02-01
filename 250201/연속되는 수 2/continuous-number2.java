import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] list = new int[n];
        int cnt = 0;

        for(int i = 0 ; i < n; i++){
            list[i] = sc.nextInt();

            if(i == 0 || list[i] == list[i-1]){
                cnt++;
            }
        }
        System.out.print(cnt);
        sc.close();
    }

}