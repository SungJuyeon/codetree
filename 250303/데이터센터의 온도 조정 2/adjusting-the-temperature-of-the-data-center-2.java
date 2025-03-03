import java.util.Scanner;

public class Main {
    public static int c=0, g=0, h=0;
    public static int tp(int a, int b, int i){
        int result = 0;
        if(i < a) result += c;
        if(i >=a && i <= b) result += g;
        if(i > b) result += h;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        c = sc.nextInt();
        g = sc.nextInt();
        h = sc.nextInt();
        int[] ta = new int[n];
        int[] tb = new int[n];
        for (int i = 0; i < n; i++) {
            ta[i] = sc.nextInt();
            tb[i] = sc.nextInt();
        }
        for(int i = 0; i < 1000; i++){
            int num = 0;
            for(int j = 0; j <n; j++){
                num += tp(ta[j], tb[j], i+1);
            }
            max = Math.max(max, num);
        }
        System.out.println(max);
        sc.close();
    }
}