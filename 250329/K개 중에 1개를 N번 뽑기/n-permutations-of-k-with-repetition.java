import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static int n, k;
    public static void printAnswer(){
        for(int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");
        System.out.println();
    }
    public static void binary(int i){
        if(arr.size() == n){
            printAnswer();
            return;
        }
        for(int j = 1; j <= k; j++){
            arr.add(j);
            binary(j+1);
            arr.remove(arr.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();
        
        for(int i = 1; i <= k; i++){
            arr.add(i);
            binary(i);
            arr.remove(arr.size() - n + 1);
        }

        return;
    }
}