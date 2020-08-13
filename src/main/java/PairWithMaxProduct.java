import java.util.Arrays;

public class PairWithMaxProduct {

    //https://www.geeksforgeeks.org/return-a-pair-with-maximum-product-in-array-of-integers/
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,6};
        int[] b = {-1, -3, -4, 2, 0, -5};
        System.out.println(Arrays.toString(findMaxProduct(a)));
        System.out.println(Arrays.toString(findMaxProduct(b)));
        System.out.println(Arrays.toString(betterFindMaxProduct(a)));
        System.out.println(Arrays.toString(betterFindMaxProduct(b)));
    }

    public static int[] findMaxProduct(int[] input)
    {
        int[] rs = new int[2];
        Arrays.sort(input);
        int a = input[0];
        int b = input[1];

        int c = input[input.length - 1];
        int d = input[input.length - 2];

        if (Math.abs(a+b) > Math.abs(c+d))
        {
            rs[0] = a;
            rs[1] = b;
        }
        else {
            rs[0] = c;
            rs[1] = d;
        }
        return rs;
    }

    public static int[] betterFindMaxProduct(int[] input)
    {
        int max_pos = -1, min_pos = Integer.MAX_VALUE, max_neg= 0, min_neg = Integer.MIN_VALUE;
        int current;
        for (int i = 0; i < input.length; i++)
        {
            current = input[i];
            if (current > -1)
            {
                if (current > max_pos) {
                    min_pos = max_pos;
                    max_pos = current;
                }
                if (current < max_pos) {
                    if (current > min_pos)
                        min_pos = current;
                }
            }
            else
            {
                if (current < max_neg) {
                    min_neg = max_neg;
                    max_neg = current;
                }
                if (current > max_neg) {
                    if (current < min_neg)
                        min_neg = current;
                }
            }
        }
        if (Math.abs(max_pos + min_pos) > Math.abs(max_neg + min_neg))
            return new int[]{max_pos, min_pos};
        else
            return new int[]{min_neg, max_neg};
    }
}
