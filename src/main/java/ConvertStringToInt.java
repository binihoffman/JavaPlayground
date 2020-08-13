public class ConvertStringToInt {

    public static void main (String[] args)
    {
        System.out.println("9 is - " + (int)"9".charAt(0));
        System.out.println("0 is - " + (int)"0".charAt(0));
        System.out.println(convert("1"));
        System.out.println(convert("11"));
        System.out.println(convert("798759874"));
    }

    public static int convert(String s)
    {
        int result = 0;
        int value = 0;
        for (int i = 0; i < s.length(); i++)
        {
            value = (int)s.charAt(i) - 48;
            result = result * 10 + value % 10;
        }
        return result;
    }
}
