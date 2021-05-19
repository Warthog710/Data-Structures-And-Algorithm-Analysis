import java.util.Random;

public class client
{
    public static void main (String[] args)
    {
        int[][] matrix = new int[10][10];
        int[] numbers = new int[100];
        int place = 0;

        Random rand = new Random();

        //Generate a random 10x10 matrix with repetition.
        while (place < 100)
        {
            int num = rand.nextInt(100);
            int repeat = rand.nextInt(10);

            for (int count = 0; count < repeat; count++)
            {
                if (place > 99)
                {
                    break;
                }

                numbers[place] = num;
                //System.out.print(numbers[place] + " ");
                place++;
            }
        }

        place = 0;

        //Save the generated matrix.
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[1].length; col++)
            {
                matrix[row][col] = numbers[place];
                place++;
            }

        }

        //Before compression, print matrix.
        System.out.println("Matrix layout before compression:");
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[1].length; col++)
            {
                System.out.print(String.format("%2s ", Integer.toString(matrix[row][col])));
            }
            System.out.println();
        }

        //Create new encode object.
        encodeADT temp = new encode(matrix);

        //Compress and print.
        temp.compress();
        System.out.println("\nMatrix after compression");
        System.out.println(temp);

        //Decompress
        matrix = temp.decompress();

        //After decompression
        System.out.println("\nMatrix after decompression");
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[1].length; col++)
            {
                System.out.print(String.format("%2s ", Integer.toString(matrix[row][col])));
            }
            System.out.println();
        }
    }
}
