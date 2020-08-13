import java.util.*;

//todo: continue from here,fix this
public class DuplicatesLinkedList {
    //page 50 -2.1
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2,2,  3, 4, 4));
        System.out.println(removeDups(list).toString());
    }

    public static LinkedList<Integer> removeDups(LinkedList<Integer> input)
    {
        HashSet<Integer> hash = new HashSet<Integer>();
        for (Integer item: input)
        {
            if(hash.contains(item))
            {
                input.remove(item);
            }
            else
            {
                hash.add(item);
            }
        }
        return  input;

    }
}
