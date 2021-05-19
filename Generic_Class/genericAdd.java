//This class takes a generic type and adds them together depending on type received
public class genericAdd<T> implements genADT
{
    private String sum;

    //Class constructor
    public genericAdd(T num1, T num2)
    {
        if (num1 instanceof Integer || num1 instanceof Short || num1 instanceof Long || num1 instanceof Byte) {
            int result = ((Integer) num1) + ((Integer) num2);
            sum = Integer.toString(result);
        }

        else if (num1 instanceof Float) {
            Float result = ((Float) num1) + ((Float) num2);
            sum = Float.toString(result);
        }

        else if (num1 instanceof Double) {
            Double result = ((Double) num1) + ((Double) num2);
            sum = Double.toString(result);
        }

        else if (num1 instanceof Character || num1 instanceof String || num1 instanceof Boolean) {
            String result = num1.toString() + num2.toString();
            sum = result;
        }
    }

    //This method returns the sum
    @Override
    public String answer()
    {
        return sum;
    }
}