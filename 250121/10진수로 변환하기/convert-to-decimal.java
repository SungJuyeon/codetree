import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        
        int[] binary = new int[8];
        //8자리 이하 2진수를 입력 받음
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();

        int result = 0;
        int i = 0;
        //거꾸로 출력
        while(bin > 0){
            binary[i++] = (bin % 10);
            bin /= 10;
        }

        for(int j=0; j<i; j++){
            result += Math.pow(2,j) * binary[j];
        }
        System.out.print(result);
    }
}
