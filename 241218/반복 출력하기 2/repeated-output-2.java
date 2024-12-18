import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        printHW(N);
    }

    public static void printHW(int n){
        if(n==0) return;
        System.out.println("HelloWorld");
        printHW(n-1);
    }
}