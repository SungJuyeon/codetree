import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        
        int num = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        for(int i =0; i <n; i++){
            for(int j = i+1; j < n;j++){
                for(int k = j+1; k < n; k++){
                    boolean over = false;
                    int[] arr = new int[101];
                    //3개 선 제외 => !=i, !=j, !=k
                    for(int p = 0; p < n; p++){
                        if(i == p || j == p || k ==p) continue;
                        for(int q = a[p]; q <= b[p]; q++){
                            arr[q]++;
                            if(arr[q] > 1){
                                over = true;
                                break;
                            }
                        }
                    }
                    // for(int q = 0; q< 101; q++){
                    //     if(arr[q] > 1) {
                    //         over = true;
                    //         break;
                    //     }
                    // }
                    if(over == false) num++;
                }
            }
        }
        
        System.out.print(num);
        sc.close();
    }
}