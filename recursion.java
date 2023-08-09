import java.util.Scanner;
//printing from 1 to n numbers through recursion-------------------------------------------*
/*
 * public class recursion{
 * static void printnumbers(int n){
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

//printing from n to 1 numbers through recursion-------------------------------------*
/*
 * public class recursion{
 * 
 * static void printnumbers(int n){ 
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

// more problems(Factorial of number)--------------------------------------------------*
/* 
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
*/
//fibonacci series--------------------------------------------------------------*
/* 
public class recursion{
static int fibonacci(int n){
    if(n==0 || n==1){
        return n;
    }
    return fibonacci(n-1)+fibonacci(n-2);
}
    public static void main(String[]args){
        for(int i=0;i<10;i++){   //upto 10th term fibonacci series
System.out.println(fibonacci(i));
        }
    }
}
*/

//calculating sum of each digit-------------------------------------------------------*
/* 
public class recursion {
    static int sof(int n) {
        if ((n >= 0) && (n <= 9))
            return n;
        return sof(n / 10) + n % 10; // sof(n/10) gives the sum of (n-1)th digit sum & n%10 gives nth term
    }

    public static void main(String[] args) {
        System.out.println(sof(1234));
    }
}
*/

//return the count of digit in number eg(1234) n=4
/* 
public class recursion{
    static int count(int num){
        int countt=0;
if((num>=0)&&(num<=9)) return num;



    }
    public static void main(String[]args){
System.out.println(count(123345));
    }
}
*/

//p^q using recursion
/* 
public class recursion { // time complexity =O(b);
    static int pow(int a, int b) {
        if (b == 0)
            return 1;
        return pow(a, b - 1) * a;
    }

    public static void main(String[] args) {

        System.out.println(pow(2, 3));
    }
}
*/

//same qn better approach

public class recursion{
    static int pow(int p,int q){
        if(q==0) return 1;  //time complexity =O(logq)
        if((q%2)==0){
            return (pow(p,q/2)*pow(p,q/2));
        }
        else return (p*pow(p,q/2)*pow(p,q/2));
    }
    public static void main(String[]args){
        System.out.println(pow(2,5));
    }
}