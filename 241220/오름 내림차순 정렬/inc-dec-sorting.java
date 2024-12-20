import java.util.Arrays;
import java.io.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] num = new int[N];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(num);
        for(int i =0; i < N; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();

        Integer[] numDesc = Arrays.stream(num).boxed().toArray(Integer[]::new);
        Arrays.sort(numDesc, Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            System.out.print(numDesc[i] + " ");
        }
    }
}
