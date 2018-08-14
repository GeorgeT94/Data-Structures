import java.util.Arrays;

public class MyStack<E>{

    private E[] data;
    private int initialCapacity = 10;
    private int capacity;
    private int size = 0;
    private int topOfStack = -1;

    public MyStack(){
        capacity = initialCapacity;
        data = (E[]) new Object[capacity];
    }

    public void increaseStack(){
        capacity = capacity *2;
        data = Arrays.copyOf(data, capacity);
    }

    public void push(E element){
        data[size] = element;
        size++;
        topOfStack++;
        if(size > capacity){
            increaseStack();
        }
    }

    public E peek(){
        return data[topOfStack];
    }
    public E pop(){
        E returnValue = peek();
        data[topOfStack] = null;

        topOfStack--;
        size--;
        return returnValue;
    }
}