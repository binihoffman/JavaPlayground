public class GCD_2_numbers {

    public static void main (String[] args)
    {
        System.out.println(calculateGcd(2,4));
        System.out.println(calculateGcd(75,25));
        System.out.println(calculateGcd(73,25));
    }

    public static int calculateGcd(int a, int b)
    {
        if (a == 0)
        {
            return b;
        }
        return calculateGcd(b % a, a);
    }
}
