//page 52 - 3.2
public class MinStack {
    Node head;

    Node pop()
    {
        Node ret = head;
        head = head.next;

        return  ret;
    }

    void push(Node input)
    {
        if (input.element < head.min)
            input.min = input.element;
        else
            input.min = head.min;
        input.next = head;
        head = input;
    }

    public int getMin()
    {
        return head.min;
    }


    public static void main(String[] args)
    {
        MinStack st = new MinStack();
        st.head = new Node(10);
        st.head.min = 10;
        st.push(new Node(5));
        st.push(new Node(4));
        st.push(new Node(6));
        st.push(new Node(2));
        st.pop();


        System.out.println("min - " + st.getMin());
    }
}
