public class encode implements encodeADT
{
    //The passed matrix will be saved in this data array and then compressed.
    String data[];

    //Save the dimensions of the matrix.
    int row, col;

    //Class constructor
    public encode(int[][] matrix)
    {
        this.row = matrix.length;
        this.col = matrix[0].length;

        data =  new String[matrix.length * matrix[0].length];
        int place = 0;

        //Take matrix, and convert to a string array.
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                data[place] = Integer.toString(matrix[row][col]);
                place++;
            }
        }
    }

    //Compress string array.
    @Override
    public void compress()
    {
        String temp;
        String[] tempArray;
        int numRepeat = 0;
        int place;

        for (int count = 0; count < data.length; count++)
        {
            temp = data[count];
            place = count;

            //Look for repeats.
            while (data[count].equals(temp))
            {
                numRepeat++;

                //Note, a maximum of 9 repeats will be detected.
                if (place + 1 > data.length - 1 || numRepeat > 8)
                {
                    break;
                }

                place++;
                temp = data[place];
            }

            //If the number of repeats is greater than 2, space can be saved.
            if (numRepeat > 2)
            {
                //Replace next string with a special value.
                switch(numRepeat)
                {
                    //If the number of repeats is three.
                    case 3:
                        //Set the next location to !.
                        data[count + 1] = "!";
                        break;

                    case 4:
                        data[count + 1] = "@";
                        break;

                    case 5:
                        data[count + 1] = "$";
                        break;

                    case 6:
                        data[count + 1] = "%";
                        break;

                    case 7:
                        data[count + 1] = "^";
                        break;

                    case 8:
                        data[count + 1] = "&";
                        break;

                    case 9:
                        data[count + 1] = "*";
                        break;
                }

                //Create a temp array that is smaller by the number of repeats.
                tempArray = new String[(data.length - numRepeat) + 2];
                place = 0;

                //Copy the array, minus the repeats.
                for (int index = 0; index < tempArray.length; index++)
                {
                    if (index == count + 2)
                    {
                        place = (index + numRepeat) - 2;
                    }
                    tempArray[index] = data[place];
                    place++;
                }

                data = new String[tempArray.length];

                //Copy temp into data.
                for (int index = 0; index < tempArray.length; index++)
                {
                    data[index] = tempArray[index];

                }
            }
            numRepeat = 0;
        }
    }

    //Returns the decompressed matrix from a string array.
    @Override
    public int[][] decompress()
    {
        int place = 0;
        int[][] matrix = new int[row][col];

        //For the length of the string array.
        for (int count = 0; count < data.length; count++)
        {
            //Looking for special characters... If found, call the expand function.
            switch (data[count])
            {
                //If !, expand is called with 1, meaning I need to expand the array by 1.
                case "!":
                    expand(count, 1);
                    //Set count to the next location after the expansion.
                    count += 2;
                    break;

                case "@":
                    expand(count, 2);
                    count += 3;
                    break;

                case "$":
                    expand(count, 3);
                    count += 4;
                    break;

                case "%":
                    expand(count, 4);
                    count += 5;
                    break;

                case "^":
                    expand(count, 5);
                    count += 6;
                    break;

                case "&":
                    expand(count, 6);
                    count += 7;
                    break;

                case "*":
                    expand(count, 7);
                    count += 8;
                    break;
            }
        }

        //Convert uncompressed string back into a matrix.
        for (int row = 0; row < this.row; row++)
        {
            for (int col = 0; col < this.col; col++)
            {
                matrix[row][col] = Integer.parseInt(data[place]);
                place++;
            }
        }
        //Return the matrix.
        return matrix;
    }

    //This method expands an existing array by adding a certain number of repeat values.
    private void expand(int location, int number)
    {
        //Set replace value.
        String replace = data[location - 1];

        //Create temp array.
        String[] tempArray = new String[data.length + number];

        int place = 0;

        for (int count = 0; count < tempArray.length; count++)
        {
            //When the location where the repeat is reached...
            if (count == location)
            {
                //Repeat the number the desired times...
                for (int index = 0; index <= number; index++)
                {
                    tempArray[count] = replace;
                    count++;
                }
                //If at end, return.
                if (place == data.length)
                {
                    return;
                }
                //Else, move to the next place.
                else
                {
                    place++;
                }
            }

            //If place is not equal to the end of the array.
            if (place != data.length)
            {
                //Copy data into temp array.
                tempArray[count] = data[place];
                place++;
            }
        }

        data = new String[tempArray.length];

        //Copy tempArray into data
        for (int count = 0; count < tempArray.length; count++)
        {
            data[count] = tempArray[count];
        }
    }

    //Overridden toString method.
    @Override
    public String toString()
    {
        String temp = "";

        for (int count = 0; count < data.length; count++)
        {
            temp += data[count] + " ";
        }
        return temp;
    }
}
