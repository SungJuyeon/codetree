import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        sc.nextLine();

        List<String> words = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            words.add(sc.nextLine());
        }
        Collections.sort(words);

        //t로 시작하는 단어 찾기
        for(int i =0; i<n; i++){
            if(words.get(i).startsWith(t)){
                System.out.println(words.get(i+k-1));
                break;
            }
        }

        sc.close();
    }
}