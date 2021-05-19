import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//This class loads a maze and includes several methods for checking and updating values
public class maze implements mazeADT
{
    private int columns, rows;
    private int[][] mazeArray;

    //This constructor loads a file into the class
    public maze(String filename) throws IOException
    {
       try
       {
            Scanner myReader = new Scanner(new File (filename));

            this.rows = myReader.nextInt();
            this.columns = myReader.nextInt();

            this.mazeArray = new int[rows][columns];

            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < columns; j++)
                {
                    this.mazeArray[i][j] = myReader.nextInt();
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("The file could not be found.");
        }
    }

    //Defines output
    @Override
    public String toString()
    {
        String result = "";

        for (int i = 0; i < this.rows; i++)
        {
            for (int j = 0; j < this.columns; j++)
            {
                result = result + this.mazeArray[i][j] + " ";
            }
            result = result + "\n";
        }
        return result;
    }

    @Override
    public void setTry(int row, int col)
    {
        this.mazeArray[row][col] = 3;
    }

    @Override
    public int getRows()
    {
        return this.mazeArray.length;
    }

    @Override
    public int getColumns()
    {
        return this.mazeArray[0].length;
    }

    @Override
    public void setPath(int row, int col)
    {
        this.mazeArray[row][col] = 2;
    }

    @Override
    public boolean checkValid(int row, int col)
    {
        boolean result = false;

        //Checking if out of bounds
        if (row >= 0 && row < this.mazeArray.length && col >= 0 && col < this.mazeArray[row].length)
        {
            if (mazeArray[row][col] == 1)
            {
                result = true;
            }
        }
        return result;
    }
}