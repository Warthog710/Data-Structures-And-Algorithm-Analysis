import java.util.*;
import java.io.*;

public class mazeClient
{
    public static void main(String[] args) throws IOException
    {
        //Asking user to define maze file name/path
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the name of the file containing the maze: ");
        String filename =  input.nextLine();


        //Trying to find file
        try
        {
            //Creating maze solver object and printing current state of maze
            mazeADT maze = new maze(filename);
            System.out.println(maze);
            mazeSolver mSolve = new mazeSolver(maze);

            //Solving maze, passing start location
            mSolve.traverse(0, 0);

            //If successfully solved
            if (mSolve.done)
            {
                System.out.println("Solution found! (3 = tried, 2 = path)");
                System.out.println(maze);
                System.out.println(mSolve);
            }
            //Else
            else
            {
                System.out.println("No solution found... (3 = tried, 2 = path)");
                System.out.println(maze);
            }
        }
        //If an invalid file name is entered the program will exit
        catch (Exception e)
        {
            System.out.println("Exiting program...");
        }
    }
}