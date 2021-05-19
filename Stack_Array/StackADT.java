//Interface for ArrayStack
public interface StackADT<T> {

    public void push(T data);

    public void pop();

    public T peek();

    public boolean isEmpty();

    public int size();

    public String toString();
}