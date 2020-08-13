
import javafx.collections.transformation.SortedList;

import java.util.TreeMap;

public class TreeMapTest {

    public static void main (String[] args)
    {
        TreeMap<Integer, Integer> set = new TreeMap<Integer, Integer>();

        set.put(50,1);
        set.put(40,1);
        set.put(60,1);
        set.put(40,1);
        System.out.println("size - " +set.size());
        System.out.println("first - " +set.firstKey());
        System.out.println("Last - " +set.lastKey());
        for (int i = 0; i < set.size(); i ++)
        {
            System.out.println("element " + i +" - " +set.get(i));
        }

        System.out.println(set.get(88));
        if (null !=null)
            System.out.println("yey");
        if (null == null)
            System.out.println("pey");


    }
}
