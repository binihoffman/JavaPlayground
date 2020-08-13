public class FactorialRecursion {

    public static void main (String[] args)
    {
        System.out.println(calculateFactorial(0));
        System.out.println(calculateFactorial(1));
        System.out.println(calculateFactorial(3));
        System.out.println(calculateFactorial(10));
        System.out.println(calculateFactorial(30));
    }

    public static int calculateFactorial (int input)
    {
        if(input == 0)
            return 1;
        return input * calculateFactorial((input-1));
    }
}
