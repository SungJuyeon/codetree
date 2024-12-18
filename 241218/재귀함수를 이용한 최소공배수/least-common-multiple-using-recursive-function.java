import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] num = new int[N];

        String[] input = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(input[i]);
        }

        System.out.print(minNum(num, 0));
    }

    public static int minNum(int[] num, int i){
        if(i == num.length -1){
            return num[i];
        }

        return (num[i] * minNum(num, i+1)) / gcd(num[i], minNum(num, i+1));
    }

    public static int gcd(int num, int i){
        if(i==0) return num;
        return gcd(i, num % i);
    }
}