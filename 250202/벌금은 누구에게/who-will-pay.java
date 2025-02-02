import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] stu_num = new int[n+1];

        for(int i = 0; i < m; i++){
            int num = sc.nextInt();
            stu_num[num]++;
            if(stu_num[num] >= k){
                System.out.print(num);
                return;
            }
        }
        System.out.print(-1);
    }
}