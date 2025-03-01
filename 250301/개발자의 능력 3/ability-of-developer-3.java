import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ability = new int[6];
        for (int i = 0; i < 6; i++) {
            ability[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i<6; i++){
            sum += ability[i];
        }

        for(int i =0; i<6; i++){
            for(int j=i+1; j <6; j++){
                for(int k = j+1; k<6; k++){
                    if(i==j || j == k || k == i)
                        continue;
                    int one = ability[i] + ability[j] + ability[k];
                    int two = sum-one;
                    min = Math.min(min, Math.abs(one-two));
                }
            }
        }
        System.out.print(min);
        sc.close();
    }
}