import java.util.*;

class User{
    String name;
    int height, weight;

    public User(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        User[] users = new User[n];
        for(int i = 0; i <n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            users[i] = new User(name, height, weight);
        }

        Arrays.sort(users, new Comparator<User>(){
            @Override
            public int compare(User a, User b){
                return a.height - b.height;
            }
        });

        for (User user : users) {
            System.out.println(user.name + " " + user.height + " " + user.weight);
        }

    }
}