public class ReverseInt {
    public static void main (String[] args)
    {
        System.out.println(reverse(25));
        Integer yy = new Integer(56);
        //System.out.println(Integer(56));

    }
    static int result = 0;
    public static int reverse(int input)
    {
        while (input > 0)
        {
            result = result * 10 + (input%10);
            input = input/10;
        }
        return result;
    }
}
