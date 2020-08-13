public class Queue {
    Nodeq last;
    Nodeq first;
    public static void main(String[] args)
    {

    }

    public void enqueue(Nodeq input)
    {
       if (first == null)
           first = last;
        last.next = input;
    }
    public Nodeq dequeue()
    {
        return null;
    }




}
class Nodeq
{
    int element;
    Nodeq next;
}
