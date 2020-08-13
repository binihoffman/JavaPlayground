public class StartsEndEndsWith1 {

    //https://www.geeksforgeeks.org/given-binary-string-count-number-substrings-start-end-1/
    public static void main(String[] args)
    {
        System.out.println(countOnesStrings("001001"));
        System.out.println(countOnesStrings("00100101"));
        System.out.println(countOnesStrings("001001011"));
        System.out.println(countOnesStrings("001001010101010101010"));
    }

    public static int countOnesStrings(String input)
    {
        int count = 0;
        int result = 0;
        for (int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) == '1') {
                count++;
                result = 1;
            }
        }
        System.out.println("count is - " + count);
//        for (int i = 1; i < count; i++)
//        {
//            result = result * i;
//        }
        return count*(count-1)/2;
    }
}
