import java.util.Arrays;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];

        for(int i = 0; i < N; i++){
            words[i] = br.readLine();
        }
        Arrays.sort(words);

        for (String word : words) {
            System.out.println(word);
        }
    }
}