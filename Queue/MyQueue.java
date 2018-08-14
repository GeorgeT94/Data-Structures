import java.util.Arrays;

public class MyQueue{
    private Node head;
    private Node tail;

    public boolean isEmpty(){
        return head == null;
    }

    public int peek(){
        return head.data;
    }

    public void enqueue(int data){
        Node node = new Node(data);

        if(tail != null){
            tail.next = node;
        }
        tail = node;

        if( head == null){
            head = node;
        }
    }

    public int dequeue(){
        headData = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return headData;
    }

}