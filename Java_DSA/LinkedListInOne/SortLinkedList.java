package LinkedListInOne;

public class SortLinkedList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.push(6);
        l1.push(5);
        l1.push(9);
        l1.push(3);
        l1.push(8);
        l1.push(5);
        l1.head = sortList(l1.head);
        System.out.println(l1);

    }

    public static Node sortList(Node A) {

        if(A == null || A.next == null)
        {
            return A;
        }

        Node mid = findMid(A);

        //break into two list
        Node h1 = A;
        Node h2 = mid.next;
        mid.next = null;

        //merge sort

        h1 = sortList(h1);
        h2 = sortList(h2);

        //merge two lists

        Node res = merge(h1, h2);
        return res;
    }

    public static Node findMid(Node head)
    {
        if(head == null)
        {
            return head;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node merge(Node h1, Node h2)
    {
        if(h1 == null) return h2;
        if(h2 == null) return h1;

        Node ans = new Node(-1);
        Node temp = ans;
        while(h1 != null && h2 != null)
        {
            if(h1.data < h2.data)
            {
                temp.next = h1;
                temp = h1;
                h1 = h1.next;
            }
            else{

                temp.next = h2;
                temp = h2;
                h2 = h2.next;
            }
        }
        while(h1 != null)
        {
            temp.next = h1;
            temp = h1;
            h1 = h1.next;

        }
        while(h2 != null)
        {
            temp.next = h2;
            temp = h2;
            h2 = h2.next;
        }
        return ans.next;
    }

}

