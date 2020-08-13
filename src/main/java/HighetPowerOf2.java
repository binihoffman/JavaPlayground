public class HighetPowerOf2 {

    //https://www.geeksforgeeks.org/highest-power-2-less-equal-given-number/
    public static void main (String[] args)
    {
        System.out.println(calculatePower(10));
        System.out.println(calculatePower(19));
        System.out.println(calculatePower(32));
    }
    public static int calculatePower(int n)
    {
        int result = 1;
        while (result <= n)
            result = result *2;
        return result/2;
    }
}
