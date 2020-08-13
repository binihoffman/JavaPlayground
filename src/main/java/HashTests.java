import java.util.HashSet;

public class HashTests {

    public static void main (String[] args)
    {
        HashSet<Integer> hash = new HashSet<Integer>();
        hash.add(2);
        hash.add(1);

        hash.add(null);
        hash.add(1);
        System.out.println(hash.toString());
        for (Integer i: hash)
        {
            System.out.println("i - " + i);
        }
    }
}
