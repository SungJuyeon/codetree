import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] arr = new int[10];
        int result = 0;

        for(int i = x; i <= y; i++){
            int num = 0;
            String st = Integer.toString(i);

            for(int p = 0; p < arr.length; p++){
                arr[p] = 0; //배열 초기화 
            }

            for(int j=0; j<st.length(); j++){
                arr[Character.getNumericValue(st.charAt(j))]++;
            }

            for(int k = 0; k < arr.length; k++){
                if(arr[k] > 0) {
                    num++;
                }
            }
            if(num == 2) result++;
            
        }
        System.out.println(result);
        sc.close();
    }
}