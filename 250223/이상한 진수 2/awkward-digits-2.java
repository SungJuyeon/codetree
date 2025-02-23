import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        String[] input = in.split("");
        int result = 0;
        boolean change = false;
        for(int i = 0; i < input.length; i++){
            if(input[i].equals("0")){
                input[i] = "1";
                change = true;
                break;
            }
        }
        if(change == false) input[input.length - 1] = "0";
        
        for(int j = 0; j < input.length; j++){
            if(input[j].equals("1")){
                result += Math.pow(2, (input.length-j-1));
            }
        }
        System.out.println(result);
        sc.close();
    }
}