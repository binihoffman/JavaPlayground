public class Stack {
    Node top;
    public void push(Node input)
    {
        input.next = top;
        top = input;
    }

    public int pop()
    {
        int ret = top.element;
        top = top.next;
        return ret;
    }
}

class Node
{
    int element;
    Node next;
    int min = Integer.MAX_VALUE;

    public Node(int input)
    {
        element = input;
    }
}
