public class CountSetBits {

    public static void main (String[] args)
    {
        System.out.println(csb(2));
        System.out.println(csb(6));
        System.out.println(csb(8));
        System.out.println(csb(32));
    }

    static int res = 0;
    public static int csb(int a)
    {
        if (a == 0)
            return 0;
        return (a % 2 == 0 ? 0 : 1) + csb(a / 2);
    }
}
