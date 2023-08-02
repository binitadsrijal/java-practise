import java.util.*;
/* 
public class string {
    public static void main(String[] args) {
        String str = "HelLo woRld";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.endsWith("id"));
        System.out.println(str.indexOf("e"));
        System.out.println(str.contains("g"));
        System.out.println(str.startsWith("H")); // case sensitive
        System.out.println(str.charAt(3));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        String s1 = "Beau";
        String s2 = "tiful";
        System.out.println(s1.concat(s2));
        System.out.println(str.substring(5));
        // System.out.println(str.substring(0,5));
        // System.out.println(str.substring(3));

        String in = "Binita";
        System.out.println("Substings");  //All sustrings of Binita-------------------------* 
        for (int i = 0; i < in.length(); i++) {
            for (int j = i+1; j <=in.length(); j++) {
                // System.out.println("Substings");
                System.out.println(in.substring(i,j));
            }

        }
    }
}
*/
/* 
public class string{
    public static void main(String[]args){
        String a="hello";
        a=a.substring(0,2)+'y'+a.substring(3);
        //System.out.println(a);

        String s1="hello";
        String s2="hello";
        String s3=new String();
        s3="helo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));  //use equal rather than ==
    }
}
*/

//java string builder class--------------------------------------------------------------*

/* 
public class string{    //mutable higher performance than string
    public static void main(String[]args){
        StringBuilder str= new StringBuilder("HELLO");
        str.append(" Bini");
        System.out.println(str);
        str.insert(0,'k');
        System.out.println(str);
        str.setCharAt(5, 't');
        System.out.println(str);
         str.deleteCharAt(3);
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(0, 3);
        System.out.println(str);
        }
}
*/