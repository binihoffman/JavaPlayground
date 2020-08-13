import java.lang.reflect.Array;

//page 48 -1.1
public class StringUnique {
    public static void main(String[] args)
    {
       hasAllUnique(null);

    }

    public static boolean hasAllUnique(String input)
    {
        if (input == null)
        {
            System.out.println("True");
            return true;
        }
        Integer[] array = new Integer[256];
        for (int i = 0; i < input.length(); i++)
        {
            int value = (int) input.charAt(i);
            if (array[value] != null)
            {
                System.out.println("False");
                return false;
            }
            else
            {
                array[value] = value;
            }
        }
        System.out.println("True");
        return true;

    }

}
