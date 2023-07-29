
// class Student {
//     String name;
//     int grade = 9;
//     int rollnum;

//     public void run() {
//         System.out.println("She can run!!");
//     }
// }

// public class oops {
//     public static void main(String[] args) {
//         Student s1 = new Student(); //first object
//         s1.name = "Binita Rijal";
//         s1.rollnum = 1;
//         System.out.println(s1.name);
//         System.out.println(s1.grade);
//         System.out.println(s1.rollnum);
//         s1.run();

//         Student s2=new Student();
//         s2.name="shivam";
//         s2.grade=10;
//         s2.rollnum=2;
//         System.out.println(s2.name);
//         System.out.println(s2.grade);
//         System.out.println(s2.rollnum);
//     }
// }

//oops with parameterized constructor-----------------------------------------------------*

class Operations {
    int a;
    int b;
Operations(int x,int y){
System.out.println("Helllo world");
 a=x;
 b=y;
}
int add(){
    return a+b;  //got parameters from constructors
}
int sub(){
    return a-b;
}
int mul(){
    return a*b;
}
}

public class oops {
    public static void main(String[] args) {
Operations o1=new Operations(5,10);
System.out.println(o1.add());
System.out.println(o1.sub());
System.out.println(o1.mul());

    }
}
