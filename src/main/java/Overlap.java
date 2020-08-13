import java.util.LinkedList;

public class Overlap {

    public static void main(String[] args)
    {
        LinkedList<int[]> list = new LinkedList<int[]>();
        int[] a = {1, 5};
        int[] b = {5, 9};
        int[] c = {10, 12};

        list.add(a);
        list.add(b);
        list.add(c);

        for (int[] item: list)
        {
            System.out.println(item.toString());
        }
        System.out.println(maxSimRes(list));
    }

    public static int maxSimRes(LinkedList<int[]> input)
    {
        int result = 0;
        int[] results = new int[24];
        for (int[] item: input)
        {
            int start = item[0];
            int end = item[1];
            for(int i = start; i <= end; i++)
            {
                if (results[i] == 0)
                {
                    results[i] = 1;
                }
                else
                {
                    results[i] = (results[i] + 1);
                }
            }
        }
        int max= results[0];
        for (int i = 0; i < results.length; i ++)
        {
            if (results[i] > max)
            {
                max = results[i];
                result = i;
            }

        }
        return result;
    }
}
