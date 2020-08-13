public class GCD_array {

    public static void main(String[] args)
    {
       Integer[] input1 = {2 ,4 ,6 ,8};
       System.out.println(calculateGcdArray(input1));
       Integer[] input2 = {12 ,9 ,6 ,8};
       System.out.println(calculateGcdArray(input2));
    }

    private static int calculateGcd(int a, int b)
    {
        if (a == 0)
        {
            return b;
        }
        return calculateGcd(b % a, a);
    }

    public static int calculateGcdArray(Integer[] input)
    {
        int result = input[0];
        for (int i = 1; i < input.length; i++)
        {
            result = calculateGcd(input[i], result);
        }
        return  result;
    }
}
