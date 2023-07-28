
class Student {
    String name;
    int grade = 9;
    int rollnum;

    public void run() {
        System.out.println("She can run!!");
    }
}

public class oops {
    public static void main(String[] args) {
        Student s1 = new Student(); //first object
        s1.name = "Binita Rijal";
        s1.rollnum = 1;
        System.out.println(s1.name);
        System.out.println(s1.grade);
        System.out.println(s1.rollnum);
        s1.run();

        Student s2=new Student();
        s2.name="shivam";
        s2.grade=10;
        s2.rollnum=2;
        System.out.println(s2.name);
        System.out.println(s2.grade);
        System.out.println(s2.rollnum);
    }
}
