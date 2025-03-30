package LinkedListInOne;

public class ReverseLL {
    public static void main(String[] args) {
        LinkedListClass ll = new LinkedListClass();
        ll.addNodeAtStart(10);
        ll.addNodeAtStart(20);
        ll.addNodeAtStart(30);
//        ll.addNodeAtStart(40);
//        ll.addNodeAtStart(50);
//        ll.addNodeAtStart(60);

//        Node h = reverseLL(ll.head);
//        Node temp = h;
//        while(temp != null)
//        {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
        System.out.println(ll);
        Node h = reverseLLRange(ll.head, 1,2);
        Node temp = h;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }


    }

    public static Node reverseLL(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        //Three pointer
        Node prev = head;
        Node current = head.next;
        Node currentNext = head.next.next;
        while(current != null)
        {
            current.next = prev;
            prev = current;
            current = currentNext;
            if(currentNext != null)
            {
                currentNext = currentNext.next;
            }
        }
        head.next = null;
        head = prev;
        return head;

    }

    public static Node reverseLLRange(Node head, int left, int right)
    {
        if(head == null || head.next == null || left==right)
        {
            return head;
        }
        //traverse till left
        int c =1;
        Node temp = head;
        Node p = head;
        while(c != left)
        {
            p = temp;
            temp = temp.next;
            c++;
        }

        //Three pointer
        Node prev = temp;
        Node current = temp.next;
        Node currentNext = temp.next.next;

        while(c != right)
        {
            current.next = prev;
             prev = current;
            current = currentNext;
            if(currentNext != null)
            {
                currentNext = currentNext.next;

            }
            c++;

        }
        p.next = prev;
        temp.next = current;
//        head = prev;
//        current.next = temp.next;
        return head;

    }
}
