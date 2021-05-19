//Interface for encode.
public interface encodeADT
{
    //This function compress the matrix passed in the class constructor.
    void compress();

    //This function decompresses the compressed string and returns the original matrix.
    int[][] decompress();

    //Allows printing...
    String toString();
}
