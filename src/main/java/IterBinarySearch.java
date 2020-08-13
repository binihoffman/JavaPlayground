public class IterBinarySearch {
    //https://www.geeksforgeeks.org/binary-search/
    //[5, 7, 8, 12, 23, 32, 45]
    public static int findItemBinary(int[] array, int item)
    {
        int right = array.length - 1;//6
        int left = 0;
        while(left <= right)
        {
            int mid = left + (right - 1) / 2;
            if (item == array[mid])
                return mid;
            if (item > array[mid])
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return -1;

    }

    public static void main (String args[])
    {
        int[] arr = new int[]{5, 7, 8, 12, 23, 32, 45};
        System.out.println(findItemBinary(arr, 7));
        int[] arr1 = new int[]{5, 7, 8, 12, 32, 45};
        System.out.println(findItemBinary(arr1, 45));
    }
}
