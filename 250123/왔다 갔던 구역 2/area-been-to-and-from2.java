import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  curpos = 5000;
        int result = 0;
        int[] cur = new int[10000];
        for(int i = 0; i < n; i++){
            int move = sc.nextInt();
            String pos = sc.next();
            
            if(pos.equals("R")){
                for(int j =curpos; j < curpos+move; j++) {
                    cur[j]++;
                }
                curpos+=move;
            }
            else if(pos.equals("L")){
                for(int z = curpos-1; z >= curpos-move; z--){
                    cur[z]++;
                }
                curpos-=move;
            }
        }

        for(int q = 0; q < cur.length; q++){
            if(cur[q] > 1 ){
                result++;
            }
        }

        System.out.println(result);
    }
}
