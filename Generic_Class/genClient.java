public class genClient
{
    //Main class to execute
    public static void main(String[] args)
    {
        intTest();
        longTest();
        shortTest();
        byteTest();
        stringTest();
        charTest();
        boolTest();
        doubleTest();
        floatTest();
    }

    //Testing integer
    private static void intTest()
    {
        System.out.println("============");
        System.out.println("Testing Ints");
        System.out.println("============");

        genADT<Integer> test = new genericAdd(20, 20);
        System.out.println("20 + 20 = " + test.answer());
    }

    //Testing long
    private static void longTest()
    {
        System.out.println("\n=============");
        System.out.println("Testing Longs");
        System.out.println("=============");

        genADT<Long> test = new genericAdd(20000000, 40000000);
        System.out.println("20000000 + 40000000 = " + test.answer());
    }

    //Testing short
    private static void shortTest()
    {
        System.out.println("\n==============");
        System.out.println("Testing Shorts");
        System.out.println("==============");

        genADT<Short> test = new genericAdd(5, 5);
        System.out.println("5 + 5 = " + test.answer());
    }

    //Testing byte
    private static void byteTest()
    {
        System.out.println("\n============");
        System.out.println("Testing Byte");
        System.out.println("============");

        genADT<Byte> test = new genericAdd(2, 2);
        System.out.println("2 + 2 = " + test.answer());
    }

    //Testing string
    private static void stringTest()
    {
        System.out.println("\n==============");
        System.out.println("Testing String");
        System.out.println("==============");

        genADT<String> test = new genericAdd("Hello", " World.");
        System.out.println("Hello +  World. = " + test.answer());
    }

    //Testing char
    private static void charTest()
    {
        System.out.println("\n=================");
        System.out.println("Testing Character");
        System.out.println("=================");

        genADT<Character> test = new genericAdd('H', 'a');
        System.out.println("H + a = " + test.answer());
    }

    //Testing bool
    private static void boolTest()
    {
        System.out.println("\n===============");
        System.out.println("Testing Boolean");
        System.out.println("===============");

        genADT<Boolean> test = new genericAdd(true, false);
        System.out.println("true + false = " + test.answer());
    }

    //Testing double
    private static void doubleTest()
    {
        System.out.println("\n==============");
        System.out.println("Testing Double");
        System.out.println("==============");

        genADT<Double> test = new genericAdd(8.234515, 9.674233);
        System.out.println("8.234515 + 9.674233 = " + test.answer());
    }

    //Testing float
    private static void floatTest()
    {
        System.out.println("\n=============");
        System.out.println("Testing Float");
        System.out.println("=============");

        genADT<Float> test = new genericAdd(8.0, 9.0);
        System.out.println("8.0 + 9.0 = " + test.answer());
    }
}