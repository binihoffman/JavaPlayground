public class Replace0With5Integere {

    //https://www.geeksforgeeks.org/replace-0-5-input-integer/

    public static void main(String[] args)
    {
        System.out.println(replace(102));
        System.out.println(replace(1002));
        System.out.println(replace(102005));
    }

    public static int replace(int input)
    {
        if (input == 0)
            return 0;
        int digit = input % 5 ;
        if (digit == 0)
            digit =5;
        else
            digit = digit;
        return (digit + 10 * replace(input/10));
    }
}
