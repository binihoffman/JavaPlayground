public class ReverseArray {

    public static void main (String[] args)
    {
        //['a', 'b', 'c'] --> ['c', 'b', 'a']

        System.out.println(reverseArray(new char[]{'a', 'b', 'c'}));
        System.out.println(reverseArray(new char[]{'a', 'b', 'c', 'd'}));
        System.out.println(reverseArray(new char[]{'a'}));
        System.out.println(reverseArray(new char[]{}));
    }

    public static char[] reverseArray(char[] input)
    {
        if (input.length <= 1)
            return input;

        char temp;
        int end = input.length - 1;

        for (int i = 0; i < input.length / 2; i++)
        {
            temp = input[i];
            input[i] = input[end];
            input[end] = temp;
            end--;
        }

        return input;
    }
}
