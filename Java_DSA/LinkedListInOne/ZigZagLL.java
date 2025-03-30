package LinkedListInOne;

public class ZigZagLL {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.push(1);
        l1.push(2);
        l1.push(3);
        l1.push(4);
        l1.push(5);
        LinkedList l2 = new LinkedList();
        l2.push(6);
        l2.push(7);
        l2.push(8);
        l2.push(9);
        l2.push(9);



        Node h = merge(l1.head, l2.head);
        Node temp = h;
        while(temp != null)
        {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }

    }
    public static Node merge(Node h1, Node h2)
    {
        //LL 1 pointer
        Node curr = h1;
        //LL 2 pointer
        Node temp = h2;

        while(h2 != null)
        {
            temp = h2;
            h2 = h2.next;
            temp.next = curr.next;
            curr.next = temp;
            curr = temp.next;
        }
        return h1;
    }
}

