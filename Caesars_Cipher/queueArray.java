//This class defines an array based queue of infinite size.
public class queueArray<T> implements queueADT<T>
{
    private T qArray[];
    private int size;

    //Class constructor
    public queueArray()
    {
        this.qArray = (T[]) new Object[10];
        this.size = 0;
    }

    //Enqueues a piece of data
    @Override
    public void enqueue(T data)
    {
        if(size + 1 == qArray.length)
            increaseSize();

        this.qArray[size] = data;
        size++;
    }

    //Removes the front item from the queue. DOES NOT RETURN
    @Override
    public void dequeue()
    {
        if (isEmpty())
            System.out.println("Cannot dequeue from an empty queue.");
        else
        {
            for(int count = 0; count < this.size; count++)
            {
                this.qArray[count] = this.qArray[count + 1];
            }
            size--;
        }
    }

    //Returns the item in the front of the queue. DOESN'T DELETE
    @Override
    public T first()
    {
        if(isEmpty())
        {
            System.out.println("Cannot get the first element while the queue is empty.");
            return null;
        }
        else
            return this.qArray[0];
    }

    //Returns true if queue is empty. Else false.
    @Override
    public boolean isEmpty()
    {
        if(size <= 0)
            return true;
        else
            return false;
    }

    //Returns the current size of the queue
    @Override
    public int size()
    {
        return this.size;
    }

    //Defines the output
    @Override
    public String toString()
    {
        String result = "\n";

        for (int count = this.size - 1; count >= 0; count--)
        {
            result = result + qArray[count].toString() + " ";
        }
        return result + "\n";
    }

    //Increases the size of the array if necessary
    private void increaseSize()
    {
        T temp[] = (T[])new Object[this.qArray.length * 2];

        for (int count = 0; count < size; count++)
        {
            temp[count] = this.qArray[count];
        }
        this.qArray = temp;
    }
}