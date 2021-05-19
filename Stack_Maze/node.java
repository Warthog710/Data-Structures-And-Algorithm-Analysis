//This class defines each node on the stack
public class node<T>
{
    private node<T> next;
    private T data;

    //Class constructor
    public node()
    {
        this.next = null;
        this.data = null;
    }

    //Sets the data to the received value
    public void setData(T data)
    {
        this.data = data;
    }

    //Sets next to the received address
    public void setNext(node<T> location)
    {
        this.next = location;
    }

    //Returns the current value of data
    public T getData()
    {
        return this.data;
    }

    //Returns the current saved address of the next node.
    //Note, set to NULL if no further elements exist
    public node<T> getNext()
    {
        return this.next;
    }
}