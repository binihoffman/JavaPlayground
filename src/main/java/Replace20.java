import java.util.Arrays;

public class Replace20 {
    //page 48 -1.5
    public static void main(String args[]) {
        System.out.println(replace20("gggg ggg ggg"));
    }

    public static String replace20(String input)
    {
        int spaces = 0;
        int arind = 0;
        for (int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) == ' ')
                spaces++;
        }
        char[] arr = new char[input.length() - spaces + spaces*3];
        for (int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) == ' ')
            {
                arr[arind] = '%';
                arr[arind + 1] = '2';
                arr[arind + 2] ='0';
                arind = arind + 3;
            }
            else
            {
                arr[arind] = input.charAt(i);
                arind++;
            }

        }
        return Arrays.toString(arr);
    }
}