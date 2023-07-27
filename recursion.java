import java.util.Scanner;

public class recursion{
    static void printnumbers(int n){  //printing from 1 to n numbers through recursion
        if(n==1){
            System.out.println(n);
            return;
        }
        printnumbers(n-1); //calling itself and prints upto n-1
        System.out.println(n);  //printing n
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in); //input from user
        int n=sc.nextInt();
        printnumbers(n);
    }
}