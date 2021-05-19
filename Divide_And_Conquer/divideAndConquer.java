//This class will accept to arrays and calculate the nth largest term.
public class divideAndConquer implements divConADT
{
    //This method finds the nth largest term using an iterative algorithm
    //It assumes the arrays are sorted in ascending order.
    @Override
    public int findTerm(int[] one, int[] two, int term)
    {
        int eleOne = one.length - 1;
        int eleTwo = two.length - 1;
        int count = 0, max = 0;

        while (eleOne >= 0 || eleTwo >= 0)
        {
            //If count reaches the correct term. Return the value.
            if (count >= term)
            {
                return max;
            }
            else
            {
                //If the index for array one is less than 0. The next max can be found in two.
                if (eleOne < 0 && eleTwo >= 0)
                {
                    max = two[eleTwo];
                    eleTwo--;
                    count++;
                }
                //Else if, the index for array two is less than 0. The next max can be found in one.
                else if (eleTwo < 0 && eleOne >= 0)
                {
                    max = one[eleOne];
                    eleOne--;
                    count++;
                }
                //Else if, the value at one might be greater than or equal to the value at two.
                else if (one[eleOne] >= two[eleTwo])
                {
                    max = one[eleOne];
                    eleOne--;
                    count++;
                }
                //Else, the value at two must be greater than the value at one.
                else
                {
                    max = two[eleTwo];
                    eleTwo--;
                    count++;
                }
            }
        }

        //If the nth term couldn't be found. Return -1.
        return -1;
    }
}
