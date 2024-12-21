import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] first = sc.nextLine().toCharArray();
        char[] second = sc.nextLine().toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        if((Arrays.equals(first, second)))
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();
    }
}
