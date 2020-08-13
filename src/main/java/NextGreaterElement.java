import java.util.Arrays;
import java.util.LinkedList;

//https://www.geeksforgeeks.org/next-greater-element/
public class NextGreaterElement {

    public static void main (String[] args)
    {
        int[] test = {2,5,4,8};

        System.out.println(Arrays.toString(greaterElements(test)));

    }

    public static int[] greaterElements(int[] input)
    {
        int[] results = new int[input.length];
        boolean found = false;
        for (int i = 0; i< input.length; i++)
        {
            for (int j = i+1; j < input.length; j++)
            {
                found = false;
                if (input[j] > input[i])
                {
                    results[i] = input[j];
                    found = true;
                    break;
                }
                if (!found)
                    results[i] = -1;
            }
        }
        results[input.length -1] = -1;
        return results;
    }

    //TODO: didn't implement below well
    public static int[] betterGreaterElement(int[] input)
    {
        LinkedList<Integer> q = new LinkedList<Integer>();
        int[] result = new int[input.length];
        int next;
        q.push(input[0]);
        for(int i = 1; i < input.length; i++)
        {
            next = input[0];
            while (!q.isEmpty())
            {
                if (next > q.pop())
                    System.out.println("--" + next);
            }
        }
        return null;
    }
}
