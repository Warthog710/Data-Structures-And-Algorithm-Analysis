import java.util.Scanner;

public class client
{
    public static void main(String[] args)
    {
        codesADT encoder = new codes();

        //Asking user to enter message to be encoded.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the message you want to be encoded: ");
        String message = input.nextLine();

        //Encoding and Decoding the message
        encoder.encode(message);
        encoder.decode();

        //Demonstrating functionality
        System.out.println("Original: " + message);
        System.out.println("Encoded: " + encoder.getEncoded());
        System.out.println("Decoded: " + encoder.getDecoded());
    }
}