import java.util.Scanner;

public class Main {
    private static int[] arrx = {-1, 0, 0, 1};
    private static int[] arry = {0, -1, 1, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=0, y=0;
        int posit = 0;
        int result = 0;
        for(int i = 0; i < n; i++){
            char pos = sc.next().charAt(0);
            int mov = sc.nextInt();

            if(pos == 'W'){ //서
                posit = 0;
            } else if(pos == 'S') { //남
                posit = 1;
            }else if(pos == 'N'){ //북
                posit = 2;
            } else {    //E 동
                posit = 3;
            }

            for(int t=0; t<mov; t++){
                x += arrx[posit];
                y += arry[posit];
                result++;
                if(x == 0 && y == 0){
                    System.out.print(result);
                    return;
                }
                
            }
        }
        System.out.print("-1");
        sc.close();
    }
}