public class factorial
{

    public static void main (String[] args)
    {
        int factStart = 10;

        int result;

        result = calculate(factStart);

        System.out.println(factStart + "! = " + result);

    }

    public static int calculate(int start)
    {
        if (start == 0)
            return 1;
        else
            return start * calculate(start - 1);
    }
}