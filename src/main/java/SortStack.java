import java.util.Stack;

public class SortStack {
    //page 52 - 3.6
    public static Stack<Integer> sortStack(Stack<Integer> input)
    {
        Stack<Integer> result = new Stack<Integer>();
        while (!input.empty())
        {
            if (result.empty())
                result.push(input.pop());
            else if (input.peek() > result.peek())
            {
                result.push(input.pop());
            }
            else
            {
                Integer tmp = input.pop();
                input.push(result.pop());
                result.push(tmp);
            }
        }


        return result;
    }
    public static void main (String[] args)
    {
        Stack s = new Stack();
        s.push(5);
        s.push(4);
        s.push(1);
        s.push(8);
        System.out.println(sortStack(s).toString());
    }

}
