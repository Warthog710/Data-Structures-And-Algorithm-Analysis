//Interface for queueArray
public interface queueADT<T>
{
    public void enqueue(T data);

    public void dequeue();

    public T first();

    public boolean isEmpty();

    public int size();

    public String toString();
}