public class ThreeStacksAraay {
    //page 52 -3.1
    public static void main(String[]args)
    {
        ThreeStacksAraay stack = new ThreeStacksAraay();
        stack.push(1, 1);
        stack.push(2, 2);
        stack.push(3, 3);
        System.out.println("St1 - " + stack.pop(1) + ", st2 - " + stack.pop(2) + ", st3 - " + stack.pop(3));
    }

    int size  = 300;
    int[] array = new int[size * 3];
    int[] index = {0, 300, 600};

    public void push(int stackNumber, int item)
    {
        array[index[stackNumber - 1]] = item;
        index[stackNumber - 1]++;
    }
    public int pop(int stackNumber)
    {
        int ret = array[index[stackNumber - 1] - 1];
        index[stackNumber - 1]--;
        return ret;
    }
}
