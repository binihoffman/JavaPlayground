
public class Anagram {
    //page 48 -1.4
    public static void main(String args[])
    {
        System.out.println(isAnagram("aba", "aab"));
        System.out.println(isAnagram("aaba", "abab"));
    }

    public static boolean isAnagram(String a, String b)
    {
        if (a == null && b == null)
            return true;
        if (a == null || b == null)
            return false;
        if (a.length() != b.length())
            return false;
        int array[] = new int[256];
        for (int i = 0; i < a.length(); i++)
        {
            int val = (int)a.charAt(i);
            array[val] =  array[val] + 1;
        }
        for (int j = 0; j < b.length(); j++)
        {
            int val = (int)b.charAt(j);
            array[val] =  array[val] - 1;
        }

        for (int u: array)
        {
            if (u != 0)
                return false;
        }

        return true;
    }
}
