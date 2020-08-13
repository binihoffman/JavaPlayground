import java.util.Arrays;

public class RemoveDuplicates {
    //page 48 -1.3
    public  static  void main (String args[])
    {
        char a[] = new char[]{'a','a','b'};
        char b[] = new char[]{'a','a','a'};
        System.out.println(removeDups(b));
    }

    public static char[] removeDups(char[] input)
    {
        int current = 1;
        Arrays.sort(input);
        char curchar = input[0];
        for (char c: input)
        {
            if (current < input.length && c == input[current])
            {
                input[current] = '\0';
                current++;

            }
            else
            {
                current++;
            }
        }
        return input;
    }
}
