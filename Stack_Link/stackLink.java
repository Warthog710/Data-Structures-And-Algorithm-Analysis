public class stackLink<T> implements StackADT<T>
{
    private node head;
    private int size;

    //Class constructor
    public stackLink()
    {
        this.head = null;
        this.size = 0;
    }

    //Pushing data onto the stack
    @Override
    public void push(T data)
    {
        //Used for debugging purposes
        //System.out.println("Push: " + data);
        node temp = new node();

        temp.setData(data);
        temp.setNext(head);

        this.head = temp;
        this.size++;
    }

    //Popping data off top of stack
    @Override
    public void pop()
    {
        if (isEmpty())
            System.out.println("Cannot pop from an empty stack.");
        else
        {
            //Used for debugging purposes
            //System.out.println("Pop: " + head.getData());
            this.head = head.getNext();
            size--;
        }
    }

    //Returns the top value of the stack. DOESN'T DELETE
    @Override
    public T peek()
    {
        if (isEmpty())
        {
            System.out.println("Cannot peek from an empty stack.");
            return null;
        }
        return (T) this.head.getData();
    }

    //Return true if the stack is empty. Else, returns false
    @Override
    public boolean isEmpty()
    {
        if (size() <= 0)
            return true;
        else
            return false;
    }

    //Returns the current size of the stack
    @Override
    public int size()
    {
        return this.size;
    }

    //Defines output
    @Override
    public String toString()
    {
        String result = "\n";
        node current = this.head;

        while (current != null)
        {
            result = result + (current.getData()).toString() + "\n";
            current = current.getNext();
        }
        return result;
    }
}