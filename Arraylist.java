import java.util.ArrayList;
import java.util.Collections;
/* 
public class Arraylist {
    public static void main(String[] args) {
        // Integer i=Integer.valueOf(4);
        // System.out.println(i);

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        char[] li;
        // for(int i=0;i<l1.size();i++){
        // System.out.println(l1.get(i));
        // }
        // System.out.println(l1);
        l1.add(0, 9); // adding element at index
        l1.set(1, 8); // setting element at index
        l1.remove(1); // removing element at index
        l1.remove(Integer.valueOf(5)); // removing -- element

        // to check if arraylist contains the element

        boolean ans = l1.contains(Integer.valueOf(3));
        System.out.println(ans);

        System.out.println(l1);
    }
}

*/

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(4);
        a1.add(2);
        a1.add(9);
        a1.add(4);
        a1.add(3);
        // System.out.println("original list");
        // System.out.println(a1);
        // Collections.reverse(a1);  //reversing using method-----------------------*
        // System.out.println("Reversed list");
        // System.out.println(a1);


        //sorting
        Collections.sort(a1);
        System.out.println("Sorting in ascending order");
        System.out.println(a1); //sorting in ascending order

        Collections.sort(a1,Collections.reverseOrder());
        System.out.println("In descending order");
        System.out.println(a1);
    }
}