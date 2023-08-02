 package package1;   
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
    e1.name="binita";
    System.out.println(e1.name);
    System.out.println(e1.id);
    System.out.println(e1.setsal(70000));
    System.out.println(e1.getsal());
  }
    
    
}
