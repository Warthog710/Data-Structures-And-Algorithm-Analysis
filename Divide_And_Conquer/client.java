import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class client
{
    public static void main (String args[])
    {
        //Random number variable.
        Random rand = new Random();

        //Randomly determine the length of the two arrays.
        int[] a = new int[rand.nextInt(50)];
        int[] b = new int[rand.nextInt(50)];

        //Randomly fill the two arrays.
        for (int count = 0; count < a.length; count++)
        {
            //Filling array a.
            a[count] = rand.nextInt(1000);
        }

        for (int count = 0; count < b.length; count++)
        {
            //Filling array b.
            b[count] = rand.nextInt(1000);
        }

        //Sorting the two arrays using Java Arrays.
        Arrays.sort(a);
        Arrays.sort(b);

        //Printing the two arrays.
        System.out.print("{ ");
        for (int count = 0; count < a.length; count++)
        {
            //Printing array a.
            System.out.print(a[count] + " ");
        }
        System.out.print("}\n");

        System.out.print("{ ");
        for (int count = 0; count < b.length; count++)
        {
            //Printing array b.
            System.out.print(b[count] + " ");
        }
        System.out.print("}\n\n");

        //Ask the user for what nth term they want to find.
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter the nth term you wish to find.");
        int response = myScan.nextInt();

        //Create a new object to find the nth term.
        divConADT DandC = new divideAndConquer();

        //Print the nth term.
        System.out.println(DandC.findTerm(a, b, response));
    }
}
