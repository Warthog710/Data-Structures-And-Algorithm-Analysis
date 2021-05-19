// This array stack implementation can be used for any size.
public class ArrayStack<T> implements StackADT<T>
{
    private T stackArray[];
    private int size;

    //Class constructor
    public ArrayStack()
    {
        this.stackArray = (T[])new Object[10];
        this.size = 0;
    }

    //Pushes data unto the stack
    @Override
    public void push(T data)
    {
        if (this.size + 1 >= this.stackArray.length)
            increaseSize();

        //This line was used for debugging purposes.
        //System.out.println("Pushing: " + data);

        this.stackArray[size] = data;
        size++;
    }

    //Pops an element off the stack. Allowing it to be overwritten
    @Override
    public void pop()
    {
        if(!isEmpty())
        {
            //This line was used for debugging purposes.
            //System.out.println("Pop: " + this.stackArray[size - 1]);
            size--;
        }
        else
            System.out.println("Cannot pop from an empty stack.");
    }

    //Checks if the stack is empty. Returns true if it is empty
    @Override
    public boolean isEmpty()
    {
        if(size <= 0)
            return true;
        else
            return false;
    }

    //Returns the top item of the stack. DOESN'T DELETE
    @Override
    public T peek()
    {
        if(!isEmpty())
            return this.stackArray[size - 1];
        else
        {
            System.out.println("Cannot peek from an empty stack");
            return null;
        }
    }

    //Returns the current size of the stack
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

        for(int count = size - 1; count >= 0; count--)
        {
            result = result + this.stackArray[count].toString() + "\n";
        }

        return result;
    }

    //This internal method doubles the size of the stack if the limit is reached
    private void increaseSize()
    {
        T temp[] = (T[])new Object[this.stackArray.length * 2];

        for (int count = 0; count < size; count++)
        {
            temp[count] = this.stackArray[count];
        }

        this.stackArray = temp;
    }
}