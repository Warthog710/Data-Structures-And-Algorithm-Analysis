public class client
{
    public static void main(String[] args)
    {
        //Test Array to use for the sort.
        int[] temp = {10, 5, 7, 1, 3, 4, 8, 6, 9, 2};

        //Creating sort object and passing temp.
        selectionSortADT sortMe = new selectionSort(temp);

        //NOTE: Because the array name is technically an address it is passed by reference. Therefore the
        //original memory location is changed and it is not necessary to overwrite.

        System.out.println("Selection Sort Example:\n\nBefore sort:");
        System.out.println(sortMe);

        //Call the sort method.
        sortMe.sort();

        System.out.println("After sort:");
        System.out.println(sortMe);
    }
}