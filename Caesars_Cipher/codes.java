import queue.*;

//This class stores, encodes, and decodes messages
public class codes implements codesADT
{
    private static int[] key = {3, 1, 7, 4, 2, 5};
    queueADT<Integer> encodingQueue = new queueArray<>();
    queueADT<Integer> decodingQueue = new queueArray<>();
    private String encoded = "";
    private String decoded = "";

    //Class constructor
    public codes()
    {
        for (int count = 0; count < key.length; count++)
        {
            encodingQueue.enqueue(key[count]);
            decodingQueue.enqueue(key[count]);
        }
    }

    //This method encodes a string
    @Override
    public void encode(String toCode)
    {
        int keyValue;

        for (int count = 0; count < toCode.length(); count++)
        {
            keyValue = encodingQueue.first();
            encodingQueue.dequeue();
            this.encoded += (char) (toCode.charAt(count) + keyValue);
            encodingQueue.enqueue(keyValue);
        }
    }

    //This method decodes a string
    @Override
    public void decode()
    {
        int keyValue;

        for (int count = 0; count < encoded.length(); count++)
        {
            keyValue = decodingQueue.first();
            decodingQueue.dequeue();
            this.decoded += (char) (encoded.charAt(count) - keyValue);
            decodingQueue.enqueue(keyValue);
        }
    }

    //Returns encoded
    @Override
    public String getEncoded()
    {
        return encoded;
    }

    //Returns decoded
    @Override
    public String getDecoded()
    {
        return decoded;
    }
}