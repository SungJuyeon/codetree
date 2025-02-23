import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] array;
        array = input.split("");
        int result = 0;

        for(int i =0; i<array.length; i++){
            if(array[i].equals("(")){
                for(int j = i+1; j < array.length; j++){
                    if(array[j].equals(")")) result++;
                }
            }
        }
        System.out.println(result);
        sc.close();
    }
}