public class PalindromeNumber {
    //https://www.geeksforgeeks.org/check-if-a-number-is-palindrome/
    static int rev_num = 0;
    static int base_pos = 1;
    public static void main(String args[])
    {
        rev_num = 0;
        base_pos = 1;
        System.out.println(isPalindrome(1234));
        rev_num = 0;
        base_pos = 1;
        System.out.println(isPalindrome(1234321));
        rev_num = 0;
        base_pos = 1;
        System.out.println(isPalindrome(1));
        rev_num = 0;
        base_pos = 1;
        System.out.println(reversInt(1234321));
        rev_num = 0;
        base_pos = 1;
        System.out.println(reversInt(3456));
    }
    public static boolean isPalindrome(int input)
    {
        if (input < 10 && input >=0)
            return true;
        return (reversInt(input) == input);
    }


    public static int reversInt(int input)
    {
        if (input > 0){
            reversInt(input / 10);
            rev_num += (input % 10) * base_pos;
            base_pos *= 10;
        }
        return rev_num;
    }
}
