import java.util.Scanner;
/*
 * public class recursion{
 * static void printnumbers(int n){ //printing from 1 to n numbers through
 * recursion
 * if(n==1){
 * System.out.println(n);
 * return;
 * }
 * printnumbers(n-1); //calling itself and prints upto n-1
 * System.out.println(n); //printing n
 * }
 * public static void main(String[]args){
 * Scanner sc=new Scanner(System.in); //input from user
 * int n=sc.nextInt();
 * printnumbers(n);
 * }
 * }
 */
/*
 * public class recursion{
 * 
 * static void printnumbers(int n){ //printing from n to 1 numbers through
 * recursion
 * if(n==1){
 * System.out.println(n);
 * return;
 * }
 * System.out.println(n); //printing n //self work
 * printnumbers(n-1); //calling itself and prints upto n-1 //recursive work
 * 
 * }
 * public static void main(String[]args){//print all numbers from n to 1
 * printnumbers(5);
 * }
 * }
 */

// more problems

public class recursion { // factorial of n
    static int fact(int n) {
        // base case
        if (n == 0) {
            return 1;

        }
        int smallprob = fact(n - 1); // sub problem or recursive work
        // self work
        int factorial = n * smallprob;
        return factorial;

    }

    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}