public class NthFibonachi {

    //page 64 - 8.1
    public static int calculatethFibo(int input)
    {
        if (input == 0)
            return 0;
        if (input == 1)
            return 1;
        else
        {
            return calculatethFibo(input - 1) + calculatethFibo(input - 2);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(calculatethFibo(5));
        System.out.println(calculatethFibo(3));
        System.out.println(calculatethFibo(1));
        System.out.println(calculatethFibo(12324));
    }
}
