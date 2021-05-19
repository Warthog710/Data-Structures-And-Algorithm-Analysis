import java.util.Random;

public class binarySearch
{
    //Driver code
    public static void main(String[] args)
    {
        //This array holds test values to test the solution.
        int testArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, number;

        //Random generator
        Random rand = new Random();

        //Tests the method 10 times with randomly generated values in range of 0-19
        for (int count = 0; count < 10; count++)
        {
            number = rand.nextInt(20);
            if (binSearch(testArray, number))
                System.out.println("Found: " + number + "\n");
            else
                System.out.println("Did not Find: " + number + "\n");
        }
    }

    public static boolean binSearch(int[] searchArray, int searchTerm)
    {
        //These variables hold the length, start point, and middle point of the passed array.
        int max = searchArray.length - 1;
        int min = 0;
        int mid;

        //Iterates until min is greater than max
        while(min <= max)
        {
            //Calculating middle value
            mid = (min + max) / 2;

            //If searchTerm equals the current middle point
            if(searchTerm == searchArray[mid])
                return true;
            //If searchTerm is greater than the current middle point
            else if(searchTerm > searchArray[mid])
                min = mid + 1;
            //Else, searchTerm must be smaller than the current middle point
            else
                max = mid - 1;
        }
        //If nothing was found return false
        return false;
    }
}
