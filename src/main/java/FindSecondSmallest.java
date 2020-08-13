import java.util.Arrays;

public class FindSecondSmallest {

    //https://www.geeksforgeeks.org/to-find-smallest-and-second-smallest-element-in-an-array/
    public static void main (String[] args)
    {
        int[] a = {8,3,1};
        int[] b= {1,2};
        int[] c= {-6, 6, -9, 10};
        System.out.println(Arrays.toString(find(a)));
        System.out.println(Arrays.toString(find(b)));
        System.out.println(Arrays.toString(find(c)));
    }

    public static int[] find(int[] input)
    {
        int sm0 = Math.min(input[0], input[1]);
        int sm1= Math.max(input[0], input[1]);
        for (int i = 2; i < input.length; i++)
        {
            if (input[i] < sm0)
            {
                sm1= sm0;
                sm0 = input[i];
            }
            else if (input[i] < sm1)
            {
                sm1 = input[i];
            }
        }

        int[] res = {sm0, sm1};
        return res;
    }
}
