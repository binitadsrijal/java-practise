
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
/* 
public class array{
      static void change(int[]arr){
            for(int i=0;i<arr.length;i++){
                arr[i]=0;
            }
        }
    public static void main(String[]args){
    
        int arr[]=new int [3];  //array as reference variable
       arr[0]=2;
       arr[1]=3;
       arr[2]=4;

       change(arr);
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
    }
}
*/
// public class array {
//     public static void main(String[] args) {  //for loop
//         for (int i = 0; i < 10; i++) {
//             System.out.println("Hello world");
//         }
//     }
// }

// public class array{   //swaping two values with third variable
//     static void swap(int a,int b){
//         System.out.println("before swap");
//         System.out.println("a:"+a+"   b:"+b);
//         int temp=a;
//         a=b;
//         b=temp;
//         System.out.println("after swap");
//         System.out.println("a:"+a+"   b:"+b);

//     }
//     public static void main(String[]args){
// swap(5,8);
//     }
// }

//reversing an array of length k with new array 
// public class array{  
//     static int[] reversearr(int a[]){
//         int n=a.length;
//      int ans[]=new int[n];
//    /*  int j=0;
//      traversing array in reverse direction
//     for(int i=n-1;i>=0;i--){ using for loop
//        ans[j++]=a[i];
//     */  }
//     int i=n-1,j=0;
//     while(i>=0){
//         ans[j++]=a[i--];
//     }
//      return ans;
//     }
//     public static void main(String[]args){
// int[]a={1,2,3,4,5,6,7};
// int ans[]= reversearr(a);
// for(int i=0;i<a.length;i++){
//     System.out.print(ans[i]+" ");
// }
// System.out.println();
//     }
// }

//reversing array without creating another array
/* 
public class array {
    static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
*/
public class array{
    public static void main(String[]args){
        System.out.println("hello world");
    }
}