public class RecBinarySearch {
    //https://www.geeksforgeeks.org/binary-search/    public static void main(String args[])
    {
        RecBinarySearch ob = new RecBinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

    int binarySearch (int[] arr, int start, int finish, int element)
    {
        int mid = start + (finish - start) / 2;
        if (element == arr[mid])
            return start;
        if (element > arr[mid])
            return binarySearch(arr, mid + 1, finish, element);
        else return binarySearch(arr, start , mid - 1, element);
    }
}
