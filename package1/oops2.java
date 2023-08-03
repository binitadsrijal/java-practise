package package1;
/* 
 class employee{  //can use public too
     int id;   //default
   String name;
   private double salary;  //private
   public double getsal(){  //getter function
       return salary;
   }
   public double setsal(double salary){
       return this.salary=salary;
   }
}
public class oops2 {
 public static void main(String[]args){
     employee e1=new employee();
   e1.id=23;
   e1.name="bigyan";
   System.out.println(e1.name);
   System.out.println(e1.id);
   System.out.println(e1.setsal(70000));
   System.out.println(e1.getsal());
 }
}
*/

//using constructor-----------------------------------------------------------*
class Students {
  int roll;
  String name;
  double gpa;
  static int noofstu; //static keyword

  final String schnam = "mount view english school";  //final keyword

  Students(int ro, String name, double d) { // parameterized constructor
    roll = ro;
    this.name = name; // using this keyword
    gpa = d;
    noofstu++;
  }
}

public class oops2 {
  public static void main(String[] args) {
    Students s1 = new Students(1, "Binita", 4.0);
    // System.out.println(s1.gpa);
    // System.out.println(s1.roll);
    // System.out.println(s1.schnam);
    System.out.println(s1.name);
    System.out.println(s1.noofstu);

     Students s2 = new Students(2, "asmita", 3.0);
    // System.out.println(s1.gpa);
    // System.out.println(s1.roll);
    // System.out.println(s1.schnam);
    System.out.println(s1.name);
    System.out.println(s1.noofstu);
  }
}
