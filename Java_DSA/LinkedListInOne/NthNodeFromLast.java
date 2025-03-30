package LinkedListInOne;

public class NthNodeFromLast {
    public static void main(String[] args) {
        //Nth node from last
        LinkedList ll = new LinkedList();
        ll.push(1);
        ll.push(12);
        ll.push(22);
        ll.push(123);
        ll.push(110);
        System.out.println(ll.getLength());
    }
    public static int getNthNodeFromLast(Node head, int n){
        //create dummy node
        Node dummy = new Node(-1);
        dummy.next = head;
        return 0;
    }

}
