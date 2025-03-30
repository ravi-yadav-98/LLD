package Queue;

public class QueueClass {
    public static void main(String[] args) {
        QQueue q = new QQueue(5);
        q.enqueue(10);
        q.enqueue(102);
        q.enqueue(120);
        q.enqueue(1022);
        q.enqueue(22);

        q.dequeue();
        q.enqueue(11);
        while(!q.isEmpty())
        {
            System.out.print(q.dequeue() + " ");
        }


    }
}
class QQueue{
    int size =0;
    int f =-1;
    int r =-1;
    int cap;
    int[] arr;
    public QQueue(int c)
    {
        this.cap = c;
        arr = new int[cap];
    }
    //enqueue
    public void enqueue(int x)
    {
        if(size == cap)
        {
            System.out.println("Queue is full !!");
        }
        else
        {
            r = (r+1)%cap;
            arr[r] = x;
            size++;
        }
    }
    //dequeue
    public int dequeue()
    {
        if(size == 0)
        {
            System.out.println("Queue is Empty !!");
            return -1;
        }
        else
        {
            f = (f+1)%cap;
            size--;
            return arr[f];
        }
    }
    //front element
    public  int front()
    {
        if(size == 0)
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        else {
            return arr[(f+1)%cap];
        }
    }

    //isEmpty
    public boolean isEmpty()
    {
        return size == 0;
    }

}
