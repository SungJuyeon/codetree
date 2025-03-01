import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sol = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= n; k++){
                    if((i < a-2 || i > a+2) && (j <b-2 || j >b+2) && (k<c-2 || k >c+2)){
                        sol++;
                    }
                }
            }
        }
        System.out.print(n*n*n - sol);
        sc.close();
    }
}