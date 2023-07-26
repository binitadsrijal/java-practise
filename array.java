
import java.util.*;   
/*class Arrayexample{
    void demoarray(){
        int ages[]=new int[3];
        String names[]=new String[3];
        float id[]=new float[3];
        ages[0]=23;
        ages[1]=31;  
        ages[2]=13;  //initializing and printing an array without loop
System.out.println(ages[0]);
System.out.println(ages[1]);
System.out.println(ages[2]);

    }
}
public class array{
    public static void main(String[]args){
       Arrayexample obj=new Arrayexample();
       obj.demoarray();
        
    }
}*/
/* 
public class array {   //input in array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
*/

public class array{
      static void change(int[]arr){
            for(int i=0;i<arr.length;i++){
                arr[i]=0;
            }
        }
    public static void main(String[]args){
    
        int arr[]=new int [3];
       arr[0]=2;
       arr[1]=3;
       arr[2]=4;

       change(arr);
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
    }
}