import java.util.Stack;

public class Client
{
    //Main class to execute
    public static void main(String[] args)
    {
        testPush9Elems();
        testSimplePopElems();
        testMultiplePopsElems();
        testEmpty();
        testPrint();
    }

    //Testing push
    private static void testPush9Elems()
    {
        System.out.println("=======================================");
        System.out.println("Testing pushing 9 elements to the Stack");
        System.out.println("=======================================");
        StackADT<Integer> stack = new stackLink<Integer>();

        for (int i = 0; i < 9; i++)
        {
            stack.push(i);
        }

        System.out.println(stack);
    }

    //Testing a single pop
    private static void testSimplePopElems()
    {
        System.out.println("\n============================================");
        System.out.println("Testing calling one pop method for the Stack");
        System.out.println("============================================");
        StackADT<Integer> stack = new stackLink<Integer>();

        for (int i = 0; i < 9; i++)
        {
            stack.push(i);
        }

        System.out.println(stack);
        int lastElement = stack.peek();
        stack.pop();
        System.out.println("The last element should be an 8 and is: " + lastElement);
        System.out.println(stack);
    }

    //Testing multiple pops
    private static void testMultiplePopsElems()
    {
        System.out.println("\n==================================================");
        System.out.println("Testing calling multiple pops method for the Stack");
        System.out.println("==================================================");
        StackADT<Integer> stack = new stackLink<Integer>();

        for (int i = 0; i < 9; i++)
        {
            stack.push(i);
        }

        System.out.println(stack);

        int eight = stack.peek();
        stack.pop();
        System.out.println("Eight: " + eight);
        System.out.println(stack);

        int seven = stack.peek();
        stack.pop();
        System.out.println("Seven: " + seven);
        System.out.println(stack);

        int six = stack.peek();
        stack.pop();
        System.out.println("Six: " + six);
        System.out.println(stack);
    }

    //Test isEmpty
    private static void testEmpty()
    {
        System.out.println("\n==================================");
        System.out.println("Testing empty method for the Stack");
        System.out.println("==================================");
        StackADT<Integer> stack = new stackLink<Integer>();

        System.out.println("\nisEmpty() should be true and is: " + stack.isEmpty());
        System.out.println(stack);

        stack.push(90);
        System.out.println("isEmpty() should be false and is: " + stack.isEmpty());
        System.out.println(stack);

        stack.pop();
        System.out.println("isEmpty() should be true and is: " + stack.isEmpty());
        System.out.println(stack);
    }

    //Testing print
    private static void testPrint()
    {
        System.out.println("\n========================");
        System.out.println("Testing printing a Stack");
        System.out.println("========================");
        StackADT<Integer> stack = new stackLink<Integer>();

        for (int i = 0; i < 4; i++)
        {
            stack.push(i);
        }

        System.out.println(stack);
    }
}