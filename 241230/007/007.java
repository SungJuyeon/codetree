import java.util.Scanner;

class Zzseven{
    String secretCode, meetingPoint;
    int time;

    public Zzseven(String secretCode, String meetingPoint, int time){
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }

};
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String secretCode = scanner.next();
        String meetingPoint = scanner.next();
        int time = scanner.nextInt();

        Zzseven z = new Zzseven(secretCode, meetingPoint, time);
        System.out.println("secret code : "+ z.secretCode);
        System.out.println("meeting point : " + z.meetingPoint);
        System.out.println("time : " + z.time);

        scanner.close();
    }
}