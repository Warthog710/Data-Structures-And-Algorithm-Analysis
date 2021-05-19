import java.util.Random;

public class swap
{
    //Main method to execute
    public static void main(String[] args)
    {
        /*//Declaring variables
        int a = 20;
        int b = 30;
        int temp;

        //Printing initial state
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        //Swapping variables
        temp = a;
        a = b;
        b = temp;

        //Printing result
        System.out.println("A: " + a);
        System.out.println("B: " + b);*/
        int temp;

        //Create an array of 10 elements and randomly fill with 0 - 10, write a search that goes and finds five.
        int values[] = new int[10];

        //Declaring rand variable
        Random rand = new Random();

        //Filling array with random numbers
        for (int count = 0; count < values.length; count++)
        {
            temp = rand.nextInt(10);
            values[count] = temp;
        }

        //Searching loop...
        for (int count = 0; count < values.length; count++)
        {
            //If value equals five print it was found and break
            if (values[count] == 5)
            {
                System.out.println("A five was found at index: " + count);
            }
            //If at the last number print not found.
            if (count == values.length - 1)
            {
                System.out.println("End of array...");
            }
        }
    }

}