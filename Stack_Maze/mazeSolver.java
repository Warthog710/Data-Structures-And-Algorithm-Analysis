public class mazeSolver {
    private mazeADT solveMaze;
    private StackADT<position> stack = new stackLink<position>();
    boolean done = false;

    //Setting the saved maze to the one to be solved
    public mazeSolver(mazeADT sMaze)
    {
        this.solveMaze = sMaze;
    }

    //Traverses the maze
    public void traverse(int x, int y)
    {

        //Push current location to stack.
        position current = new position(x, y);
        stack.push(current);

        //Set the current location as tried
        solveMaze.setTry(x, y);

        //Check if current location is the end
        if ((x == solveMaze.getRows() - 1 && y == solveMaze.getColumns() - 1))
            done = true;


        //Check all possible moves
        if (solveMaze.checkValid(x - 1, y) && !done)
            traverse(x - 1, y);

        if (solveMaze.checkValid(x + 1, y) && !done)
            traverse(x + 1, y);

        if (solveMaze.checkValid(x, y - 1) && !done)
            traverse(x, y - 1);

        if (solveMaze.checkValid(x, y + 1) && !done)
            traverse(x, y + 1);

        //If all moves have been checked return to the last call.
        if (!done)
            stack.pop();
        //While recursive stack is collapsing note all valid moves
        else
            solveMaze.setPath(x, y);
    }

    //Defines output
    public String toString()
    {
        String result = "";
        position pos;

        while (!stack.isEmpty())
        {
            pos = stack.peek();
            stack.pop();
            result = result + "(" + pos.getx() + ", " + pos.gety() + ")\n";
        }
        return result;
    }
}