
public class linkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;{

        }
    }

    //displaying using recursion
    public static void recursive(Node head){
        if(head == null){
            return;
        }
        System.out.println(head.data);
        recursive(head.next);
    }
public static void main(String[]args){
    Node n1=new Node(5);
    System.out.println(n1.next);
    Node n2=new Node(6);
    Node n3=new Node(7);
    Node n4=new Node(8);
    Node n5=new Node(9);
    Node n6=new Node(1);
    n1.next=n2;
    n2.next=n3;
    n3.next=n4;
    n4.next=n5;
    n5.next=n6;
    System.out.println(n1.data);
    System.out.println(n2.next);
    System.out.println(n1);

    //printing

    // System.out.println(n1.data);
    // System.out.println(n1.next.data);
    // System.out.println(n1.next.next.data);
    // System.out.println(n1.next.next.next.data);
    // System.out.println(n1.next.next.next.next.data);
     

    //printing using loop
// Node temp=n1;
//     while(temp!=null){
//         System.out.println(temp.data);
//         temp=temp.next;
//     }

    //displaying linked list recursively
recursive(n1);

}
}
}