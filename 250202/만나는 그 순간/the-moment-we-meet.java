import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<String> moveA = new ArrayList<>();
        List<String> moveB = new ArrayList<>();

        for(int i = 0; i < n; i++){
            moveA.add(sc.next() + " " + sc.next());
        }
        for(int i = 0; i < m; i++){
            moveB.add(sc.next() + " " + sc.next());
        }

        List<Integer> posA = getPos(moveA);
        List<Integer> posB = getPos(moveB);
        int time  = Math.min(posA.size(), posB.size());

        for(int t = 0; t < time; t++){
            if(posA.get(t).equals(posB.get(t))){
                System.out.print(t+1);
                return;
            }
        }
        System.out.print(-1);
    }
    private static List<Integer> getPos(List<String> move){
        List<Integer> positions = new ArrayList<>();
        int pos = 0;
        for(String m: move){
            String[] input = m.split(" ");
            int dir = input[0].equals("R") ? 1 : -1;   //오른쪽방향이면 1
            int time = Integer.parseInt(input[1]);

            for(int i = 0; i < time; i++){
                pos += dir;
                positions.add(pos);
            }
        }
        return positions;
    }
}