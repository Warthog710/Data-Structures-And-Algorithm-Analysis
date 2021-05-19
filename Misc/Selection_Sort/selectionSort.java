public class selectionSort implements selectionSortADT
{
    int[] sortArray;

    //Class constructor
    public selectionSort(int[] temp)
    {
        this.sortArray = temp;
    }

    @Override
    public void sort()
    {
        int min = 0;
        int location = 0;

        for (int count = 0; count < this.sortArray.length; count++)
        {
            for (int index = count; index < this.sortArray.length; index++)
            {
                //If at first index, set min. Or if the current value is smaller than min, set min.
                if (index == count || this.sortArray[index] < min)
                {
                    min = this.sortArray[index];
                    location = index;
                }
            }
            swap(count, location);
        }
    }

    //Swap the location of two variables in the array.
    private void swap(int count, int location)
    {
        int temp = this.sortArray[count];
        this.sortArray[count] = this.sortArray[location];
        this.sortArray[location] = temp;
    }

    @Override
    public String toString()
    {
        String printString = "";

        for (int count = 0; count < sortArray.length; count++)
        {
            printString = printString + sortArray[count] + " ";
        }
        return printString;
    }
}