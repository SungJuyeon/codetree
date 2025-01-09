import java.util.*;

class Student implements Comparable<Student> {
    int h, w, num;

    public Student(int h, int w, int num){
        this.h = h;
        this.w = w;
        this.num =num;
    }

    @Override
    public int compareTo(Student student) {
        if(this.h == student.h){
            return student.w - this.w;
        }  
        return student.h - this.h;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i=0; i<n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();

            students[i] = new Student(h, w, i+1);
        }

        Arrays.sort(students);

        for(int i=0; i<n; i++){
            System.out.println(students[i].h+ " "+students[i].w+ " "+students[i].num);
        }

    }
}