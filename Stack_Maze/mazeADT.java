//Class interface for maze.java
public interface mazeADT
{
    public String toString();

    public void setTry (int row, int col);

    public int getRows();

    public int getColumns();

    public void setPath(int row, int col);

    public boolean checkValid(int row, int col);
}